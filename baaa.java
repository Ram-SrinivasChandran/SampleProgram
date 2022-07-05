import java.util.*;
class Virtusa{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char [] b=a.toCharArray();
        char c=b[1];
        int d=Integer.parseInt(String.valueOf(c));
        char e=b[3];
        int f=Integer.parseInt(String.valueOf(e));
        for(int i=1;i<=f;i++)
        {
            System.out.print(a.charAt(2));
            for(int j=1;j<=d;j++)
            {
                System.out.print(a.charAt(0));
            }
         }
    }
}
