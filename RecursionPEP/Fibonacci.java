package RecursionPEP;
import java.util.Scanner;;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
       
        
    }
    static int fib(int n){
       if(n==0){
           return 0;
       }
       if(n==1){
           return 1;
       }
        int ans=fib(n-2)+fib(n-1);
        return  ans;
    }

}
