
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();
        double total = 0;

        // harmonik sayılar: 1 + (1/2) + (1/3) + (1/4) + (1/n)

        for (double i = 1; i <= number; i++) {

            total += (1 / i);

        }
        System.out.println(total);
    }
}