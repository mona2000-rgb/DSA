package Mathematics;
import java.util.Scanner;
public class ComputingPower {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value ");
        int x=sc.nextInt();
        System.out.println("Enter value of power");
        int n=sc.nextInt();
        System.out.println(findPower(x,n));

    }
    //NAIVE APPROACH
    // static void findPower(int x,int n){
    //     int res=1;
    //     for(int i=1;i<=n;i++){
    //         res=res*x;
    //     }
    //     System.out.println(res);
    // } 

    //EFFICIENT APPROACH(recursion)
//     static int findPower(int x,int n){
//         if(n==0){
//             return 1;
//         }
// int ans=findPower(x,n/2);
// ans=ans*ans;
// if(n%2==0){
// return ans;
// }
// else{
//     return ans*x;
// }
//     }
  //EFFICIENT APPROACH(ITERATUVE)
  static int findPower(int x,int n){
      int res=1;
      while(n>0){
          if(n%2!=0){
              res=res*x;
          }
         x= x*x;
         n=n/2;
    }
    return res;
  }

}
