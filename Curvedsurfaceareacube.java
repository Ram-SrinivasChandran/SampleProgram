import java.util.*;
class Curvedsurfaceareacube
{
	public static void main(String[] args) {
		double a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of the cube");
		a=s.nextDouble();
		double csa=(4*a*a);
		System.out.println("The Curvedsurfacearea of cube:"+csa);
	}
}