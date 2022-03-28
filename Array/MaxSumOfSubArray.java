package Array;
import java.util.Scanner;
public class MaxSumOfSubArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter Elemnts in Array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=
            sc.nextInt();
        }
        // System.out.println("Subarray ");
        //printSubArray(a);
        System.out.println("MaximumSumOfSubarray is "+maxSum(a));
    }
//print all subArray
/*
    static void printSubArray(int[]a){
        int n=a.length;
        for(int i=0;i<n;i++){
            for( int j=i;j<n;j++){
                for(int  k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
           
        }

    }
    */
        //NAIVE APPROACH
   /* static int maxSum(int[]a){
        int n=a.length;
        int res=a[0];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+a[j];
                res=Math.max(res,sum);
            }
        }
        return res;
    }*/
    //EFFICIEN APPROACH
    static int maxSum(int[]a){
        int n=a.length;
        int res=0;
        int maxEnding=a[0];
        for(int i=0;i<n;i++){
            maxEnding=Math.max(maxEnding+a[i],a[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }

    
}
