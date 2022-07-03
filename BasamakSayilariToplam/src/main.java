import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int number, total=0, basamakDegeri;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();
        System.out.println("Girilen sayının basamakları: ");
        while (number !=0){
            basamakDegeri = number % 10;
            number = number /10;
          total += basamakDegeri;
            System.out.print(basamakDegeri + " ");
        }
        System.out.println("\nGirilen sayının basamakları toplamı: "+ total);
    }
}
