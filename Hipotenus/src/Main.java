import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kenar1, kenar2;
        double kenar3;

        Scanner input = new Scanner(System.in);
        //kullanıcıdan input al
        System.out.print("1. kenar uzunluğunu giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz: ");
        kenar2 = input.nextInt();

        //hipotenüs formulu
        // a^2 + b^2 = c^2
        kenar3 = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs:  " + kenar3);

    }
}
