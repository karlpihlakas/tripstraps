//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class Tripstrapstrull {

    public static void main(String[] args) {
        while(true) {
            char[][] row1 = new char[][]{{' '}, {' '}, {' '}};
            char[][] row2 = new char[][]{{' '}, {' '}, {' '}};
            char[][] row3 = new char[][]{{' '}, {' '}, {' '}};
            System.out.println(Arrays.deepToString(row1));
            System.out.println(Arrays.deepToString(row2));
            System.out.println(Arrays.deepToString(row3));
            System.out.println("Valige number 1-9");
            Scanner scan = new Scanner(System.in);
            int pickedNumber = scan.nextInt();
            System.out.println(pickedNumber);
        }
    }
}
