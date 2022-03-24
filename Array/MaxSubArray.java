package Array;
import java.util.Scanner;
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res=maxSum(a);
        System.out.println(res);


    }
    public static int maxSum(int[]a){
        int min=Integer.MIN_VALUE;
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=sum+(a[i]+a[j]);
                int maxV=Math.max(sum,min);
            }
        }
        return sum;
    }
    
}
