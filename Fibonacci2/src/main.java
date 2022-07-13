public class main {
   static int Fibonacci (int n){
        //1 1 2 3 5 8 13 21
       //f(1)= 1 , f(2)=1 , f(3) = f(2)+f(3) , f(n) = f(n-1) + f(n-2)

            if (n==1 || n ==2)
                return 1;

        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {

       int m;
       
        System.out.println(Fibonacci(6));
    }

}
