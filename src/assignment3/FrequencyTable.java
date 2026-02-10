package assignment3;
import java.util.Scanner;
public class FrequencyTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("How many dice do you want to roll?");
        int dice = scanner.nextInt(); 
        int sumRolls = 0;
        int[] amountValues = new int[6 * dice];
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= dice; j++) {
                sumRolls += (Math.random() * 6 + 1);
        }
            amountValues[sumRolls - 1] = amountValues[sumRolls - 1] + 1;
            sumRolls = 0; 
         }
        System.out.println("Your amount of rolls of each type is ");
        for (int k = (dice - 1); k < 6 * dice; k++) {
        System.out.println((k + 1) + ": " + amountValues[k] + " ");
        }
    }
}
