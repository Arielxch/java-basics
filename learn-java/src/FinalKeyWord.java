public class FinalKeyWord {
    public static void main(String[] args) {
//        final: anything that is declared as final cannot be changed or updated later in your program
//        usually when we declare a final value for a variable, we will make all the letters UPPERCASE

        double pi = 3.1415926;
        pi = 3;
        System.out.println(pi);

        final double AI = 2.16;
//        if we assign AI = 1, the console will show "java: cannot assign a value to final variable ai"
        System.out.println(AI);
    }
}
