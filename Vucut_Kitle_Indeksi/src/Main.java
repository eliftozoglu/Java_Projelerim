import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //vucut kitle indeksi : kilo (kg) / boy (m) * boy (m)

        double vucutKitleIndeks ;

        double kilo;
        double boy;

        System.out.print("Lütfen boyunuzu giriniz (m): ");
        Scanner input = new Scanner(System.in);
        boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz (kg): ");
        kilo= input.nextDouble();
        vucutKitleIndeks = kilo / (boy * boy);
        System.out.println("Vücut kitle Indeksiniz: " + vucutKitleIndeks);
    }
}
