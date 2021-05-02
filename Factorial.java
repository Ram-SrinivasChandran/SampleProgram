import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int i,fact=1;
		int number;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number:");
		number=in.nextInt();
				System.out.print(number);
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+number+"is "+fact);
	}
}