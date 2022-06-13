import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran;
        boolean tutarAraligi;
        //kullanıcıdan veri al
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();

        //veri hangi aralıkta?

        tutarAraligi = (tutar > 0 ) && (tutar < 1000);
        kdvOran = tutarAraligi ? 0.18 : 0.08;

        //KDV miktarını hesapla ve ekrana yaz

        double kdvli_fiyat =  tutar + (tutar * kdvOran);

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li fiyat: " + kdvli_fiyat);
        System.out.println("KDV tutarı: " + kdvOran);

    }
}
