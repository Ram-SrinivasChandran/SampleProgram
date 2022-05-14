import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(powerof(a,b));
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
