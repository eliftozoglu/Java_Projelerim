import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz: ");
        int base = input.nextInt();
        System.out.println("Üs sayısını giriniz: ");
        int power = input.nextInt();

        int result = Power(base,power);
        System.out.println(result);
    }
    public static int Power(int base, int power) {
        if (power != 0){
            return (base * Power(base , power-1));
        } else{
            return 1;
        }
    }


}
