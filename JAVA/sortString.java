import java.util.*;
public class sortString {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count;
        for(int i=0;i<s2.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s2.charAt(i)==s1.charAt(j))
                    System.out.print(s1.charAt(j));
            }
        }
        for(int i=0;i<s1.length();i++){
            count = 0;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)!=s2.charAt(j))
                    count++;
            }
            if(count==s2.length())
                System.out.print(s1.charAt(i));
        }
    
    }
}
