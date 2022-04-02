import java.util.Scanner;
public class MaximumSumOfKConsecutiveElement {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array ");
    int n=sc.nextInt();
    System.out.println("Enter elemts in array ");
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Enter value of K");
    int k=sc.nextInt();
    System.out.println("maximum sum is "+findMaxsum(a,k));
}
// static int findMaxsum(int[]a,int k){
//     int n=a.length;
//     int max_sum=Integer.MIN_VALUE;
//     for(int i=0;i+k-1<n;i++){
//         int sum=0;
//         for(int j=0;j<k;j++){
//             sum=sum+a[i+j];
//         }
//         max_sum=Math.max(max_sum,sum);
//     }
//     return max_sum;
// }
               // EFFICIENT APPROACH (SLIDING WINDOW)
        static int findMaxsum(int[]a,int k){
            int cur_sum=0;
            int n=a.length;
            for(int i=0;i<k;i++){
                cur_sum=cur_sum+a[i];
            }
            int max_sum=cur_sum;
            for(int i=k;i<n;i++){
                cur_sum=cur_sum+(a[i]-a[i-k]);
                max_sum=Math.max(max_sum,cur_sum);
            }
           
            return max_sum;
        }

    
}
