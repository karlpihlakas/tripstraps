//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;
import java.util.Random;
//import java.util.Arrays;
import java.util.Scanner;

public class Tripstrapstrull {

    public static void main(String[] args) {

        char[][] table = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

        printTable(table);

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Valige koht 1-9:");
            int pickedNumber = scan.nextInt();

            placeSymbol(table, pickedNumber, "player");

            Random random = new Random();
            int cpuNumber = random.nextInt(9) + 1; //slp et ta võtaks 1-9
            placeSymbol(table, cpuNumber, "CPU");

            printTable(table);
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

    public static void placeSymbol(char[][] table, int pickedNumber, String user) {
        
        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
        } else if(user.equals("CPU")) {
            symbol = 'O';
        }

        
        switch(pickedNumber) {
            case 1:
                table[0][0] = symbol;
                break;
            case 2:
                table[0][2] = symbol;
                break;
            case 3:
                table[0][3] = symbol;
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
}
