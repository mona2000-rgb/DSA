package Array;
import java.util.Scanner;
public class MaximumDifference {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array ");
            int n=sc.nextInt();
            System.out.println("Enter Elements in Array");
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("maximum difference is "+maxDiff(a));
            

    }
                  //naive approach
    // static int maxDiff(int []a){
    //     int n=a.length;
    //     int diff=a[1]-a[0];
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             diff=Math.max(diff,a[j]-a[i]);
    //         }
    //     }
    //     return diff;
    // }
                              //EFFICIENT APPROACH
      static int  maxDiff(int[]a){
          int n=a.length;
        int diff=a[1]-a[0];
        int minVal=a[0];
        for(int j=1;j<n;j++){
            diff=Math.max(diff,a[j]-minVal);
            minVal=Math.min(minVal,a[j]);
        }
        return diff;
        }
    
}
