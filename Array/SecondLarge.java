package Array;
import java.util.Scanner;
public class SecondLarge {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of Array");
    int n=sc.nextInt();
    System.out.println("Enter Elements in array");
    int[]a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
// System.out.println("index "+largeVlaue(a));
//System.out.println("Second large value present at index "+getSecondLargeValue(a));
System.out.println("Second large value present at index "+secondLarge(a));
}

// static int largeVlaue(int[]a){
//     int n=a.length;
//     int large=0;
//     for(int i=1;i<n;i++){
//         if(a[i]>a[large]){
//             large=i;
//         }
//     }
//    return  large;
// }
// static int getSecondLargeValue(int[]a){
//     int n=a.length;
//     int sl=largeVlaue(a);
//     int res=-1; //may be 2nd large value not exist like 10 10 10 is present in array
//     for(int i=0;i<n;i++){
//         if(a[i]!=a[sl]){
//             if(res==-1){
//                 res=i;
//             }else if(a[i]>a[res]){
//                 res= i;
//             }
//         }
//     }
// return res;
// }
          //Efficient approach
static int secondLarge(int[]a){
    int n=a.length;
    int res=-1;
    int sl=0;
    for(int i=1;i<n;i++){
        if(a[i]>a[sl]){
            res=sl;
            sl=i;
        }else if(a[i]!=a[sl]){
            if(res==-1||a[i]>a[res]){
                res=i;
            }
        }
    }
return res;
}
    
}
