import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int max = 0, min = 0, number;
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int Num_count = input.nextInt();

        for (int i = 1; i <= Num_count; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();
            if(i==1) { //initialize
                min = number;
                max = number;
            }
            if( number < min) {
                min = number;
            }
            if(number >  max) {
                max = number;
            }

        }
        System.out.println("min : " + min + "\nmax: " + max);
    }
}