import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {

//        Scanner theNumber = new Scanner(System.in);
//        System.out.println("please enter a number between 1 to 10");
//        int number = theNumber.nextInt();
//        do {
//            System.out.println(number + " is between 1 to 10");
//        } while (number >1 && number < 10);


        Scanner theNumber = new Scanner(System.in);
        System.out.println("please enter a number between 1 to 10");
        String number = theNumber.nextLine();
        boolean theEnter = !number.isBlank();
        do {
            int numberInt = Integer.parseInt(number);
            if (numberInt >=1 && numberInt <=10) {
                System.out.println(number + " is between 1 to 10");
                break;
            } else {
                System.out.println(number + " is not between 1 to 10");
                break;
            }
        }
        while (theEnter);

//        Scanner theNumber = new Scanner(System.in);
//        String number = theNumber.nextLine();
//        using while loop to do the exercise:
//        boolean isBlank = number.isBlank();
//        while (isBlank) {
//            System.out.println("Enter a number between 1 and 10");
//            number = theNumber.nextLine();
//            isBlank = number.isBlank();
//            if (!isBlank){
//                int enteredNumber = Integer.parseInt(number);
//            if (enteredNumber >=1 && enteredNumber <= 10){
//                System.out.println(number + " is between 1 and 10");
//                }
//                else {
//                    System.out.println(number + " is not between 1 and 10");
//                    isBlank = true;
//                }} else {
//                isBlank = true;
//
//            }
//            }



        }







}
