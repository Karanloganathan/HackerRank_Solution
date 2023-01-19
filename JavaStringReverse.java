import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer ss=new StringBuffer(A);
        ss.reverse();
        String R=ss.toString();
        if(A.equals(R)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        sc.close();
    }
}
