/*
i/p={0,1,1,0,1,1,1}
o/p=3


*/
import java.util.Scanner;
public class maxConsecutive1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter Elemnts in Array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=
            sc.nextInt();
        }
        System.out.println("consecutive one  are "+maxOne(a));
    }
    /*
                                //NAIVE APPROACH
    static int maxOne(int[]a){
        int res=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(a[j]==1){
                    count++;
                }else{
                    break;
                }
                res=Math.max(count,res);
            }
        }
        return res;
    }
    */
            //EFFICIENT APPROACH
    static int maxOne(int[]a){
        int res=0;
    int count=0;
    int n=a.length;
    for(int i=0;i<n;i++) {
        if(a[i]==0){
            count=0;
        }else{
            count++;
            res=Math.max(res,count);
        }
    } 
    return res;
    }     
    
}
