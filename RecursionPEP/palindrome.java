package RecursionPEP;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String s=sc.nextLine();
        System.out.println(isPal( s,0, s.length()-1));
    }
    static boolean isPal(String s,int st,int e){
        if(st>=e){
            return true;
        }
        return (s.charAt(st)==s.charAt(e)) &&isPal(s, st+1, e-1);
    }
    
}
