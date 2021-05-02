import java.util.Scanner;
public class Inputinoutput {
    public static void main (String[] args) {
        String line = "";
        Scanner in= new Scanner(System.in);
        System.out.println("Ask something");
        line = in.nextLine();
        System.out.println("You asked " + line);
    }
}