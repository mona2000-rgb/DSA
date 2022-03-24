package Array;
import java.util.Scanner;
public class LrgestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
     System.out.println("index "+largeVlaue(a));
    
    }
    
    static int largeVlaue(int[]a){
        int n=a.length;
        int large=0;
        for(int i=1;i<n;i++){
            if(a[i]>a[large]){
                large=i;
            }
        }
       return  large;
    }
    
}
