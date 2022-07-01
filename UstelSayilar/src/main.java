import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        int i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
            //girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program
        /*
        for (int i = 1; i<n; i=i*2){
            System.out.println(i);
        }

        */
            //girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program

        System.out.println("Girilen sayıya kadar olan 4'ün üsleri: ");

        for (i = 1 ; i<n; i=i*4){

                System.out.println(i);
        }

        System.out.println("Girilen sayıya kadar olan 5'ün üsleri: ");

            for (j = 1;j<n;j=j*5){
                System.out.println(j);
        }
    }
}
