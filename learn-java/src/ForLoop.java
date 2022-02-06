import java.util.Random;

public class ForLoop {
    public static void main (String args []){
        // for loop = executes a block of code a limited amount of time (depends on i)

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " : Java is fun!");
//        }
//
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i + " : Java is fun!");
//        }
//
//        for (int i = 0; i <= 10; i += 2) {
//            System.out.println(i + " : Java is fun!");
//        }
//
//        for (int i = 10; i >= 0; i-=2) {
//            System.out.println(i + " : Java is fun!");
//        }

        for (int i = 0; i <=10; i++){
            Random number = new Random();
            System.out.println(i + " : " + number.nextInt(12));

        }
    }
}
