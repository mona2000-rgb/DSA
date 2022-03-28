package Array;
import java.util.Scanner;
public class MaximumLengthEvenOddSubArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter Elemnts in Array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        System.out.print("Maxinum even odd subarray length is ");

        System.out.println(maxEvenOddLength(a));

}
            //NAIVE APPROACH
/*static int maxEvenOddLength(int[]a){
int n=a.length;
int res=1;
for(int i=0;i<n;i++){
    int count=1; //a single length is also consider as alternating subarray
    for(int j=i+1;j<n;j++){
        if((a[j]%2==0&&a[j-1]%2!=0)||(a[j-1]%2==0&&a[j]%2!=0)){
            count++;
        }else{
            break;
        }
        res=Math.max(res,count);
    }
}
return res;
}*/
                    //EFFICIENT APPROACH
    static int maxEvenOddLength(int[]a){
        int res=1;
        int count=1;
        int n=a.length;
        for(int i=1;i<n;i++){
            if((a[i]%2==0&&a[i-1]%2!=0)||(a[i-1]%2==0&&a[i]%2!=0)){
                count++;
                res=Math.max(res,count);
            }else{
               count=1;
            }
        }
        return res;
    }
}
