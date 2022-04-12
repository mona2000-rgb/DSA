package Mathematics;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        //findFactorial(n);
        System.out.println(findFactorial(n));
    }
            //Iterative approach
    // public static void findFactorial(int n){
    //     int fac=1;
    //     for(int i=2;i<=n;i++){
    //         fac=fac*i;
    //     }
    //     System.out.println(fac);
    // }

    //recursive approach
     static int findFactorial(int n){
        if(n==0){
            return 1;
        }
        int fnM1= findFactorial(n-1);
        int fac=n*fnM1;
        
        return fac;
    }
}
