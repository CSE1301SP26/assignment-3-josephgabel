

import java.util.Scanner;

public class SymmetricalImage {
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        int rows = scanner.nextInt();
        System.out.println("How many columns do you want?");
        int columns = scanner.nextInt();

        int[][] array1 = new int[rows][columns];
        for (int q = 1; q <= (rows * columns / 4); q++) {
        int randomRow = (int)(Math.random() * rows); 
        int randomColumn = (int)(Math.random() * columns);
        array1[randomRow][randomColumn] = 1;
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[(array1.length - 1 - i)][j] == 1) {
                    array1[i][j] = 1;
            }
            }
        }
        for (int k = 0; k < array1.length; k++) {
                System.out.println();
            for (int l = 0; l < array1[k].length; l++) {
                if (array1[k][l] == 1) {
                    System.out.print("*");
                }
                else  {
                System.out.print(" ");
                }
       
        }
}
scanner.close();
    }
}
