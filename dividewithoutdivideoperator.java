import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sub=0;
        while(a>=b)
        {
            a=a-b;
            sub++;
        }
        System.out.println(sub);
    }
}
