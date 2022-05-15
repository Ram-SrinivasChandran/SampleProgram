import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=Integer.parseInt(s);
        
        int c=i%10;
        while(i>9)
        {
            i=i/10;
        }
        System.out.println(c+i);
    }
}
