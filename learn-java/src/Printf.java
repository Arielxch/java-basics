public class Printf {
    public static void main(String[]args){
//        printf()= an optional method to control, format, and display text to the console window;
//                  two arguments = format string + (object/variable/value)
//                  %[flags][precision][width][conversion-character]
        System.out.printf("%d this is a format string", 123);
        System.out.println();

//        [conversion-character]
        boolean myBoolean = true;
        char myChar = 'A';
        String studentName = "John Smith";
        int studentNumber = 12345;
        double GPA = 3.75;
        int tuitionFees = 80000;
        int moneyOwed = -30000;

        System.out.print("%printf used for boolean:");
        System.out.printf("%b this is printf used for boolean", myBoolean);
        System.out.println();

        System.out.println("%printf used for character:");
        System.out.printf("%c this is printf used for character", myChar);
        System.out.println();

        System.out.println("%printf used for string:");
        System.out.printf("%s this is printf used for string", studentName);
        System.out.println();

        System.out.print("%printf used for integer:");
        System.out.printf("%d this is printf used for int", studentNumber);
        System.out.println();

        System.out.println("%printf used for double");
        System.out.printf("%f This is printf used for double", GPA);
        System.out.println();

//        [width]
//        minimum number of characters (spaces) to be written as output; negative number is left align; positive number is right align; (count from the last space)
        System.out.printf("%-15s%-10d%6f", studentName, studentNumber, GPA);
        System.out.println();

//        [precision]
//        set number of digits of precision when outputting floating-point value: .x(number)
        System.out.printf("%s's GPA is %.3f", studentName, GPA);

//        [flags]
//        adds an effect to the output based on the flag added to format specifier;
//        -: left-justify;
//        +: output a plus (+) or minus (-) sign for the numeric value;
//        0: numeric values are zero-padded;
//        ,: comma grouping separator if numbers > 1000;

        System.out.printf("%s's tuition fee is $%,d, he owes $%,d, thus in his account, it shows that his balance is %+,d", studentName, tuitionFees, tuitionFees, moneyOwed);













    }
}
