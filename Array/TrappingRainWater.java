//package Array;
import java.util.Scanner;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter elemts in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Stored water is "+ getWater(a)+" unit");
    }
                                                    //NAIVE APPROACH
    // static int getWater(int[]a){
    //     int n=a.length;
    //     int water=0;
    //     for(int i=1;i<n-1;i++){
    //         int lmax=a[i];
    //         for(int j=0;j<i;j++){
    //             lmax=Math.max(lmax,a[j]);
    //         }
    //        int rmax=a[i]; 
    //        for(int j=i+1;j<n;j++){
    //            rmax=Math.max(rmax,a[j]);
    //        }
    //        water=water+(Math.min(lmax,rmax)-a[i]);
    //     }
    //     return water;
    // }
                                    //EFFICIENT APPROACH
        static int getWater(int[]a){
            int n=a.length;
            int []lmax=new int[n];
            int []rmax=new int[n];
            int water=0;
            lmax[0]=a[0];
            for(int i=1;i<n;i++){
                lmax[i]=Math.max(a[i],lmax[i-1]);
            }
            rmax[n-1]=a[n-1];
            for(int i=n-2;i>=0;i--){
                rmax[i]=Math.max(a[i],rmax[i+1]);
            }
            for(int i=1;i<n-1;i++){
                water=water+(Math.min(lmax[i],rmax[i])-a[i]);
            }
            return water;
        }
    
}
