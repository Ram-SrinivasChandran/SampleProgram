import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to be entered:");
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india= NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}