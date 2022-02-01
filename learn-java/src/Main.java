import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This is single line comment
        /*
         * This is multi line comment
         * */
        System.out.println("Hooray my first java app!");

        // Temp types
        int number = 2;
        double decimal = 100.10;
        String brand = "y5";
        Date date = new Date();

        // Primitive data types
        // Whole numbers
        byte theByte = -128;      // 1 byte;  Stores whole numbers from -128 to 127
        short theShort = 32_123;   // 2 bytes; Stores whole numbers from -32,768 to 32,767
        int theInt = 785_949_304;   // 4 bytes; Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long theLong = 9_222_372_035_843_294_932L; // 8 bytes; Stores whole numbers from -9,223,372,036,854,755,808 to 9,223,372,036,854,775,807

        // Decimals
        float theFloat = 3.14F;    // 4 bytes; Stores fractional numbers for 6 to 7 decimal digits
        double theDouble = 3.1415213332532432432509089898; // 8 bytes; Stores fractional numbers for 15 decimal digits

        // Boolean
        // 1 byte = 8 bits
        boolean theBoolean = true; // 1 but; Stores true or false values

        // Character
        char theChar = 'X';

        // sout for System.out.println();
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(theBoolean);
        System.out.println(theChar);

        // Non-primitive data types/ reference types
        String newString = new String("newString");
        System.out.println(newString.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        int a = 10;
        int b = a;
        a = 100;
        String resultToPrint = "a: " + a + ", b: " + b;
        System.out.println(resultToPrint);

        Person Alex = new Person("Alex", 10);
        Person Mary = Alex;

        System.out.println("Before changing name");
        System.out.println("Alex's name is: " + Alex.name + ", Mary's name is: " + Mary.name);

        System.out.println("After changing name to Bob");
        Alex.name = "Bob";
        System.out.println("Alex's name is: " + Alex.name + ", Mary's name is: " + Mary.name);

        Laptop lenovo = new Laptop("Lenovo", 1000.50, 14.0, true, 500.25, "Windows");
        Laptop legion = new Laptop("Lenovo", 1000.50, 14.0, true, 500.25, "Windows");
        Laptop macbook = new Laptop("Apple", 2000.50, 13.0, false, 300.25, "Macos");


        Laptop dell = lenovo;
        System.out.println("lenovo brand: " + lenovo.brand);
        System.out.println("dell brand: " + dell.brand);
        System.out.println("legion brand: " + legion.brand);

        System.out.println("now changing to HP");
        // change brand
        dell.brand = "hp";
        System.out.println("lenovo brand: " + lenovo.brand);
        System.out.println("dell brand: " + dell.brand);
        System.out.println("legion brand: " + legion.brand);

        // Naming variables
        int zero = 0;
        int one = 1;
        double pi = 3.1415;
        int subscriberCount = 2_000_000;

        // The String class
        // String stringName = new String("TheName");
        String stringName = "TheName";
        System.out.println(stringName.toUpperCase());
        System.out.println(stringName.toLowerCase());
        System.out.println(stringName.charAt(0));

        // String newContain = new String("Name");
        String newContain = "Name";
        System.out.println(stringName.contains(newContain));
        System.out.println(stringName.equals(newContain));

        // Import packages
        Date packageDate = new Date();
        java.sql.Date packageSQLDate = new java.sql.Date(1);
        LocalDate packageLocalDate = LocalDate.now();
        LocalDateTime packageLocalDateTime = LocalDateTime.now();

        // Arithmetic operations
        // ctr + alt + N: refactor inline variable
        int addition = 10 + 2;
        System.out.println(addition);
        System.out.println(10 - 2);
        System.out.println(10 * 2 + 7);
        System.out.println(10 % 2);

        // Math class
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3.6, 10.11));
        System.out.println(Math.min(3.6, 10.11));
        System.out.println(Math.pow(5.0, 2.0));
        System.out.println((int) Math.pow(5.0, 2.0));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.PI);

        // Comparison operators
        System.out.println(18 > 20);
        System.out.println(18 >= 20);
        System.out.println(18 < 20);
        System.out.println(18 <= 20);
        System.out.println(20 == 20);
        System.out.println(20 != 20);

        // Logical operations
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println((isAdult || isStudent) && isMember);
        System.out.println((isAdult || isStudent) && !isMember);
        System.out.println(10 > 8 || 2 <= 2 && isAdult);

        // if statement
        int ifAge = 17;
        if (ifAge >= 18) {
            System.out.println("Adult");
        } else if (ifAge >= 16 && ifAge < 18) {
            System.out.println("Almost an adult");
        } else {
            System.out.println("Not adult");
        }

        // Ternary operator
        String ternaryMsg = ifAge >= 18 ? "Adult" : "Not Adult";
        System.out.println(ternaryMsg);

        // Switch statement
        String switchGender = "FEMALE";
        if (switchGender.equals("FEMALE")) {
            System.out.println("It's Female");
        } else if (switchGender.equals("MALE")) {
            System.out.println("It's Male");
        } else if (switchGender.equals("PREFER_NOT_TO_SAY")) {
            System.out.println("It's prefer not to say");
        } else {
            System.out.println("Can't recognize the gender");
        }

        switch (switchGender) {
            case "FEMALE":
                System.out.println("It's Female");
            case "MALE":
                System.out.println("It's Male");
            case "PREFER_NOT_TO_SAY":
                System.out.println("It's prefer not to say");
            default:
                System.out.println("Can't recognize the gender");
        }

        // Arrays
        int[] arraysNumbers = new int[2];
        arraysNumbers[0] = 100;
        int[] arraysNumbersNew = {2, 0, 1};
        int arraysIndex2 = arraysNumbersNew[2];
        System.out.println(Arrays.toString(arraysNumbers));
        System.out.println(arraysNumbers.length);
        System.out.println(Arrays.toString(arraysNumbersNew));
        System.out.println(arraysNumbersNew.length);
        System.out.println(arraysIndex2);


        boolean[] arraysBooleans = new boolean[2];
        System.out.println(Arrays.toString(arraysBooleans));

        char[] arraysChars = new char[2];
        System.out.println(Arrays.toString(arraysChars));

        String[] arraysStrings = new String[2];
        String[] arraysStringsNew = {"foo", "bar", "baz"};
        System.out.println(Arrays.toString(arraysStrings));
        System.out.println(Arrays.toString(arraysStringsNew));

        // Loops
        int[] loopsNumbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] loopsStrings = {"foo", "bar", "baz", "zoo"};
        for (int i = 0; i < loopsNumbers.length - 1; i++) {
            if (i !=0) {
                System.out.println("Previous index value: " + loopsNumbers[i - 1]);
            }
            System.out.println("Current index value: " + loopsNumbers[i]);
            if (i != loopsNumbers.length - 1) System.out.println("Next index value: " + loopsNumbers[i + 1]);
            System.out.println("---------------");
        }

        for (int i = loopsNumbers.length - 1; i > 0; i--) {
            System.out.println(loopsNumbers[loopsNumbers.length - 1 - i]);
        }

        for (int loopNumber : loopsNumbers) {
            System.out.println(loopNumber);
        }

        for (String loopString : loopsStrings) {
            System.out.println(loopString);
        }

        Arrays.stream(loopsNumbers).forEach(System.out::println);

        // Break and continue
        for (String loopString : loopsStrings) {
            if (loopString.equals("bar")) break;
            System.out.println(loopString);
        }

        for (String loopString : loopsStrings) {
            if (loopString.startsWith("b")) continue;
            System.out.println(loopString);
        }

        // While loop
        int whileLoopCount = 0;
        while (whileLoopCount <= 20) {
            System.out.println("while loop count: " + whileLoopCount);
            whileLoopCount++;
        }

        // Do while loop
        int doWhileLoopCount = 21;
        do {
            System.out.println("do while loop count: " + doWhileLoopCount);
            doWhileLoopCount++;
        }
        while (doWhileLoopCount <=20);

        // Scanner class
        /*
        Scanner scannerClassScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String scannerUserName = scannerClassScanner.nextLine();
        System.out.println("Username: " + scannerUserName);

        System.out.println("How old are you?");
        int scannerAge = scannerClassScanner.nextInt();
        int scannerYear = LocalDate.now().minusYears(scannerAge).getYear();
        System.out.println("You were born in " + scannerYear);

        // Add extra empty nextLine to get input from next nextLine
        scannerClassScanner.nextLine();
        String scannerUserGender = scannerClassScanner.nextLine();
        System.out.println("Your gender is " + scannerUserGender);
        */

        // Methods
        System.out.println("Hello");
        String methodsBrand = "Samsung";
        System.out.println(methodsBrand.toUpperCase());
        System.out.println(methodsBrand.startsWith("S"));
        System.out.println(methodsBrand.endsWith("s"));

        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D', 'D'};
        int methodsCount = countOccurrences(letters, 'A');
        System.out.println(methodsCount);

        // Classes
        Lens lensOne = new Lens("Foo", "85mm", false);
        Lens lensTwo = new Lens("bar", "100mm", true);
        Lens lensThree = new Lens("baz", "100-200mm", true);
        System.out.println("Lens 1's brand: " + lensOne.brand + ", focal length: " + lensOne.focalLength + ", and is prime: " + lensOne.isPrime);
        System.out.println("Lens 2's brand: " + lensTwo.brand + ", focal length: " + lensTwo.focalLength + ", and is prime: " + lensTwo.isPrime);
        System.out.println("Lens 3's brand: " + lensThree.brand + ", focal length: " + lensThree.focalLength + ", and is prime: " + lensThree.isPrime);

        // Passport example
        Passport p1 = new Passport("A123456", LocalDate.now());
    }

    static class Passport {
        String number;
        LocalDate expiryDate;

        Passport(String theNumber, LocalDate theExpiryDate) {
            this.number = theNumber;
            this.expiryDate = theExpiryDate;
        }
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        // constructor
        Lens(String theBrand, String theFocalLength, boolean theIsPrime) {
            this.brand = theBrand;
            this.focalLength = theFocalLength;
            this.isPrime = theIsPrime;
        }
    }

    public static int countOccurrences(char[] theLetters, char theSearchLetter) {
        System.out.println("countOccurrences was invoked!");
        System.out.println("theLetters array: " + Arrays.toString(theLetters));
        System.out.println("theSearchLetter: " + theSearchLetter);
        int count = 0;
        for (char theLetter : theLetters) {
            if (theLetter == theSearchLetter) {
                count++;
            }
        }
        return count;
    }

    static class Person {
        String name;
        int age;

        Person(String theName, int theAge) {
            this.name = theName;
            this.age = theAge;
        }
    }

    static class Laptop {
        // properties
        String processor;
        String brand;
        double screenSize;
        double price;
        boolean isBlack;
        double weight;
        String opreatingSysyem;

        // constructor
        Laptop (String theBrand, double thePrice, double theScreenSize, boolean theIsBlack, double theWeight, String theOperatingSystem) {
            this.processor = "i5-1000k";
            this.brand = theBrand;
            this.price = thePrice;
            this.isBlack = theIsBlack;
            this.weight = theWeight;
            this.opreatingSysyem = theOperatingSystem;
            this.screenSize = theScreenSize;

            int x = 3 / 5;
            System.out.println(1 + "is" + x * 20);

        }
    }
}
