public class main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber; //girilen number değeri kaybedilmemeli
        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp /10; //her dongude number'ın son basamagını siler
        }
        if (number==reverseNumber)
            return true;

        else
            return false;
        }



    public static void main(String[] args) {

        System.out.println(isPalindrom(464))    ;

    }
}
