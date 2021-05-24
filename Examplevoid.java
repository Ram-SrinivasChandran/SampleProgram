import java.util.*;
class Examplevoid
{
	public static void main(String[] args) {
		double a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Mark:");
		a=s.nextDouble();
		gradeformark(a);
	}
	public static void gradeformark(double points) {
		if(points<=1000&&points>900)
		{
			System.out.println("Grade S");
		}
		else if(points<=900&&points>500)
		{
			System.out.println("Grade A");
		}
		else if(points<=500&&points>400)
		{
			System.out.println("Grade B");
		}
		else if(points<=400&&points>300)
		{
			System.out.println("Grade C");
		}
		else if(points<=300&&points>200)
		{
			System.out.println("Grade D");
		}
		else if(points<=200&&points>100)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
