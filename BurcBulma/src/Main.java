import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        if(month == 1  && day <= 21) {
            System.out.println("Burcunuz Oğlak.");
        } else if (month == 1 ) {
            System.out.println("Burcunuz Kova.");
        } else if (month == 2 && day <= 19) {
            System.out.println("Burcunuz Kova.");
        } else if (month == 2 ) {
            System.out.println("Burcunuz Balık.");
        } else if (month == 3 && day <=20) {
            System.out.println("Burcunuz Balık.");
        } else if (month == 3) {
            System.out.println("Burcunuz Koç.");
        } else if (month==4 && day <= 20) {
            System.out.println("Burcunuz Koş.");
        } else if (month == 4) {
            System.out.println("Burcunuz Boğa.");
        } else if ( month == 5 && day <= 21) {
            System.out.println("Burcunuz Boğa.");
        } else if ( month == 5) {
            System.out.println("Burcunuz İkizler.");
        } else if (month==6 && day <= 22) {
            System.out.println("Burcunuz İkizler.");
        } else if (month == 6 ) {
            System.out.println("Burcunuz Yengeç.");
        } else if (month == 7 && day <= 23) {
            System.out.println("Burcunuz Yengeç.");
        } else if (month == 7 ) {
            System.out.println("Burcunuz Aslan.");
        } else if (month == 8 && day <=23) {
            System.out.println("Burcunuz Aslan.");
        } else if (month == 8) {
            System.out.println("Burcunuz Başak.");
        } else if (month==9 && day <= 22) {
            System.out.println("Burcunuz Başak.");
        } else if (month == 9 ) {
            System.out.println("Burcunuz Terazi");
        } else if ( month == 10 && day <= 23) {
            System.out.println("Burcunuz Terazi.");
        } else if ( month == 10) {
            System.out.println("Burcunuz Akrep.");
        } else if (month == 11 && day <= 22) {
            System.out.println("Burcunuz Akrep.");
        }else if (month == 12 && day <= 21) {
            System.out.println("Burcunuz Yay.");
        }else if (month == 12) {
                System.out.println("Burcunuz Oğlak");
    }else
            System.out.println("Yanlış ay veya gün seçimi yaptınız.");
        }

    }

