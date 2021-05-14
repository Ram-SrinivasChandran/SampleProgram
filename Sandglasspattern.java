import java.util.*;
class Sandglasspattern
{
	public static void main(String[] args) {
		int i,j,k,row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Rows for the Pattern:");
		row=s.nextInt();
		for(i=0;i<=row-1;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=row-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(i=row-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=row-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
  			
	}
}