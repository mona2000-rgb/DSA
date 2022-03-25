package Array;
import java.util.Scanner;
public class leaderElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter elemts in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Leader Elements are ");
        leader(a);
    }
    //effucient way
    static void leader(int[]a){
        int n=a.length;
        int cur_ldr=a[n-1];//last element is always a leader
        System.out.print(cur_ldr+" ");
        for(int i=n-2;i>=0;i--){
            if(cur_ldr<a[i]){
                cur_ldr=a[i];
                System.out.print(cur_ldr+" ");
            }
           
        }
        
    }
   
}
