import java.util.*;
class Rightdownmirrored
{
	public static void main(String[] args) {
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Row of the pattern:");
		row=s.nextInt();
		for(int i=row;i>=1;i--)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}