package lt.techin;
import java.util.Scanner;
public class PD5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int usersNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Result is:  ");
        int i = 0;
        while (i <= usersNumber) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + ", ");
            }
            i++;
        }

    }
}
