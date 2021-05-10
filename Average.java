import java.util.*;
class Average {
	public static void main(String[] args) {
		int a,b,c,d,e,average;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=s.nextInt();
		System.out.println("Enter b value:");
		b=s.nextInt();
		System.out.println("Enter c value:");
		c=s.nextInt();
		System.out.println("Enter d value:");
		d=s.nextInt();
		System.out.println("Enter e value:");
		e=s.nextInt();
		average=(a+b+c+d+e)/5;
		System.out.println("The Average of the values is:"+average);
	}
}