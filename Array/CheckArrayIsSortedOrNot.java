import java.util.Scanner;
public class CheckArrayIsSortedOrNot {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(isSorted(a));
}
//naive aapproach
//    static boolean isSorted(int[]a){
//        int n=a.length;
// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//         if(a[i]>a[j]){
//             return false;
//         }
//     }
// }
// return true;
//    } return true;


            //efficient method
          static boolean isSorted(int[]a){
              int n=a.length;
              for(int i=1;i<n;i++){
                  if(a[i]<a[i-1]){
                      return false;
                  }
              }
              return true;

          }
}