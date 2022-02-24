import java.util.Scanner;

public class CountingProgram {
    public static void main(String[] args) {
        Scanner theNumber = new Scanner(System.in);
        String a = "";
        boolean theFirstInputBoolean = a.isBlank();
        while (theFirstInputBoolean){
            System.out.println("Enter a number");
            a = theNumber.nextLine();
            theFirstInputBoolean= a.isBlank();
            if(theFirstInputBoolean) {
                System.out.println("The number you entered is not valid");
                theFirstInputBoolean = true;
                System.out.println();
            }
        }

        String b = "";
        boolean theSecondBoolean = b.isBlank();
        while (theSecondBoolean){
            System.out.println("Enter a positive number as a step size");
            b = theNumber.nextLine();
            theSecondBoolean = b.isBlank();
            if (theSecondBoolean){
                System.out.println("The number you entered is not valid");
                theSecondBoolean = true;
                System.out.println();
            } else {
                if (Integer.parseInt(b) < 0) {
                    System.out.println("Please enter a positive number");
                    theSecondBoolean = true;
                    System.out.println();
                }
            }
        }

        int theSecondInput = Integer.parseInt(b);
        int theFirstInput = Integer.parseInt(a);
            if (theFirstInput > 0){
                System.out.print("I am counting until: ");
                for (int i = 1; i < theFirstInput; i +=theSecondInput){
                    System.out.print(i + " ");
                }
            }else{
                System.out.print("I am counting until: ");
                for (int i = theFirstInput; i < 0; i +=theSecondInput){
                    System.out.print(i + " ");
                }
            }

    }


}

