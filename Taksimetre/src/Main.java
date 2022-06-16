import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double mesafe;
        double tutar;
        double km_basina_ucret = 2.20;
        int sabit = 20;

            //kullanıcıdan input alır
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi giriniz: ");
        mesafe = input.nextDouble();

            //tutar hesaplama
        tutar = km_basina_ucret * mesafe;

        boolean kontrol = (tutar < 20.0);
          double odeme = kontrol ? sabit : tutar;
        System.out.println("Ödenecek tutar: " + odeme + " TL");

    }
}
