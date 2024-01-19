package lt.techin;

public class PD3_2 {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 200;

        // Sudedame byte ir short kintamuosius
        int suma = myByte + myShort;

        // Atnimame short kintamąjį iš byte kintamojo
        int skirtumas = myShort - myByte;

        // Sudauginame byte ir short kintamuosius
        int sandauga = myByte * myShort;

        // Rezultatus išvedame į konsolę
        System.out.println("Suma: " + suma);
        System.out.println("Skirtumas: " + skirtumas);
        System.out.println("Sandauga: " + sandauga);
    }
}
