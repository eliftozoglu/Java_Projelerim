import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :"); //satır sayısı
        int n = klavye.nextInt();

        for (int i =1; i <= n ; i++) {  //kaç satır olacak

            for (int k = 1; k <= (n - i); k++) { // kaç boşluk olacak
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) { //kaç yıldız olacak
                System.out.print("*");
            }
            System.out.println(" ");

        }




        for (int i = 1; i <= n-1 ; i++) {  //kaç satır olacak

            for (int j = 1; j <= i ; j++) { // kaç boşluk olacak
                System.out.print(" ");
            }


                for (int k = 1; k <= (2 * n - (2 * i + 1)); k++) { //kaç yıldız olacak
                    System.out.print("*");

                }

                System.out.println(" ");


        }


    }
}
