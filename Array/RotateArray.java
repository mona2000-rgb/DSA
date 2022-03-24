package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elemnts of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       System.out.println("Enter the value of k");
       int k =sc.nextInt();
       rotate(a,k);
       for(int val:a){
        System.out.println("ans" +val);
    }

    }
    public static void rotate(int[]a,int k){
        int n=a.length;
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0, n-1);
    }
    public static void reverse(int []a,int l,int h){
        int temp;
        //  l=0;
        //  h=a.length-1;
        while(l<h){
            temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            l++;
            h--;
        }
    }  
}
