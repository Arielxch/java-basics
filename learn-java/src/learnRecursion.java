import java.util.Scanner;

public class learnRecursion {
    public static void main(String[] args) {

        // recursion is a method that calls itself continuously;
        // a method that calls itself is called a recursive method;
        // useful for factorials, transversing trees, and simplifying a complex task;


        Scanner sayHello = new Scanner (System.in);
        System.out.println("How many times do you want to say Hello?");
        int number = sayHello.nextInt();
        HelloWorld (number);

    }
    static void HelloWorld (int n) {
        if(n > 0){
            System.out.println("Hello World " + n);
            n--;
            HelloWorld(n);
        }
    }
}
