import java.util.Scanner;



public class main {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();


        // bu kod girilen sayıya kadar olan çift sayıları bulmaktadır.
        /*
        for(int i=0; i<=number;i++){

            if (i%2==0) System.out.print(i + " ");

        } */


        //bu kod 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplamaktadır
        int count=0;
        int sum = 0;
        int avg;
        System.out.println("Girilen sayıya kadar olan sayılardan 3'e ve  4'e bölünen sayılar:");
        System.out.println();
        for(int i=1; i<=number;i++){

            if (i%4==0 && i%3==0) {
                    sum += i;
                    count++;

                System.out.print(i+",");
            }
        }
        avg = sum/count;

        System.out.println("\n\nGirilen sayıya kadar olan sayılardan 3'e ve 4'e bölünen sayıların ortalaması: " + avg);
    }
}
