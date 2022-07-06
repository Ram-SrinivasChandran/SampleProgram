import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=0;
        int c=1,d=1;
        for(int i=1;i<=a;i++)
        {
            b=c+d;
            c=d;
            d=b;
        }
        System.out.println(b*b);
    }
}
