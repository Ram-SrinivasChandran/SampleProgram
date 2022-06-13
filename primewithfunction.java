import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        prime (a);
        if(prime(a)==true)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        
    }
    static boolean prime(int b)
    {
        int count=0;
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
