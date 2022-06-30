import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int n;
        int total = 0 ;
        Scanner input = new Scanner(System.in);



        // Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        /*do{

            System.out.println("Sayı giriniz: ");
            n = input.nextInt();

            if (n%2==1);

            total += n;

        } while (n>0);

*/
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        boolean checkEven = true;
        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();

                if (n % 4 == 0){
                    total += n;

                }

            if (n%2==1){
                break;
            }

        }while(n>0);

        System.out.println("Toplam: " + total);
    }
}
