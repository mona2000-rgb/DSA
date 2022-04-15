package Mathematics;
import java.util.Arrays;
import java.util.Scanner;
public class SieveOfEratosthenes {
    //print all the prime number number which are less then or equal to that number;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        printPrimes(n);

    }
            //NAIVE APPROACH
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
    if(n==2||n==3){
        return true;
    }
    if(n%2==0||n%3==0){
        return false;
    }
    for(int i=5;i*i<=n;i=i+6){
        if(n%i==0||n%(i+2)==0){
            return false;
        } 
    }

    return true;
    }
    // static void printPrimes(int n){
    //     for(int i=2;i<=n;i++){
    //         if(isPrime(i)){
    //             System.out.println(i);
    //         }
            
    //     }
    // }

                //EFFICIENT APPROACH
    static void printPrimes(int n){
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            for(int j=i*i;j<=n;j=j+1){
                isPrime[j]=false;
            }
        }
    }
    
}
