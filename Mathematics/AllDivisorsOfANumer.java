package Mathematics;
import java.util.Scanner;
public class AllDivisorsOfANumer {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        findDivisor(n);
    }
    //NAIVE APPROACH
    // static void findDivisor(int n){
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             System.out.println(i);
    //         }
    //     }
    // }
    
        //EFFICIENT APPROACH
        static void findDivisor(int n){
            int i;
            for(i=1;i*i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
            for(;i>=1;i--){
                if(n%i==0){
                    System.out.println(n/i);
                }
            }
        }
}
