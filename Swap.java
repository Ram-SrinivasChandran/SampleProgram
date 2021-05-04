public class Swap {
public static void main(String[] args) {
	float first=1.25f,second=2.25f;
	System.out.println("------Before Swap------");
	System.out.println("First number "+first);
	System.out.println("Second number "+second);
	float temp;
	temp=first;
	first=second;
	second=temp;
	System.out.println("------After Swap------");
	System.out.println("First number "+first);
	System.out.println("Second number "+second);
}
}