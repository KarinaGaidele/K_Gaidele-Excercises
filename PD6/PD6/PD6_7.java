/**
 * Parašykite programą sveikųjų skaičių masyvo sumai ir sandaugai apskaičiuoti.
 */

package lt.techin.pd6;

public class PD6_7 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 3, 4, 5, -10, 3};
        int sum = 0;
        int multiplication = 1;

        for (int element : numbers) {
            sum += element;
            multiplication *= element;

        }
        System.out.println("Sum: " +sum);
        System.out.println("Multiplication: " + multiplication);
    }
}


