import java.util.*;
class Virtusa{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=0;
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            {
                //System.out.print(i+" ");
                for(int j=2;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        b++;
                        //System.out.print(b);
                    }
                }
                if(b==1)
                {
                    System.out.print(i+" ");
                }
                b=0;
            }
        }
    }
}
