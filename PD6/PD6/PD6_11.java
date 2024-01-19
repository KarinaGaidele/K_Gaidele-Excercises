/**
 * Parašykite programą, kuri paima skaičių masyvą ir grąžina trečią mažiausią masyvo skaičių.
 */

package lt.techin.pd6;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PD6_11 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 7, 5, 6, 8};

        Arrays.sort(numbers);//rusiavimas
        System.out.println("Surusiuoti skaiciai: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        if (numbers.length >= 3) {
            int thirdMin = numbers[2]; // Trečia reikšmė yra trečioje pozicijoje po rūšiavimo (nes rūšiavimas pradedamas nuo 0)
            System.out.println("Trečias mažiausias skaičius yra: " + thirdMin);
        }

    }}
