import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("> run RightTriangle ");
        int theInteger = input.nextInt();
        printRightTriangle(theInteger);
    }

    public static void printRightTriangle(int theInteger){
        if (theInteger >= 0) {
            for (int i = 1; i <= theInteger; i++) {
                // show spaces;
                for (int j = 1; j <= theInteger - i; j++) {
                    System.out.print(" ");
                }
                // show *;
                for (int s = 0; s < i; s++){
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
