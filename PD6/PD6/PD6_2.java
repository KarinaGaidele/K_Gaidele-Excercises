/**
 * Parašykite programą, kuri išveda pirmą ir paskutinį masyvo elementus.
 */

package lt.techin.pd6;

public class PD6_2 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        String [] names = {"Tomas", "Akvile", "Jonas"};
        System.out.println(names[0]);
        System.out.println(names[names.length -1]);
        System.out.println(originalArray[0]);
        System.out.println(originalArray[originalArray.length - 1]);
    }
}

