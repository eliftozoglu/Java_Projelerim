
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fiz = input.nextInt();
        System.out.print("kimya notunuz: ");
        kim = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        tur = input.nextInt();
        System.out.print("Tarih notunuz: ");
        tar = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muz = input.nextInt();

        int toplam = mat + fiz + kim + tur + tar + muz;
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız: " + sonuc);

        boolean kalma = (sonuc < 60.0);

        String str = (kalma) ? "Sınıfta kaldı" : "Sınıfı geçti";
        System.out.println(str);

    }

}
