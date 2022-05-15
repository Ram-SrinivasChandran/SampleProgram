import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String b=Integer.toBinaryString(a);
        int d=Integer.parseInt(b);
        int count=0,c=0;
        while(d>0)
        {
            c=d%10;
            if(c==1)
            {
                count++;
            }
            c=0;
            d=d/10;
        }
        System.out.println(count);
    }
}
