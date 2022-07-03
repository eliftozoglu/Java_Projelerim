import com.sun.xml.internal.ws.encoding.policy.MtomPolicyMapConfigurator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        int r;
        long r_fak = 1;
        long combination;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı (n) sayısını giriniz C(n, r) :" );
        n = input.nextInt();
        System.out.print("Seçim sayısı (r) sayısını giriniz C("+n+", r) : " );
        r= input.nextInt();
        if (r > n ) System.out.println("Lütfen r sayısını n sayısından küçük giriniz.");
        System.out.println( "C("+n+", "+r+")");
        //faktoriyel hesaplayan program n! = n*(n-1)*(n-2)*(n-3) ...

        /*
        int fak=1;
        for (int i = 1 ; i <= n; i++){
            fak = fak*i;
        }
        */

        //kombinasyon hesaplayan program C(n,r) = n! / (r! * (n-r)!)
        //kombinasyon hesaplamasında bölünen değer = girilen değerden (n-r)ye kadar olan değerlerin çarpımı, bölen değer = r!
        //bu alfgoritmada (n-r)! değerleri sadeleşiyor

        for (long i = 1 ; i <= r; i++){
            r_fak = r_fak*i;
        }

        long toplam=1;

        for(long i = n ; i > (n-r) ; --i) {

            toplam *= i;


        }
            combination = toplam / r_fak;
            System.out.println(combination);


    }
}
