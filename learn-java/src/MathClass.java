import java.util.Scanner;

public class MathClass {
    public static void main (String args[]){
        double a = 3.15;
        double b = 10.6;

        System.out.println("The max value is: ");
        double max = Math.max(a, b);
        System.out.println(max + "\n");

        System.out.println("The min value is: ");
        double min = Math.min(a, b);
        System.out.println(min + "\n");

        System.out.println("The absolute value of b is: ");
        double abs = Math.abs(b);
        System.out.println(abs + "\n");

        System.out.println("The square root of b is: ");
        double root = Math.sqrt(b);
        System.out.println(root + "\n");

        System.out.println("The round of b is: ");
        double rounded = Math.round(b);
        System.out.println(rounded + "\n");

        System.out.println("The ceil of a is: ");
        int ceil = (int) Math.ceil(a);
        System.out.println(ceil + "\n");

        // program to calculate the hypotenuse of a triangle
        double x;
        double y;
        Scanner hypotenuse = new Scanner(System.in);
        System.out.println("What is the value of the right angle side x?");
        x = hypotenuse.nextDouble();
        System.out.println("What is the value of the right angle side y");
        y = hypotenuse.nextDouble();
        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The hypotenuse of the triangle is: " + z);
        hypotenuse.close(); // It is always recommended using X(scannerName).close() to close a scanner



    }
}
