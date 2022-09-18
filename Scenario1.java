/*Scenario program
Shopping*/
import java.util.*;
class Study{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int c=s.nextInt();
        int a = s.nextInt();
        int k=s.nextInt();
        int x=s.nextInt();
        int d=0,e=0;
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]==arr[j]);
                {
                d=a-1;
                }
            }
        }
        if(d==0) {
            e = a - k;
            e = e * x;
            System.out.print(e);
        }
        else
        {
            e=Math.abs(a-k-d);
            e=e*x;
            System.out.print(e);
        }
    }
}
/*Input
1
4
2
5
1 2 3 1
Output
5
1 st Line(Test Case)
2 nd Line(Array Size)
3 rd Line(Remember cost)
4 th Line(Cost Increment)
5 th line(Array Input)
*/
