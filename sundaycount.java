import java.util.*;
class Study
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String day=s.next();
        int a=s.nextInt();
        int count=0,c=0;
        String [] b={"mon","tue","wed","thu","fri","sat","sun"};
        for(int i=1;i<=a;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(day=="sun")
                {
                    count++;
                }
                else
                {
                    c++;
                    if(c==7)
                    {
                        j=0;
                        a=a-7;
                        i=0;
                        c=0;
                    }
                    if(b[j]=="sun")
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
