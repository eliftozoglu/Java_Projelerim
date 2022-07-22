import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        int n = input.nextInt();
        desen(n);
    }

    public static void desen(int n){
        int a = n;
        System.out.println(a);

        while(a>0){
            a=a-5;
            System.out.println(a);
        }

       while(a<=n){
           a=a+5;
           System.out.println(a);
           if(a==n) break;
       }
    }
}