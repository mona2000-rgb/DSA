package Array;
import java.util.Scanner;
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("After removing duplicates");
        n= removeDuplicate(a); //to print new size of array
       for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
       }
        
    }
    static int removeDuplicate(int[]a){
       int n=a.length;
       if(n==0||n==1){
           return n ;
       }
       int res=1;
       for(int i=1;i<n;i++){
           if(a[i]!=a[res-1]){
               a[res]=a[i];
               res++;
           }
       }
       return res;
    }
    

    

}
