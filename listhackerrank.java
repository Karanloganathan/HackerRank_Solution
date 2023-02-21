import java.io.*;
import java.util.*;
public class listhackerrank {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>li=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int j=sc.nextInt();
            li.add(j);
        }
        System.out.print(li);
int q=sc.nextInt();
while(q-- >0){
    String op=sc.next();
    switch(op){
        case "Insert":{
        int index=sc.nextInt();
        int element=sc.nextInt();
        li.add(index,element);
        break;
       // System.out.println(li);
        }
        case "delete":{
        int indexk=sc.nextInt();
        li.remove(indexk);
        break;
        }
    }
}
for(Integer in:li){
    System.out.print(in+" ");
}
    }
}