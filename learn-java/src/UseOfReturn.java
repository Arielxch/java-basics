import java.util.Locale;

public class UseOfReturn {
    public static void main(String[] args) {
//        return statement allows you to run a method and bring the result of that method into a variable, you need NOT to use void in rerurn method
//        The void keyword specifies that a method should not have a return value.
        printMessage();
        int sum = add (5, 4);
        System.out.println(sum);
        String shouting = caps("why do you eat all of the leechy in the fridge?");
        System.out.println(shouting);
        int [] awesomeArray = anArrayOfInt(1,2,3);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);


    }

    public static void printMessage (){
        System.out.println("This is our first method");
    }

    public static int add (int a, int b){
        return (a + b);
    }

    public static String caps(String s){
        return s.toUpperCase(Locale.ROOT);
    }

    public static int[] anArrayOfInt (int a, int b, int c){
        int [] array = new int[3];
        array [0] = a;
        array [1] = b;
        array [2] = c;
        return array;
    }

}
