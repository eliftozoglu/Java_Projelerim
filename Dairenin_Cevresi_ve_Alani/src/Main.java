import java.util.Arrays;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yaricap;
        int merkez_aci;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = input.nextInt();


        double alan = pi * yaricap * yaricap ;
        double cevre = 2 * pi * yaricap;

        System.out.println("Dairenin alanı: " + String.format("%.2f", alan) + "\nDairenin çevresi: " +  String.format("%,2f", cevre) );
        System.out.print("Dairenin merkez açısını giriniz: ");
        merkez_aci = input.nextInt();
        double daire_dilim_alani = (pi*(yaricap*yaricap)*merkez_aci ) / 360;
        System.out.println( "Açısı " + merkez_aci + " derece olan Daire diliminin alanı: " + String.format("%,2f", daire_dilim_alani) );
        }

}
