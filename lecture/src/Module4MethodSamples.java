public class Module4MethodSamples {
    public static void main(String[] args) {
        int a = -2;
        int b = 30;
        double result = add(a,b);
        double secondResult = doSomething(a);
        int r = 3;
        String herName = "" + 3; // concatenate the int with an empty ""(without space) makes the int a string
        System.out.println(name(herName));
        System.out.println(area(r));
        System.out.println(secondResult);
        System.out.println(a);
        double showStudent = abs(a);
        System.out.println(showStudent);


    }



    // creating a new method in the class
    // DRY principal: Do not repeat yourself
    // System.out.println is not equal to return; return means you have to return something; sout simply means you need to present something
    public static double add(int a, int b){
        return (double) a + b;
    }
    public static double doSomething(int a){
        a += 10;
        return a;
    }

    public static int abs(int a){
        if (a > 0) {
            return 99;
        } else{
            return -99;
        }
    }

    public static double area (int radius){
        double theResult = Math.PI* Math.pow(radius, 2);
        return theResult; // if the "double" is "void", just return, do not put theResult after
    }

    public static boolean name(String herName){
        System.out.println(herName + " is a good name!");
        return false;
    }

}

// when concatenate an empty string with an int, the int becomes a string. Ex. ""+ a = "a"
// String.valueOf(x) is another way to make an int to a string
// Integer.parseIn(x) is to parse a string to an int