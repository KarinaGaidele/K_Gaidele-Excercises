package lt.techin;

public class PD3_3 {
    public static void main(String[] args) {
        float floatNumber = 0.2f; // Naudojame 'f' reišmę nurodant float tipo reikšmę
        double doubleNumber = 0.2;

        // Sudėjimas 10 kartų
        for (int i = 0; i < 10; i++) {
            floatNumber = floatNumber + 0.2f;
            doubleNumber = doubleNumber + 0.2;
        }

        System.out.println("Float rezultatas: " + floatNumber);
        System.out.println("Double rezultatas: " + doubleNumber);


    }
}
