//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//import java.util.Arrays;
import java.util.Scanner;

public class Tripstrapstrull {

    static ArrayList<Integer> playerPos = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPos = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] table = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

        printTable(table);

        while(true) {
            System.out.println("Valige koht 1-9:");
            Scanner scan = new Scanner(System.in);
            //System.out.println("Valige koht 1-9:");
            int pickedNumber = scan.nextInt();
            while(playerPos.contains(pickedNumber) || cpuPos.contains(pickedNumber)) { //kui see koht on võetud, siis kasutaja valib uue koha
                System.out.println("Koht võetud! Vali uus koht");
                pickedNumber = scan.nextInt();
            }

            placeSymbol(table, pickedNumber, "player");

            Random random = new Random();
            int cpuNumber = random.nextInt(9) + 1; //slp et ta võtaks 1-9
            while(playerPos.contains(cpuNumber) || cpuPos.contains(cpuNumber)) { //arvuti valib seni, kuni leiab uue koha
                cpuNumber = random.nextInt(9) + 1;
            }
            placeSymbol(table, cpuNumber, "CPU");

            printTable(table);

            String gameResult = checkStatus();
            System.out.println(gameResult);
        }
    }
    public static void printTable(char [][] table){
        for(char[] row : table) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placeSymbol(char[][] table, int pos, String user) {
        
        char symbol = ' ';
        if(user.equals("player")) {
            symbol = 'X';
            playerPos.add(pos);
        } else if(user.equals("CPU")) {
            symbol = 'O';
            cpuPos.add(pos);
        }

        switch(pos) {
            // 2 dimensional asetus boardil
            case 1:
                table[0][0] = symbol;
                break;
            case 2:
                table[0][2] = symbol;
                break;
            case 3:
                table[0][4] = symbol;
                break;
            case 4:
                table[2][0] = symbol;
                break;
            case 5:
                table[2][2] = symbol;
                break;
            case 6:
                table[2][4] = symbol;
                break;
            case 7:
                table[4][0] = symbol;
                break;
            case 8:
                table[4][2] = symbol;
                break;
            case 9:
                table[4][4] = symbol;
                break;
            }
    }

    public static String checkStatus() { //siin jätab listi meelde kasutaja ja arvuti käigud ja checkib kas keegi on "võitja" või mitte
        //nende asetustega saab võita
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);
        List leftCross = Arrays.asList(1, 5, 9);
        List rightCross = Arrays.asList(3, 5, 7);

        List<List> win = new ArrayList<List>();
        win.add(topRow);
        win.add(middleRow);
        win.add(bottomRow);
        win.add(leftColumn);
        win.add(middleColumn);
        win.add(rightColumn);
        win.add(leftCross);
        win.add(rightCross);

        for (List l : win) {
            if(playerPos.containsAll(l)) { //kui mängijal on tabelis (listis) mingi ülal toodud asetuse võimalus, siis võidab
                return "Palju õnne, sa võitsid!";
            } else if(cpuPos.containsAll(l)) {
                return "Kahjuks kaotasid";
            } else if(playerPos.size() + cpuPos.size() == 9) { //kui väljal pole enam ruumi sest nende listide summa annab 9 -> viik
                return "Mäng jäi viiki. Proovi uuesti!";
            }
        }

        return "";
    }
}
