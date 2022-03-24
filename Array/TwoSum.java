package Array;
import java.util.Scanner;
import java.util.*;
public class TwoSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in Array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target Value");
        int t=sc.nextInt();
        int[] ans=pair(arr,t);
        for(int val:ans){
            System.out.print(val+" ");
        }

    }
    public static int[] pair(int[]arr, int target){
        int[]res=new int[2];
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                res[1]=i;
                res[0]=map.get(target-arr[i]);
                return res;
            }
          map.put(arr[i],i);
        }
        return res;
    }
   
}
