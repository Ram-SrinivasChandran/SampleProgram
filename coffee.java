import java.util.*;
class Virtusa{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int b = s.nextInt();
        System.out.println("Welcome to CCD!");
        if (a == 'c' || a == 'C') {
            if (b == 1) {
                System.out.println("Enjoy your Espresso coffee");
            } else if (b == 2) {
                System.out.println("Enjoy your Cappuccino coffee");
            } else if (b == 3) {
                System.out.println("Enjoy your Latee coffee");
            } else {
                System.out.println("Invalid Input");
            }
        }
        else if (a == 't' || a == 'T') {
            if (b == 1) {
                System.out.println("Enjoy your Plain Tea");
            } else if (b == 2) {
                System.out.println("Enjoy your Assam Tea");
            } else if (b == 3) {
                System.out.println("Enjoy your Ginger Tea");
            } else if (b == 4) {
                System.out.println("Enjoy your Masala Tea");
            } else {
                System.out.println("Invalid Input");
            }
        }
        else if (a == 's' || a == 'S') {
            if (b == 1) {
                System.out.println("Enjoy your Hot & Soup");
            } else if (b == 2) {
                System.out.println("Enjoy your Veg Corn");
            } else if (b == 3) {
                System.out.println("Enjoy your Tomato Soup");
            } else {
                System.out.println("Invalid Input");
            }
        }
        else if (a == 'b' || a == 'B') {
            if (b == 1) {
                System.out.println("Enjoy your Hot Chocolate Drink");
            } else if (b == 2) {
                System.out.println("Enjoy your Badam Drink");
            } else if (b == 3) {
                System.out.println("Enjoy your Badam Pista Drink");
            } else {
                System.out.println("Invalid Input");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
