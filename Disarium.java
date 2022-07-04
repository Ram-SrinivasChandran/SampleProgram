import java.util.*;
class Virtusa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 0,b=0,sum=0;
        int temp=a;
        while(a>0) {
            count++;
            a /= 10;
        }
        a=temp;
        while(a>0)
        {
            b=a%10;
            b=(int)Math.pow(b,count);
            sum=sum+b;
            count--;
            b=0;
            a/=10;
        }
        if(sum==temp)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
