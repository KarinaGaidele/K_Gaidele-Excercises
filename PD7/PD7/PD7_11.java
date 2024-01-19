/**
 * Parašykite Java metodą, kuris suranda ilgiausią žodį pateiktoje eilutėje.
 */

package lt.techin.pd7;

public class PD7_11 {
    public static void main(String[] args) {
        String text = ("All I need is to learn Java somehow!");
        String longestWord = findLongestWord (text);
        System.out.println("LongestWord:   " + longestWord);
    }

    private static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String longestWord = " ";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
