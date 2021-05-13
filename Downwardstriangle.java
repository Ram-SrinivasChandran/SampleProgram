import java.util.*;
class Downwardstriangle
{
	public static void main(String[] args) {
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Row of the Pattern:");
		row=s.nextInt();
		for(int i=row-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");

			}
			System.out.println();
		}

	}

}