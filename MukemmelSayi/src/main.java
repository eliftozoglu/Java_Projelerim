import java.util.Scanner;
    //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
    // toplamı kendisine eşit olan sayıya mükemmel sayı denir.
public class main {
    public static void main(String[] args) {
        int total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int number = input.nextInt();

        for ( int i = 1 ; i < number; i++){
          if(number%i==0){
              total += i;
          }
        }
        if (total==number){
            System.out.println(number + " bir mükemmel sayıdır.");
        }else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
    }
}
