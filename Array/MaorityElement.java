import java.util.Scanner;

public class MaorityElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("index "+Majority(a));

    }
    // static int Majority(int []a){
        
    //     int i;
    //     int n=a.length;
    //     for(i=0;i<n;i++){
    //         int count=1;
    //         for(int j=i+1;j<n;j++){
    //             if(a[i]==a[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>n/2){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
                                            //  EFFICIENTAPPROACH------------MOORE'S VOTING ALGORITHM
    static int Majority(int[]a){
        int res=0;
        int count=1;
        int n=a.length;
        for(int i=1;i<n;i++){
            if(a[res]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
            
        }
        count=0;
        for(int i=0;i<n;i++){
            if(a[res]==a[i]){
                count++;
            
            }
            
        }
        if(count<=n/2){
            res=-1;
        }
        return  res;
       
    }
    


}
