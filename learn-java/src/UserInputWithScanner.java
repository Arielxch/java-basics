import java.util.Scanner;

public class UserInputWithScanner {
    public static void main(String[] args) {
        Scanner basicInfo = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = basicInfo.nextLine();


        System.out.println("What is your age?");
        int age = basicInfo.nextInt();

        /* the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
        and so the call to Scanner.nextLine returns after reading that newline.
        You will encounter the similar behaviour when you use Scanner.nextLine after Scanner.next() or
        any Scanner.nextFoo method (except nextLine itself).
        Workaround:put a Scanner.nextLine call after each Scanner.nextInt or Scanner.nextFoo to consume rest of that line including newline*/
        basicInfo.nextLine();

        System.out.println("Which city do you live in?");
        String city = basicInfo.nextLine();


        System.out.println("How many people are there in your family?");
        int family = basicInfo.nextInt();

        System.out.println("Hello! " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You live in " + city);
        System.out.println("There are " + family + " people in your family.");



    }
}
