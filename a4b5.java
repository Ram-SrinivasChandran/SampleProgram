import java.util.*;
class Virtusa{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        char [] b=a.toCharArray();
        char c=b[1];
        int f=Integer.parseInt(String.valueOf(c));
        for(int i=0;i<=f;i++)
        {
            System.out.print(a.charAt(0));
        }
        char g=b[3];
        int d=Integer.parseInt(String.valueOf(g));
        for(int i=0;i<=d;i++)
        {
            System.out.print(a.charAt(2));
        }

    }
}
