public class OverloadedMethod {
    // Overloaded methods = methods that share the same name but have different parameters:
    // method name + method parameters = method signature

    public static void main(String[] args) {

        int x = add(1,2);
        System.out.println(x);
        System.out.println();

        int y = add (1,2,3);
        System.out.println(y);
        System.out.println();

        int z = add (1,2,3,4);
        System.out.println(z);
        System.out.println();


        double x1 = add(1.1,2.2);
        System.out.println(x1);
        System.out.println();

        double y1 = add (1.1,2.2,3.3);
        System.out.println(y1);
        System.out.println();

        double z1 = add (1.1,2.2,3.3,4.4);
        System.out.println(z1);
        System.out.println();


        String added1 = add1("yes", 3.2, 6.5, 7.1);
        System.out.println(added1);

    }

    // overloaded with int
    static int add(int a, int b) {
        System.out.println("This is overloaded No.1: ");
        return a + b;
    }

    static int add (int c, int d, int e){
        System.out.println("This is overloaded No.2: ");
        return  c + d + e;
    }



    static int add (int f, int g, int h, int i){
        System.out.println("This is overloaded No.3: ");
        return  f + g + h + i;
    }

    // overloaded with double:

    static double add(double a, double b) {
        System.out.println("This is overloaded No.4: ");
        return a + b;
    }

    static double add (double c, double d, double e){
        System.out.println("This is overloaded No.5: ");
        return  c + d + e;
    }



    static double add (double f, double g, double h, double i){
        System.out.println("This is overloaded No.6: ");
        return  f + g + h + i;
    }

    static String add1 (String f, double g, double h, double i){
        System.out.println("you can put primitive type data with String: ");
        return f + g + h + i;
    }




}
