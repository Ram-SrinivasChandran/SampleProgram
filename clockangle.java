import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double sum=0;
        int hd=a*30;
        int md=b*6;
        double dev=0.5;
        for(int i=1;i<b;i++)
        {
            dev+=0.5;
        }
        sum=dev+hd;
        int diff=Math.abs(md-(int)sum);
        System.out.println(diff);
    }
}
