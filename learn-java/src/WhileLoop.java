import javax.swing.*;
import java.util.Scanner;

public class JavaWhileLoop {
    public static void main(String[] args) {
         // while loop = executes a block of code as long as its condition remains true

//        Scanner question = new Scanner (System.in);
//        String name = "";
//        while (name.isBlank()){
//            System.out.println("Please enter your name: ");
//            name = question.nextLine();
//        }
//        System.out.println("Hello! " + name);
//
        String name = "";
        while (name.isBlank()){
            name = JOptionPane.showInputDialog("What is your name");
        }
        JOptionPane.showMessageDialog(null, "Hello " + name);

        String a = "";
        String b = "";
        String c = "";

        while (a.isBlank()){
            a = JOptionPane.showInputDialog("What is you first math exam grade?");
        }
        JOptionPane.showMessageDialog(null, "You score " + a + " in your first exam.");

        while (b.isBlank()){
            b = JOptionPane.showInputDialog("What is your second math exam grade?");
        }
        JOptionPane.showMessageDialog(null, "You scored " + b + " in your second exam.");

        while (c. isBlank()){
            c = JOptionPane.showInputDialog("What is your third math exam grade?");
        }
        JOptionPane.showMessageDialog(null, "You scored " + c + " in your third exam");

        int average = (Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c)) / 3;

        JOptionPane.showMessageDialog(null, "Your average score is " + average);





    }
}
