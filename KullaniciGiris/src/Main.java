import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password, password2;
       int t;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı");
        }else{
            System.out.println("Hatalı kullanıcı adı ve şifre. Tekrar deneyiniz ya da şifrenizi sıfırlamak için 1'i seçiniz.");
            t = input.nextInt();

            if  ( t ==1 ) {
                System.out.println("Yeni şifrenizi giriniz: (Yeni şifreniz eski şifreniz ile aynı olmamalıdır) ");

                Scanner input2 = new Scanner(System.in);
                password = input2.nextLine();

                     if (password.equals("java123")){

                         System.out.println("Şifreniz eski şifreniz ile aynı olamaz");
                     }else{
                         System.out.println("Şifreniz başarıyla oluşturuldu");
                     }

            } else {
                    System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
                }
            }
        }


    }

