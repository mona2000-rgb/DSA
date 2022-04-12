package Mathematics;
import java.util.Scanner;
public class CountDigit {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Digit ");
    int n=sc.nextInt();
    System.out.println(count(n));
}
public static int count(int n){
int c=0;
while(n>0){
    n=n/10;
    c++;
}
return c;
}
    
}