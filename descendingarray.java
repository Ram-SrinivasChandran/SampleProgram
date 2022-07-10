import java.util.*;

public class Virtusa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		int temp=0,count=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			temp=arr[i];
			for(int j=i+1;j<a;j++)
			{
				if(temp<arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(arr[i]+" ");
			}
			temp=0;
			count=0;
		}
		

	}

}
