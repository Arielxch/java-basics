import javax.swing.*;
import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        // Nested loop = a loop inside a loop


        // Use scanner:
//        Scanner showSymbol = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//        System.out.println("Enter number of rows: ");
//        rows = showSymbol.nextInt();
//        showSymbol.nextLine();
//
//        System.out.println("Enter number of columns: ");
//        columns =showSymbol.nextInt();
//        showSymbol.nextLine();
//
//        System.out.println("Enter symbol to use: ");
//        symbol = showSymbol.nextLine();
//
//        for (int i = 0; i <= rows ; i++){ // step 1, execute the first loop from i = 0;
//            System.out.println(); // step 2, print a blank then goes to the next line (second line);
//            for (int j = 0; j <= columns; j++){ // step 3, print symbol from j = 0 in the second line (then repeat from step 1 from i = 1)
//                System.out.print(symbol);
//            }
//        }

        // another example
//        Scanner pattern = new Scanner(System.in);
//        System.out.println("What is the number of rows?");
//        int rows = pattern.nextInt();
//        System.out.println("What is the number of columns?");
//        int column = pattern.nextInt();
//        pattern.nextLine();
//        System.out.println("What is the symbol you'd like to use?");
//        String symbol = pattern.nextLine();
//
//        for (int i = 1; i < rows; i ++){
//            for (int j = 0; j < i; j++){
//                System.out.print(symbol);
//            }
//            System.out.println();
//        }

        // Another example:
//
//        Scanner pattern = new Scanner(System.in);
//        System.out.println("What is the number of rows?");
//        int rows = pattern.nextInt();
//        System.out.println("What is the number of columns?");
//        int column = pattern.nextInt();
//        pattern.nextLine();
//        System.out.println("What is the symbol you'd like to use?");
//        String symbol = pattern.nextLine();
//
//        for (int i = 1; i < rows; i ++){
//            System.out.println(symbol);
//            for (int j = 0; j < column; j++){
//                System.out.print(symbol);
//            }
//        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                   System.out.print(i);
                }
                System.out.println();
            }
        System.out.println();
        }





    // use JOptionPane

//        String a = "";
//        String b = "";
//        String s = "";
//        String symbolTwo = "";
//
//        a = JOptionPane.showInputDialog("Please enter the number of rows");
//        JOptionPane.showMessageDialog(null, "There are: " + a + " rows");
//
//        b = JOptionPane.showInputDialog("Please enter the number of column.");
//        JOptionPane.showMessageDialog(null, "There are " + b + " columns");
//
//        s = JOptionPane.showInputDialog("Please enter the symbol you like most");
//        JOptionPane.showMessageDialog(null, "The symbol of your choice is " + s);
//
//        int c = Integer.parseInt(a);
//        int d = Integer.parseInt(b);
//
//        for (int i = 1; i <=c; i++){
//            System.out.println();
//            for (int j = 1; j <= d; j++){
//                System.out.print(s);
//            }
//        }
//



















    }

