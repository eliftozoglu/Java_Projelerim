import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n1, n2;
        int min;
        int ekok = 0;
        int ebob = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        //minimum bul
        min = Math.min(n1, n2);

        //EBOB
        int count = 1;
        while (count < min) {
            if (n1 % count == 0 && n2 % count == 0) {
                ebob = count;
            }
            count++;
        }
        System.out.println("EBOB: " + ebob);

        //EKOK
        while (count <= (n1 * n2)) {
            if (count % n1 == 0 && count % n2 == 0) {
                ekok = count;
            }
            count++;
        }
        System.out.println("EKOK : " + ekok);

    }
}