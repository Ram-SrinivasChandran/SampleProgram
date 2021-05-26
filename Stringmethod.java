import java.util.*;
class Stringmethod
{
	public static void main(String[] args) {
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the Name:");
		name=s.nextLine();
		System.out.println("Uppercase:"+name.toUpperCase());
		System.out.println("Lowercase:"+name.toLowerCase());
	}
}