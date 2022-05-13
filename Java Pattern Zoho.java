import java.util.*;
import java.lang.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=1;i<=2*a-1;i++)
        {
            for(int j=1;j<=2*a-1;j++)
            {
                System.out.print(max((Math.abs(i-a)+1),(Math.abs(j-a)+1)));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int max(int n1,int n2)
    {
        return (n1>n2)?n1:n2;
    }
}