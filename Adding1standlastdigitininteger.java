import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int c=1;
        c=n%10;
        while(n>9)
        {
            n=n/10;
        }
        
        System.out.println(n+c);
    }
}
