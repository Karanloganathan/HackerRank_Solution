import java.io.*;
import java.util.*;

public class endoffile
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ss=new Scanner(System.in);
        int count=0;
        while(ss.hasNext()){
            System.out.println(++count +" "+ss.nextLine());
        }
    }
}
