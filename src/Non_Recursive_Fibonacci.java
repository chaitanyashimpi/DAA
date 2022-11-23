import java.util.Scanner;

public class Non_Recursive_Fibonacci {

    public static void fib(int n){
        int n1 = 0, n2 = 1;
        int i = 0;

        while(i < n){
            System.out.print(n1+ " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i = i + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
    }
}
