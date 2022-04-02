import java.util.Scanner;
public class MinimumConsecutiveFlips {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=sc.nextInt();
        System.out.println("Enter elemts in array ");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        minimuFlips(a);

    }
    static void minimuFlips(int[]a){
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[i]!=a[i-1]){
           if(a[i]!=a[0]){
               System.out.print("from "+i+" to");
           }else{
               System.out.println(i-1);
           }
        }

    }
    if(a[n-1]!=a[0]){
        System.out.println(n-1);
    }
    
        else{
            System.out.println(-1);
        }
}
}
