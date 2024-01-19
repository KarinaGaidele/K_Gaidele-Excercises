/**
 * Parašykite Java metodą, kuris skaičiuoja kiek yra raidžių pateiktoje eilutėje.
 */

package lt.techin.pd7;

public class PD7_6 {
    public static void main(String[] args) {
        String text = ("Java s very hard language");
        int charCount = countCharsString(text);
        System.out.println(charCount);

    }
    public static int countCharsString(String text){
        int charCounter = 0;
        for (int i = 0; i < text.length();i++){
            char charArtIndex = text.charAt(i);
            if (Character.isLetter(charArtIndex)){
                charCounter++;
            }
        }

        return charCounter;

    }
}
