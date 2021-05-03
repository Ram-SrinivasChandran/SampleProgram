import java.util.concurrent.ThreadLocalRandom;
public class Threadrandom{
	public static void main(String[] args) {
		int a=ThreadLocalRandom.current().nextInt();
		int b=ThreadLocalRandom.current().nextInt();
		System.out.println("Random Thread value from Integer:");
		System.out.println(a);
		System.out.println(b);
		double c=ThreadLocalRandom.current().nextDouble();
		double d=ThreadLocalRandom.current().nextDouble();
		System.out.println("Random Thread value from Double:");
		System.out.println(c);
		System.out.println(d);
		boolean e=ThreadLocalRandom.current().nextBoolean();
		boolean f=ThreadLocalRandom.current().nextBoolean();
		System.out.println("Random Thread value from Boolean:");
		System.out.println(e);
		System.out.println(f);
		
	}

}