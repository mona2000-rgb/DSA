package RecursionPEP;

/**
 * increase
 */
import java.util.Scanner;
public class increase {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n");
    int n=sc.nextInt();
    System.out.println("_____________________________________");
    //printIncreaseing(n);
    //printDecreasing(n);
    pdi(n);
}
static void printIncreaseing(int n){
    if(n==0){
        return;//base case
    }
    printIncreaseing(n-1);//faith;
    System.out.println(n);//expection
}
static void  printDecreasing(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printDecreasing(n-1);
}
static void pdi(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    pdi(n-1);
    System.out.println(n);
}
    
}