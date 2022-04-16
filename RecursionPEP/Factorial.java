package RecursionPEP;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        return n*fnm1;
    }
    
}
