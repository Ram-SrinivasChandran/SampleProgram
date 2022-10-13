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
        int b=s.nextInt();
        int brr[];
        brr=company(arr,b);
        for(int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
    public static int[] company(int[]arr,int b)
    {
        List<Integer>c=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i;j<i+b;j++)
            {
                if(arr[j]<0)
                {
                    c.add(arr[j]);
                    break;
                }
                if(arr[j]>0)
                {
                    count++;
                }
                if(count==b)
                {
                    c.add(0);
                    break;
                }
                if(j==arr.length-1)
                {
                    break;
                }
            }
        }
        int brr[]=new int[c.size()];
        for(int i=0;i<c.size();i++)
        {
            brr[i]=c.get(i);
        }
        return brr;
    }
}

/*
Input:
8
-1 -2 5 4 -3 -9 8 -6
4
Output:
-1 -2 -3 -3 -3 -9
*/
