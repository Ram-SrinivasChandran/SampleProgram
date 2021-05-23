import java.util.*;
class Main
{
	public static void main(String[] args) {
		double a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the kilometer:");
		a=s.nextDouble();
		double miles=SpeedConverter.toMilesPerHour(a);
		System.out.println("Miles="+miles);
		SpeedConverter.printConversion(a);
	}
}