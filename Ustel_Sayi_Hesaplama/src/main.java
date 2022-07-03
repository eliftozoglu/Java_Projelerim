import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,r;


        Scanner input = new Scanner (System.in);
        System.out.print("Taban sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("üs sayısını giriniz: ");
        r = input.nextInt();


        // for döngüsü ile üstel sayı hesaplama

        int toplam = 1;
        for (int i = 1; i <= r; i++){
           toplam = toplam * n ;

        }
        System.out.println(n + "^" + r + ": " + toplam);



        //while döngüsü ile üstel sayı hesaplama

        int i = 1;
        toplam = 1;
        while (i <= r ) {

            toplam = toplam * n;
            i++;
        }
        System.out.println(n + "^" + r + ": " + toplam);


    }
}
