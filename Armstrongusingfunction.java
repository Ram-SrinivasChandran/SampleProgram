import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int cnt=0;
        int temp=a;
        while(a>0)
        {
        a/=10;
        cnt++;
        }
        a=temp;
        int c,sum=0;
        int i=cnt;
        while(a>0)
        {
            c=a%10;
            sum=sum+powerof(c,cnt);
            a/=10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
        
    }
    static int powerof(int x,int y)
    {
        int pow=1;
        for(int i=1;i<=y;i++)
        {
            pow=pow*x;
        }
        return pow;
    }
}
