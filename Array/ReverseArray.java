package Array;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("After Reverse array");
        reverse(a);
        for(int val:a){
            System.out.print(val+" ");
        }
    }
    static void  reverse(int[]a){
        int low=0;
        int high=a.length-1;
        while(low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }
    
}
