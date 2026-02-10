import java.util.Scanner;

public class twodcode {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        int rows = scanner.nextInt();
        System.out.println("How many columns do you want?");
        int columns = scanner.nextInt();
        int[][] array1 = new int[rows][columns];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println("What value goes in row " + i + " and column " + j);
                int fillNumber = scanner.nextInt();
                array1[i][j] = fillNumber;
            }
        }
        for (int k = 0; k < array1.length; k++) {
                System.out.println();
            for (int l = 0; l < array1[k].length; l++) {
                System.out.print(array1[k][l] + " ");
        }
}
    }
}


