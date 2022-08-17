import java.util.*;
class Study{
    public static void main(String[]args)
    {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int count=0,c=0,d=0;
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
            }
            if(count>c)
            {
                c=count;
                count=0;
                d=i;
            }
        }
        System.out.println(d+1);
    }
}
