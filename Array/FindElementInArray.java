import java.util.Scanner;
public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
   int d=sc.nextInt();
   System.out.println(findElement(a,d));
  }
  static  int findElement(int[]a,int d){
    int n=a.length;
    for(int i=0;i<n;i++){
      if(a[i]==d){
        return i;
      }
    }
    return -1;
  }
 
    }
    

