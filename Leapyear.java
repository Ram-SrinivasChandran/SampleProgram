import java.util.Scanner;
public class Leapyear
{
	public static void main(String[] args) {
		int a;
		Scanner in =new Scanner (System.in);
		System.out.println("Enter a Year:");
		a=in.nextInt();
		if(a%4==0&&a%100!=0||a%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}