import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + "asal");
        }else{
            System.out.println(number + " asal değil");
        }
    }

    public static boolean isPrime(int number, int i){
        if(number%i == 0)
            return false;
        if (number==2)
            return  true;
        if(i*i>number){
            return true;

        }
        return isPrime(number,i+1);
    }
}
