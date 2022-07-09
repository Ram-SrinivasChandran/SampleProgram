import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        int count=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=1;i<=count;i++)
        {
            System.out.print("0 ");
        }
        for(int i=count;i<arr.length;i++)
        {
            System.out.print("1 ");
        }
    }
}
