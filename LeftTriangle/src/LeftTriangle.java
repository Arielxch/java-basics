import java.util.Scanner;

public class LeftTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("> run LeftTriangle ");
        int theInteger = input.nextInt();
        printLeftTriangle(theInteger);
    }

    public static void printLeftTriangle(int theInteger){
        if (theInteger >= 0) {
            for (int i = 1; i <= theInteger; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error: input value must be >= 0");
            System.out.print(">");
            System.exit(0);
        }
    }
}
