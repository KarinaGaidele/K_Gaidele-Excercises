/**
 * Parašykite Java metodą, kuris grąžina skaičiaus kvadratą.
 */

package lt.techin.pd7;

public class PD7_1 {
    public static void main(String[] args) {
        System.out.println(getNumPow(10));
    }
    public static int getNumPow(int number){
        //return Math.pow(number, 2)
        return number * number;
    }

}

