import java.util.*;
class Mirroredrighttriangle
{
	public static void main(String[] args) {
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row of the Pattern:");
		row=s.nextInt();
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}