import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] c=a.split(" ");
        for(int i=c.length;i>0;i--)
        {
            System.out.print(c[i-1]+" ");
        }
    }
}
