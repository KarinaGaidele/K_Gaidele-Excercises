/**
 * Parašykite Java metodą, kuris konvertuoja pateiktos eilutės kiekvieno žodžio pirmąją raidę į didžiąsias raides.
 */
//realizacija, kuriam masyva. Regex, regular expression - filtras, pagal kuria filtruojama informacija

package lt.techin.pd7;

public class PD7_10 {
    public static void main(String[] args) {
    String text = "hello world";
        System.out.println(capitalizeFirstCharOfWord(text));

    }

    private static String capitalizeFirstCharOfWord(String text) {
        String [] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words){
            if (!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
                result.append("  ");
            }

        }
        return result.toString().trim(); //trim yra stringo metodas, kuris istrina pirma ir paskutini tarpa
    }
}
