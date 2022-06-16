import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ürün fiyatları
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;

        double toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kilo: ");
        double armut_kg = input.nextDouble();
        System.out.print("Elma kilo: ");
        double elma_kg = input.nextDouble();
        System.out.print("Domates kilo: ");
        double domates_kg = input.nextDouble();
        System.out.print("Muz kilo: ");
        double muz_kg = input.nextDouble();
        System.out.print("Patlıcan kilo: ");
        double patlican_kg = input.nextDouble();

        toplam = (armut*armut_kg) + (elma*elma_kg) + (domates_kg* domates) + (muz*muz_kg) + (patlican_kg * patlican);

        System.out.println("Toplam Tutar: " + toplam);

    }
}
