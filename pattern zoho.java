import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int b=a.length();
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(i==j)
                {
                    System.out.print(a.charAt(i)+" ");
                }
                else if( i+j==b-1)
                {
                System.out.print(a.charAt(j)+" ");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
