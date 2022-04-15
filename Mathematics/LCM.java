package Mathematics;
import java.util.Scanner;
import java.lang.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1 ");
        int a=sc.nextInt();
        System.out.println("Enter number2");
        int b=sc.nextInt();
        System.out.println(FindLCM(a,b));
    }
    //Naive approach
//    static int FindLCM(int a,int b){
//         int ans=Math.max(a,b);
//         while(true){
//             if(ans%a==0&&ans%b==0){
//                 return ans;
//             }
//             ans++;
//         }
      
//     }

//EFFICIENT APPROACH
 static int gcd(int  a,int b){
    if(b==0){
        return a;
    }
    return gcd(b,a%b);
}

static int FindLCM(int a,int b){
    return (a*b)/gcd(a,b);

}


    
    
}
