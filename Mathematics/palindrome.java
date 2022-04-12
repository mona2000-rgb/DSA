package Mathematics;
import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        System.out.println(checkPalindrome(n));

    }
static boolean checkPalindrome(int n){
    int ans=0;
    int temp=n;
    while(temp>0){
        int ld=temp%10;
        ans=ans*10+ld;
        temp=temp/10;
    }
    return ans==n;
}
    
}
