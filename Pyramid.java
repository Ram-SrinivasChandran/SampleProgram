import java.util.*;
class Pyramid
{
	public static void main(String[] args) {
		int i,j,row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Row of the Pattern");
		row=s.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}