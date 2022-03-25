package Array;
import java.util.Scanner;;
public class RotateArrayFromKposition {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in Array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k=sc.nextInt();
      //reverse(a,0,n-1);
      rotate(a,n,k);
      for(int val:a){
          System.out.print(val+" ");
      }
    }
    static void rotate(int a[],int n,int k){
        if(k>n){
         k=k%n;
        }
        if(k<0){
           k=k+n;
        }
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
        reverse(a, 0, n-1);

    }


    static void reverse(int[]a,int l,int h){
    while(l<h){
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
        l++;
        h--;
    }

    }
    
}
