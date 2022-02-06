public class SwapVariables {
    public static void main(String[] args) {
        String a = "John";
        String b = "Lucy";
        String temp = null;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
}

