import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
       */

        Scanner input = new Scanner(System.in);
        int number, counter = 0, basamakSayisi = 0;
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        int tempNumber = number;
        int basamakDegeri;
        int result = 0 ;
        int BasPow;


        //basamak sayısı bulma işlemi

        while (tempNumber != 0 ){

            tempNumber = tempNumber / 10;
            basamakSayisi++;
        }

        tempNumber = number;

        // sayının basamaklarını ayrı ayrı bulma işlemi
        while (tempNumber != 0){
            basamakDegeri = tempNumber % 10;
            BasPow = 1;
           for ( int i = 1; i <= basamakSayisi; i++) {

               BasPow *= basamakDegeri;

           }
           result += BasPow;
            tempNumber = tempNumber / 10;
        }

        System.out.println(result);
    }
}
