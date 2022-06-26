
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner (System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        year = input.nextInt();


            //if-else ile yapılışı

        if (year%12==0) {
            System.out.println("Maymun");
        } else if (year%12==1) {
            System.out.println("Horoz");
        }else if (year%12==2) {
            System.out.println("Köpek");
        }else if (year%12==3) {
            System.out.println("Domuz");
        }else if (year%12==4) {
            System.out.println("Fare");
        }else if (year%12==5) {
            System.out.println("Öküz");
        }else if (year%12==6) {
            System.out.println("Kaplan");
        }else if (year%12==7) {
            System.out.println("Tavşan");
        }else if (year%12==8) {
            System.out.println("Ejderha");
        }else if (year%12==9) {
            System.out.println("Yılan");
        }else if (year%12==10) {
            System.out.println("At");
        } else if (year%12==11) {
            System.out.println("Koyun");
        }else {
            System.out.println("Tekrar Deneyiniz.");
        }

        //switch-case ile yapılışı


        switch (year%12) {

            case 0 :
                System.out.println("Maymun");
                break;
            case 1 :
                System.out.println("Horoz");
                break;
            case 2 :
                System.out.println("Köpek");
                break;
            case 3 :
                System.out.println("Domuz");
                break;
            case 4 :
                System.out.println("Fare");
                break;
            case 5 :
                System.out.println("Öküz");
                break;
            case 6 :
                System.out.println("Kaplan");
                break;
            case 7 :
                System.out.println("Tavşan");
                break;
            case 8 :
                System.out.println("Ejderha");
                break;
            case 9 :
                System.out.println("Yılan");
                break;
            case 10 :
                System.out.println("At");
                break;
            case 11 :
                System.out.println("Koyun");
                break;
            default :
                System.out.println("Tekrar Deneyiniz.");
        }
        }


    }

