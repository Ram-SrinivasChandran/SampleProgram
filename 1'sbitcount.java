import java.util.*;
class Virtusa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c=0,count=0;
        String s1 = Integer.toBinaryString(a);
        int b=Integer.parseInt(s1);
        while(b>0)
        {
            c=b%10;
            if(c==1)
            {
                count++;
            }
            c=0;
            b/=10;
        }
        System.out.println(count);

    }
}
