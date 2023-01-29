import java.util.Scanner;
import java.math.BigInteger;
public class HackerrankbigInteger {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        BigInteger a1= sc.nextBigInteger();
      BigInteger b1= sc.nextBigInteger();

      System.out.println(a1.add(b1));
      System.out.println(a1.multiply(b1));
    }
}
