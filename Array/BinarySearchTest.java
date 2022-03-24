package Array;
import java.util.Scanner;
public class BinarySearchTest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter value whic you want to find");
        int k=sc.nextInt();
        int ans=binarySearch(a,k);
        System.out.println("value present at index "+ans);
    }
    public static int binarySearch(int[]a,int k){
        int st=0;
        int end=a.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(a[mid]<k){
                st=mid+1;
            }else if(a[mid]>k){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
  
}
