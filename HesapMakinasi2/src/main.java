
import java.util.Scanner;

public class main {
    //SUMMATION
    static int sum (int a, int b){

        return a+b;
    }
    //SUBSTRACTION
    static int minus (int a, int b) {
        int result=a-b;
        return result;
    }
    //Multiplication
    static int times(int a, int b){
        int result = a*b;
        return result;
    }
    //Disivion
    static int division (int a, int b){
        if(b==0){
            return 0;
        }
        int result = a/b;
        return result;
    }
    //Power
    static int power (int a, int b){
        int result = 1;
    for ( int i=1; i<=b;i++){
        result *= a;
    }
    return result;
    }
    //MOD
    static int mod(int a, int b){
        int result = a % b;
        return result;
    }
    //dikdortgenin çevresi
    static void rectangle(int a, int b){
        System.out.println("Dikdörtgenin Çevresi : " + (2*(a+b)));
        System.out.println("Dikdörtgenin Alanı : " + (a*b));

    }








    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Üslü Sayı\n" +
                "6-Mod alma\n" +
                "7-Dikdörtgen alan ve çevre\n" +
                "0-Çıkış\n";
        System.out.println(menu);

            while(true) {
                System.out.println("Bir işlem seçiniz: ");
                select = input.nextInt();
                if (select == 0) {
                    break;
                }
                System.out.println("Birinci sayıyı giriniz: ");
                int a = input.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int b = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Sonuç: " + sum(a, b));
                        break;
                    case 2:
                        System.out.println("Sonuç: " + minus(a, b));
                        break;
                    case 3 :
                        System.out.println("Sonuç: " + times(a, b));
                    case 4:
                        if  (division(a,b)==0){
                            System.out.println("Sıfıra bölünme hatası");
                        }else {
                            System.out.println("Sonuç: " + division(a, b));
                        }
                        break;
                    case 5 :
                        System.out.println("Sonuç: " + power(a, b));
                        break;
                    case 6 :
                        System.out.println("Sonuç: " + mod(a, b));
                        break;
                    case 7:
                        rectangle(a,b);
                        break;
                    default :
                        System.out.println("Geçersiz işlem");
                }
            }

    }
}
