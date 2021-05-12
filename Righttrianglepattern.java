import java.util.*;
class Righttrianglepattern
{
	public static void main(String[] args) {
		int row;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row of the Pattern:");
		row=s.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}