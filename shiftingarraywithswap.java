import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[]=new int[a];
        int b=s.nextInt();
        int temp=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int j=1;j<=b;j++) {
            for (int i = 0; i < a; i++) {
                if (i == 0) {
                    temp=arr[i];
                }
                else {
                    arr[i-1]=arr[i];
                }

            }
            arr[a-1]=temp;
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
