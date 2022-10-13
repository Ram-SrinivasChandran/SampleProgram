import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        List<Integer>h=new ArrayList<Integer>();
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                    h.add(arr[i]);
                }
            }
        }
        for(int i:h)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int brr[];
        brr=ListDuplicate(arr);
        for(int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
    public static int[] ListDuplicate(int arr[])
    {
        List<Integer>b=new ArrayList<Integer>();
        List<Integer>d=new ArrayList<Integer>();
        for(int c:arr)
        {
            b.add(c);
        }
        int e=0;
        for(int i=0;i<b.size();i++)
        {
            if(b.get(i)!=0)
            {
                e=b.get(i);
                d.add(e);
            }
        }
        int k[]=new int[d.size()];
        for(int i=0;i<d.size();i++)
        {
            k[i]=d.get(i);
        }
        return k;
    }
}
