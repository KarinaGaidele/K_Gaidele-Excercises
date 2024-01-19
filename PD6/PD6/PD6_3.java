/**
 * Parašykite programą, kuri paverčia masyvą simbolių eilute (String).
 */

package lt.techin.pd6;

public class PD6_3 {
    public static void main(String[] args) {
        String [] names = {"Tomas", "Akvile", "Jonas"};
        String namesString = "";
        for (int i = 0; i< names.length; i++){
            namesString += names[i]; //namesString = namesString + names [i]
        }
        System.out.println(namesString);
        StringBuilder boxsForStrings = new StringBuilder();
        for (String element : names) //for each efektyviau, concat su += neefektyvu
        {
            boxsForStrings.append(element);
        }
        System.out.println(boxsForStrings);
    }

}

