package Array;
import java.util.Scanner;
public class FrequenciesInSortedArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter Elemnts in array");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        countFrequency(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
    static  void countFrequency(int[]a){
        int n=a.length;
        int freq=1; 
        int i=1;
        while(i<n){
            while(i<n&&a[i]==a[i-1]){
                freq++;
                i++;
            }
            System.out.print(a[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(n==1||a[n-1]==a[n-2]){
            System.out.print(a[i-1]+"  "+1);
        }
    }
    
}
