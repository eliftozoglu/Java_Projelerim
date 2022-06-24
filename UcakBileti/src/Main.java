import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age, km, travel_type;
        double price_per_km = 0.10;


        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Gideceğiniz mesafeyi giriniz (KM); ");
        km = input.nextInt();
        if (km < 0 ) {
            System.out.println("Hatalı veri girdiniz.");
        }else {
            System.out.println("Yolculuk tipini seçiniz:\n1-Tek Yön \n2-Gidiş-Dönüş");
        }
        travel_type = input.nextInt();
        double total_price = price_per_km * km;
        double discount_12 = 0.50;
        double discount_12_24 = 0.10;
        double discount_65 = 0.30;
        double discount;


        if (!(travel_type == 2 || travel_type == 1)) {

            System.out.println("Hatalı yolculuk seçimi yaptınız. Yolculuk tipi için tekrar seçim yapınız.");

        }

        if (travel_type==1) {
            if (age<12){
             discount = total_price * discount_12;
            total_price = total_price - discount;
                System.out.println("Tutar : " + total_price);
            }
            else if (age >= 12 && age <24) {
                discount = total_price * discount_12_24;
                total_price = total_price - discount;
                System.out.println("Tutar : " + total_price);
            }
            else if (age > 65) {
                discount = total_price * discount_65;
                total_price = total_price - discount;
                System.out.println("Tutar : " + total_price);

            } else {
                System.out.println("Tutar : " + total_price);
            }
        }


        if (travel_type==2){
            total_price = (price_per_km * km)*2;
            double discount_round = 0.20;

            if (age<12){
                discount = total_price * discount_12;
                total_price = total_price - discount;
                total_price = total_price - (total_price*discount_round);
                System.out.println("Tutar : " + total_price);
            }
            else if (age >= 12 && age <24) {
                discount = total_price * discount_12_24;
                total_price = total_price - discount;
                total_price = total_price - (total_price*discount_round);
                System.out.println("Tutar : " + total_price);
            }
            else if (age > 65) {
                discount = total_price * discount_65;
                total_price = total_price - discount;
                total_price = total_price - (total_price*discount_round);
                System.out.println("Tutar : " + total_price);

            } else {
                total_price = total_price - (total_price*discount_round);
                System.out.println("Tutar : " + total_price);
            }


        }

    }

}