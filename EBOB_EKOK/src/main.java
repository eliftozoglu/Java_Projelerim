import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1, n2;
        int min;
        int ekok = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        //birim maliyet 18 birim
        int ebob = 0;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        //birim maliyet 14 birim
        for (int k = min; k >= 1; k--) {
            if (n1 % min == 0 && n2 % min == 0) {
                ebob = k;       //tersten bakarken ilk bulduğumuz ortak bölen ortak bölenlerin en büyüğüdür. Bunu bulduktan sonra döngüden çıkar.
                break;
            }
        }

        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
        }


        System.out.println("ebob" + ebob);
        System.out.println("ekok" + ekok);

        // ekok = (n1*n2)/ebob;


    }
}
