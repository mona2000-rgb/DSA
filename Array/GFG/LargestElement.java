package Array.GFG;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter elements in array");
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
      int large=a[0];
      for(int i=1;i<n;i++){
          if(large>a[i]){
              large=a[i];
          }
      }
      System.out.println("large "+large);  
}
}