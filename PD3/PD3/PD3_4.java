package lt.techin;

public class PD3_4 {
    public static void main(String[] args) {
        boolean firstBoolean = true;
        boolean secondBoolean = false;

        // Logine operacija AND (&&)
        boolean resultAnd = firstBoolean && secondBoolean;

        // Logine operacija OR (||)
        boolean resultOr= firstBoolean || secondBoolean;

        // Logine operacija NOT (!)
        boolean resultNot_first = !firstBoolean;
        boolean resultNot_second = !secondBoolean;

        // Rezultatų spausdinimas
        System.out.println("resultAnd rezultatas: " + resultAnd);
        System.out.println("resultOr rezultatas: " + resultOr);
        System.out.println("resultNot pirmo kintamojo rezultatas: " + resultNot_first);
        System.out.println("resultNot antro kintamojo rezultatas: " + resultNot_second);
    }
}
