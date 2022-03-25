package Array;
import java.util.Scanner;
public class LeftRotationByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n=sc.nextInt();
    System.out.println("Enter Elements in Array");
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
        rotateByOne(a);
        System.out.println("After Rotation");
         for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }   
    }
   static void rotateByOne(int[]a){
    int n=a.length;
    int temp=a[0];
    for(int i=1;i<n;i++){
        a[i-1]=a[i];
    }
    a[n-1]=temp;

   }

    
}
