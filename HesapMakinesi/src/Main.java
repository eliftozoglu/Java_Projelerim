import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int select;
        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1+n2);
                    break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if (n2==0){
                    System.out.println("Sıfıra bölünme hatası. Tekrar deneyiniz.");
                }
                else {
                    System.out.println(String.format("%.2f", (n1 / n2)));
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz!");





        }
        }
    }
