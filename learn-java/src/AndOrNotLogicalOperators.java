import java.util.Scanner;

public class AndOrNotLogicalOperators {
    public static void main(String[] args) {
        // &&; ||; !=

        //And &&
        int temp = 25;
        if (temp > 30){
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp <= 30){
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }
        System.out.println();

       //Or ||
       Scanner quit = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = quit.next();
        if (response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still play the game *Pew Pew*");
        }
       System.out.println();

        //Not !=

        Scanner age = new Scanner(System.in);
        System.out.println("What is your age?");
        int yourAge = age.nextInt();
        if (yourAge != 18){
            System.out.println("you are either younger or older than 18 years old");
        } else {
            System.out.println("You are 18 years old!");
        }




    }
}
