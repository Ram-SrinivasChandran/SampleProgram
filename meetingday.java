import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int gcd=1;
        for(int i=1;i<=a&&i<=b;++i)
        {

            if(a%i==0&&b%i==0)
                gcd=i;

        }
        int lcm=(a*b)/gcd;
        String c[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int d=lcm%7;
        String e="";
        e=c[d];
        System.out.println(e);
    }
}
