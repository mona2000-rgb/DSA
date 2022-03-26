package Array;
import java.util.Scanner;
public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter elemts in array");
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("profit = "+getProfit(a));
    }
    static  int getProfit(int price[]){
        int n=price.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit=profit+(price[i]-price[i-1]);
            }
        }
        return profit;
    }
    
}
