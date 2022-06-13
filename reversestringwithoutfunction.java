import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int b=a.length();
        int arr[]=new int[b];
        for(int i=0;i<b;i++)
        {
            arr[i]=a.charAt(i);
        }
        for(int i=b-1;i>=0;i--)
        {
            System.out.print((char)arr[i]);
        }
    }
}
