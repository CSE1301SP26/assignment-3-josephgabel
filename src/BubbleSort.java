import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many columns do you want?");
        int columns = scanner.nextInt();
        int[] array1 = new int[columns];
        for (int i = 0; i < array1.length; i++) {
                System.out.println("What value goes in column " + i);
                int fillNumber = scanner.nextInt();
                array1[i] = fillNumber;
            }
            System.out.println("Here are the original values");
        for (int k = 0; k < array1.length; k++) {
                System.out.print(array1[k] + " ");
        }

         for (int m = 0; m < array1.length; m++) {
             for (int n = 1; n < array1.length - m; n++) {
                if (array1[n] < array1[n - 1]) {
                int store = array1[n];
                array1[n] = array1[n - 1];
                array1[n - 1] = store;
                }
            }
        }
            System.out.println("Here are the newly arranged values");
            for (int p = 0; p < array1.length; p++) {
                System.out.print(array1[p] + " ");
        }
    }
}
