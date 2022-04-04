import java.util.Scanner;

public class FindSubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array ");
    int n=sc.nextInt();
    System.out.println("Enter elemts in array ");
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Enter value of sum");
    int k=sc.nextInt();
    System.out.println( subarraySum(a,k));
    }
            //NAIVE APPROACH
    // static boolean subarraySum(int[]a,int k){
       
    //     int n=a.length;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum=sum+a[j];
    //             if(sum==k){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    //EFFICIENT APPROACH
    
    
}
