import java.util.*;
class Rightpascals
{
	public static void main(String[] args) {
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Row of the Pattern:");
		row=s.nextInt();
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("* ");
			}
		System.out.println();	
		}

		}
	
}