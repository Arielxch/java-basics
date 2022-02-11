import javax.swing.*;
import java.util.Scanner;

// While loop:
// while (boolean-expression) {
//            statement(s)           }

public class WhileLoop {
    public static void main(String[] args) {
         // while loop = executes a block of code as long as its condition remains true

//
//        example 1:

//        int i = 1; // used in the condition
//        while (i<=5) {
//        System.out.println ("Hello" + i);
//         i++; }
//        // i ++ --> this is very important, without this, the condition is always true, and the loop will be infinitive. i++ can only be placed here, not in the condition.
//
//        example 2:
//        Scanner herName = new Scanner(System.in);
//        String name = "";
//        boolean fillOut = true;
//        while (fillOut){
//            System.out.println("What is your mother's name");
//            name = herName.nextLine();
//            if (!name.isBlank()) {
//                fillOut = false;
//            }
//        }
//        System.out.println("You mother's name is " + name);


        // example 3:
//        Scanner question = new Scanner (System.in);
//        String name = "";
//        while (name.isBlank()){
//            System.out.println("Please enter your name: ");
//            name = question.nextLine();
//        }
//        System.out.println("Hello! " + name);


//      example 4:
//        String name = ""; // this is very important, without the empty string, the while loop won't be able to start
//        // because only when name is blank, the condition of the while loop is met;
//        while (name.isBlank()){
//            name = JOptionPane.showInputDialog("What is your name");
//        }
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        String a = "";
//        String b = "";
//        String c = "";
//
//        while (a.isBlank()){
//            a = JOptionPane.showInputDialog("What is you first math exam grade?");
//        }
//        JOptionPane.showMessageDialog(null, "You score " + a + " in your first exam.");
//
//        while (b.isBlank()){
//            b = JOptionPane.showInputDialog("What is your second math exam grade?");
//        }
//        JOptionPane.showMessageDialog(null, "You scored " + b + " in your second exam.");
//
//        while (c. isBlank()){
//            c = JOptionPane.showInputDialog("What is your third math exam grade?");
//        }
//        JOptionPane.showMessageDialog(null, "You scored " + c + " in your third exam");
//
//        int average = (Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c)) / 3;
//
//        JOptionPane.showMessageDialog(null, "Your average score is " + average);

        // example 5
//
//        Scanner enterNumber = new Scanner (System.in);
//        System.out.println("please enter a number between 1 to 10");
//        int theNumber = 0;
//        boolean isNumInValid = theNumber < 1 || theNumber >10;
//        while (isNumInValid){
//            String stringNum = enterNumber.nextLine();
//            if (!stringNum.isBlank()) {
//                theNumber = Integer.parseInt(stringNum);
//                isNumInValid = theNumber < 1 || theNumber >10;
//                if (isNumInValid) {
//                    System.out.println(theNumber + " is not between 1 and 10; try again.");
//                }
//            } else {
//                System.out.println("please enter a number between 1 to 10");
//            }
//        }
//        System.out.println("The number you enter is " + theNumber);
//
//        Scanner enterNumber = new Scanner (System.in);
//        String initValue= "";
//
//        while (initValue.isBlank()) {
//            System.out.println("please enter a number between 1 to 10");
//            initValue = enterNumber.nextLine();
//            if (!initValue.isBlank()) {
//                int number = Integer.parseInt(initValue);
//                if (number >=1 && number <=10){
//                    System.out.println("The number you entered is " + number);
//                } else {
//                    initValue = "";
//                }
//            }
//
//
//        }
// request 3 times for 3 numbers; print these numbers
// if any number is not 1-10; 2-20; 3-30 or empty, repeat question of the current number (which does not meet the requirement)

        Scanner theRequest = new Scanner (System.in);
        String number1 ="";
        String number2="";
        String number3="";
        boolean isNum1Blank = number1.isBlank();
        boolean isNum2Blank = number2.isBlank();
        boolean isNum3Blank = number3.isBlank();

        while (isNum1Blank) {
            System.out.println("Enter first number between 1- 10");
            number1 = theRequest.nextLine();
            isNum1Blank = number1.isBlank();
            if (!isNum1Blank) {
                int num1Int = Integer.parseInt(number1);
                if (num1Int >= 1 && num1Int <= 10) {
                    System.out.println("the number you enter is " + number1);
                } else {
                    System.out.println("the number you enter is not valid");
                    isNum1Blank=true;
                }
            }
        }

        while (isNum2Blank) {
            System.out.println("Enter number 2 between 20 to 30");
            number2=theRequest.nextLine();
            isNum2Blank= number2.isBlank();
            if (!isNum2Blank){
                int number2Int = Integer.parseInt(number2);
                    if (number2Int > 20 && number2Int < 30){
                        System.out.println(number2 + " is between 20 to 30");
                    } else {
                        System.out.println("The number you entered is invalid");
                        isNum2Blank = true;
                    }
                }
            }

        while (isNum3Blank) {
            System.out.println("Enter the third number between 30 to 40");
            number3 = theRequest.nextLine();
            isNum3Blank = number3.isBlank();
            if (!isNum3Blank){
                int number3Int = Integer.parseInt(number3);
                if (number3Int > 30 && number3Int < 40){
                    System.out.println(number3 + " is between 30 to 40");
                } else {
                    System.out.println(number3 + " is not a valid number");
                    isNum3Blank = true;
                }
            }
        }




        }




    }




