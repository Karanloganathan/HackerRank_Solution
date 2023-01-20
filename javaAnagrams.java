import java.util.Scanner;

public class Anagrams{

    static boolean isAnagram(String a, String b) {
        // Complete the function
        /*
        1.remove whitespace
        2.remove case
        3.if they have same number of elements then it is anagram else not
        */
       
        char[] c=a.toLowerCase().toCharArray();
        char[] d=b.toLowerCase().toCharArray();
        
       java.util.Arrays.sort(c);
       java.util. Arrays.sort(d);
        return java.util.Arrays.equals(c,d);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
