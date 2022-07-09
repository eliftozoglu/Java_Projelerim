import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String userName, password;
        int attempt = 3;
        int balance = 1500;
        int select;

        while(attempt > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıc adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if ( userName.equals("java") && password.equals("dev123")) { //string olan bir değişkeni kontrol etmek içn == yerine .equals kullan
                System.out.println("Sisteme giriş yapılıyor..");
                System.out.println("Merhaba. Kodluyoruz bankasına hoşgeldiniz. ");
                do {

                    System.out.println(
                            "1-Para yatırma\n" +
                                    "2-Para çekme\n" +
                                    "3-Bakiye sorgulama\n" +
                                    "4-Çıkış yap\n"+
                            "Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select=input.nextInt();
                    if (select == 1) {
                        System.out.println("Mevcut miktar: " + balance);
                        System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz: ");
                        int money = input.nextInt();
                        balance +=money;
                        System.out.println("Yatırılan miktar: " + money);
                        System.out.println("Toplam miktar: " + balance);
                    } else if (select==2) {
                        System.out.println("Mevcut miktar: " + balance);
                        System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
                        int withdraw = input.nextInt();
                        if(withdraw<balance) {
                            balance -= withdraw;
                            System.out.println("Çekilecek miktar: " + withdraw);
                            System.out.println("Kalan miktar: " + balance);
                        }else {
                            System.out.println("Çekmek istediğini miktar bakiyenizden fazla.");
                        }
                    } else if (select ==3) {
                        System.out.println("Bakiyeniz: " + balance);

                    } else if (select==4) {
                        System.out.println("Çıkış yapıyor.");
                    } else{
                        System.out.println("Geçersiz seçim yaptınız.");
                    }

                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere..");
                break;
            }
            else {
                attempt--;
                System.out.println("Hatalı giriş yaptınız. Kalan hakkınız: " +  attempt);
                if (attempt==0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
            }





        }

    }
}
