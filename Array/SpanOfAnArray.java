
import java.util.Scanner;
public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    FindSpan(a);
}
static void FindSpan(int[]a){
    int n=a.length;
    int min=a[0];
    int max=a[0];
    for(int i=1;i<n;i++){
        if(a[i]>max){
        max=a[i];
        }
        if(a[i]<min){
           min=a[i];
        }
    }
    int span=max-min;
    System.out.println(span);
    }
    
}
