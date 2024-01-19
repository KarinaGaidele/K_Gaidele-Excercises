/**
 * Parašykite programą, kuri suskaičiuoja, kiek yra neigiamų skaičių duotame masyve.
 */

package lt.techin.pd6;

import java.util.Arrays;

public class PD6_12 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 7, 5, 6, 8, -5, -6, -7};

        Arrays.sort(numbers);
        System.out.println("Surusiuoti skaiciai: ");
        for (int num : numbers) {
            System.out.println(num + " ");

            for (int numNegative : numbers) {
                if (num < 0) {
                    int negativeCount;

            }
            System.out.println("Masyve yra: " + num + "neigiamu skaiciu" );
        }
    }
}}