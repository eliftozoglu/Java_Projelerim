import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /* 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

 0 + 1 = 1

 1 + 1 = 2

 1 + 2 = 3

 2 + 3 = 5

 3 + 5 = 8

 5 + 8 = 13

 13 + 8 = 21

 21 + 8 = 34 */

        int a = 0;
        int b = 1;
        int c;
        int fibonacci = 1;
        int toplm = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz : ");
        int elemanSayisi = input.nextInt();

        System.out.print(a+" ");
        System.out.print(b+" ");
       for (int i = 2; i < elemanSayisi; i++){
        c = a + b;
           System.out.print(c + " ");
           a = b;
           b = c;
        }
    }
}
