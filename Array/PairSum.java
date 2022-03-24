package Array;
import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter values of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target value");
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==t){
                    System.out.println("pair "+a[i]+" , "+a[j]);
                  
                }
            }
        }
    }
    
}
