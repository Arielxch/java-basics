import java.util.Scanner;

public class UseOfContinue {
    public static void main(String[] args) {
//        continue The Java continue statement stops one iteration in a loop and continues to the next iteration.
//        This statement lets you skip particular iterations without stopping a loop entirely. Continue statements work in for and while(do while) loops.
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0)
                continue; // if i % 2 == 0; skip the rest below and return to i++
            System.out.print(i + " ");
        }
        System.out.println();

//        another example:
        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between 1 and 10");
            int n = number.nextInt();
            if (n < 1 || n > 10 )
                continue;
            System.out.println("The number you entered is " + n);
            break;
        }

    }
}
