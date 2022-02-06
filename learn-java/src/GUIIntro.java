import javax.swing.*;

public class GUIIntro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));
        JOptionPane.showMessageDialog(null, "you are " + height + "cm tall");

        String degree = JOptionPane.showInputDialog("What is your highest educational level?");
        JOptionPane.showMessageDialog(null, "Your highest educational level is " + degree);

        int workExp = Integer.parseInt(JOptionPane.showInputDialog("How many years of relevant work experiences do you have?"));
        JOptionPane.showMessageDialog(null, "You have " + workExp + " years of relevant work experiences");

        double sight = Double.parseDouble(JOptionPane.showInputDialog("What is your eye sight?"));
        JOptionPane.showMessageDialog(null, "Your eyesight is " + sight);






    }
}
