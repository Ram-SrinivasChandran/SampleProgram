import java.util.*;
class Virtusa{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[]=new int[a];
        int b=s.nextInt();
        int temp=a%b;
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=b;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<=temp;i++) {
            System.out.print(arr[i]+" ");
        }
        //System.out.println(temp);

    }
}
