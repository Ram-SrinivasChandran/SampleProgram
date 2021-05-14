import java.util.*;
class Leftpascals
{
	public static void main(String[] args) {
		int i,j,k,row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Row of the Pattern:");
		row=s.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=i;j<row;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(i=row;i>=1;i--)
		{
			for(j=i;j<=row;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}