package Mathematics;
import java.util.Scanner;
public class HCForGCD {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number1 ");
      int a=sc.nextInt();
      System.out.println("Enter number2");
      int b=sc.nextInt();
      System.out.println("HCF is "+findHCF(a,b));

    }
        //NAIVE APPROACH
    // static int findHCF(int a,int b){
    //    int hcf=Math.min(a,b);
    //    while(hcf>0){
    //        if(a%hcf==0&&b%hcf==0){
    //            break;
    //        }
    //        hcf--;
    //    }
    //    return hcf;
    // }

    // EFFICIENT APPROACH(EUCLIDEAN ALGORITH)

    static int findHCF(int a,int b){
        while(a!=b){
            if(a>b){
              a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    
}
