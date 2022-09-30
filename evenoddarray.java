import java.util.*;
class Test{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(funcArrange(arr));
    }
    public static int[] funcArrange(int[]inputArr)
    {
        int answer[]=new int[inputArr.length];
        int c[]=new int[inputArr.length];
        c=inputArr;
        int count=0;
        for(int i=0;i<inputArr.length;i++)
        {
            if(inputArr[i]%2==0)
            {
                answer[count]=inputArr[i];
                count++;
            }
        }
        for(int i=0;i<inputArr.length;i++)
        {
            if(inputArr[i]%2!=0)
            {
                answer[count]=inputArr[i];
                count++;
            }
        }
        return answer;
    }
}
//10 98 3 33 12 22 21 11
