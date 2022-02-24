import java.util.concurrent.ThreadLocalRandom;

public class theThreadLocalRandom {
    public static void main(String[] args) {
        theRandom(1,2);

    }
    // This class has methods to generate random numbers.
    // ThreadLocalRandom class has a method nextInt() which takes two arguments representing the lower and upper boundary values and returns an integer between those values.
    // The result will be between lower boundary(inclusive) and upper boundary(exclusive).

    public static void theRandom(double x, double y){
        double a = ThreadLocalRandom.current().nextDouble(x, y);
        System.out.printf("%.2f",a);
    }


}
