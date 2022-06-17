import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fiz, tur, kim, muz, toplamNot, toplamDers;
        toplamDers = 0;
        toplamNot = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fiz = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        tur = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kim = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muz = input.nextInt();

        if ( mat > 0 && mat <100 ){
            toplamNot = toplamNot + mat;
            toplamDers++;
        }
        if ( fiz > 0 && fiz < 100 ){

            toplamNot += fiz;
            toplamDers++;
        }
        if ( tur > 0 && tur < 100 ){

            toplamNot += tur;
            toplamDers++;
        }
        if ( kim > 0 && kim < 100 ){

            toplamNot += kim;
            toplamDers++;
        }
        if ( muz > 0 && muz < 100 ){

            toplamNot += muz;
            toplamDers++;
        }


        double avg = toplamNot / toplamDers;



        if (avg <= 55){

            System.out.println("Sınıfta Kaldınız");
        }else {
            System.out.println( "Sınıfı Geçtiniz.");
        }
        System.out.println("Ortalamanız: " + avg);
    }
}