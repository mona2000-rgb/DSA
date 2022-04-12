package Mathematics;
import java.util.Scanner;
public class TrailingZerosInFactorial {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value");
int n=sc.nextInt();
System.out.println(findTZinFac(n));

    }
    //naive approach
    // static int findTZinFac(int n){
    //     int fac=1;
    //     for(int i=2;i<=n;i++){
    //         fac=fac*i;
    //     }
    //     int count=0;
    //     while(fac%10==0){
    //         count++;
    //         fac=fac/10;
    //     }
    //     return count;
    // }

   // EFFICIENT APPROACH

   static int findTZinFac(int n){
       int ans=0;
       for(int i=5;i<=n;i=i*5){
        ans=ans+n/i;
       }
       return ans;
   }
}
