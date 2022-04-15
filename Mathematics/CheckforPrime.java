package Mathematics;
import java.util.Scanner;
public class CheckforPrime {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value");
    int n=sc.nextInt();
    System.out.println(isPrime(n));

}
// static void isPrime(int n){
//     int count=0;
//     if(n==1){
//         return;
//     }
//     for(int i=2;i*i<=n;i++){
//         if(n%i==0){
//             count++;
//         }   
//     }
//     if(count==0){
//         System.out.println("prime ");
//     }else{
//         System.out.println("not prime");
//     }
// }

        //EFFICIENT WAY
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
    
}
