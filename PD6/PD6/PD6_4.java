/**
 * Parašykite programą, kuri randa kiek kartu pasikartoja pasirinktas masyvo elementas.
 */

package lt.techin.pd6;

public class PD6_4 {
    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 3, 3, 3, 4, 5, -10, 3};
        int targetNumber = 3;

        int occurenceCounter = 0;
        for (int element : originalArray){
            if (element == targetNumber){
                occurenceCounter++;
            }
        }
        System.out.println(occurenceCounter);
    }
}

