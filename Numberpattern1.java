import java.util.*;
class Numberpattern1
{
	public static void main(String[] args) {
		int n,i,j,number;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the term of the Pattern:\n");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			number=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}

	}
}