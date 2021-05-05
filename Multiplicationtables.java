import java.util.*;
class Multiplicationtables
{
	public static void main(String[] args) {
		int num;
		int ans;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Nuber to generate the Multiplicationtable:");
		num=in.nextInt();
		for(int i=1;i<=10;++i)
		{
			ans=num*i;
			System.out.println(num+" x "+i+" = "+ans);
		}
	}
}
