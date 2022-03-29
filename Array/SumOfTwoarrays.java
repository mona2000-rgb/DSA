/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10

Format
Input
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output
A number representing sum of two numbers, represented by two arrays.

Example
Sample Input

5
3
1
0
7
5
6
1
1
1
1
1
1

Sample Output
1
4
2
1
8
6


*/

import java.util.Scanner;
public class SumOfTwoarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[]a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[]a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        System.out.println("Addtion  ");
       int[]ans=sum(a1,a2);
       for(int val:ans){
           System.out.print(val+" ");
       }
     }
     static int[] sum(int[]a1,int[]a2){
         int n1=a1.length;
         int n2=a2.length;
         int n3=Math.max(n1,n2);
          int res[]=new int[n3];
         int p1=n1-1;
         int p2=n2-1;
         int p3=n3-1;
        
         int carry=0;
         while(p1>=0||p2>=0){
             int v1=p1>=0?a1[p1]:0;
             int v2=p2>=0?a2[p2]:0;
             int sum=v1+v2+carry;
             int dig=sum%10;
             carry=sum/10;
             res[p3]=dig;
             p1--;
             p2--;
             p3--;
         }
         if(carry!=0){
             int newRes[]=new int[n3+1];
             newRes[0]=carry;
             for(int idx=1;idx<newRes.length;idx++){
                 newRes[idx]=res[idx-1];
             }
             return newRes;
         }else{
             return res;
         }
    }
    
}
