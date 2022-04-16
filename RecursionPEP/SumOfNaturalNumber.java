package RecursionPEP;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
       System.out.println( sum(n));

    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    
}
