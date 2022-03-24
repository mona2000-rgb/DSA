package Array;
import java.util.Scanner;
/**
 * MoveZerosToEnd
 */
public class MoveZerosToEnd {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n=sc.nextInt();
    System.out.println("Enter Elements in Array");
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("After move all elements ");
    moveZero(a);
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
static void moveZero(int[]a){
    int n=a.length;
    int count=0;
    for(int i=0;i<n;i++){
        if(a[i]!=0){
            a[count++]=a[i];
        }
    }
    while(count<n){
        a[count++]=0;
    }
    
    
}
    
}