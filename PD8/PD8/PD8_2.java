/**
 * Sukurkite klasę / objektą kuris moka rasti visus pirminius skaičius pateiktame skaičių diapazone.
 */

package lt.techin.pd8;

public class PD8_2 {
    public static void main(String[] args) {
        int number1 = 197;
        int number2 = 198;
        int number3 = 199;
        boolean isPrimeNumber = isPrime(number1);
        boolean isPrimeNumber1 = isPrime(number2);
        boolean isPrimeNumber2 = isPrime(number3);

        System.out.println(isPrimeNumber);
        System.out.println(isPrimeNumber1);
        System.out.println(isPrimeNumber2);
    }

    private static boolean isPrime(int number) {
        if (number <=1 ){
            return false;
        }
        if (number <= 3){
            return true;
        }
        if (number % 2 ==0 || number % 3 ==0){
            return false;
        }
        for (int i = 5; i * i <= number; i +=6 ){
            if (number % i ==0 || number % (i + 2) ==0){
                return false;
            }

        }
        return true;
    }

}

