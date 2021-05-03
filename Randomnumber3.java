import java.util.Random;
public class Randomnumber3
{
	public static void main(String[] args) {
		Random random=new Random();
		int x=random.nextInt(20);
		int y=random.nextInt(200);
		System.out.println("Randomly generated Integer value:");
		System.out.println(x);
		System.out.println(y);
		double a=random.nextDouble();
		double b=random.nextDouble();
		System.out.println("Randomly generated Double value:");	
		System.out.println(a);
		System.out.println(b);
		float e=random.nextFloat();
		float f=random.nextFloat();
		System.out.println("Randomly generated Float value:");	
		System.out.println(e);
		System.out.println(f);
		long h=random.nextLong();
		long g=random.nextLong();
		System.out.println("Randomly generated Long value:");	
		System.out.println(h);
		System.out.println(g);
		boolean i=random.nextBoolean();
		boolean j=random.nextBoolean();
		System.out.println("Randomly generated Boolean value:");	
		System.out.println(i);
		System.out.println(j);

	}
}