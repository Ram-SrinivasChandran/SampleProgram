import java.io.*;
import java.util.*;

public class ComparePalindrome{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String A=sc.next();
        String c="";
        int len=A.length();
        for(int i=len-1;i>=0;i--)
        {
            c=c+A.charAt(i);
        }
        if(A.equals(c))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}



