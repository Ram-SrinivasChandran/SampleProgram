import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int b=a.length();
        String reverse="";
        for(int i=b-1;i>=0;i--)
        {
            reverse=reverse+a.charAt(i);
        }
        System.out.println(reverse);
        if(a.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
