import java.util.Random;

public class JavaRandomNumbers {
    public static void main(String args[]){
        Random randomNumber = new Random();
        int x = randomNumber.nextInt();
        System.out.println(x);

        // limit the size of the int
        System.out.println("0-5: ");
        int y = randomNumber.nextInt(6); // 0-5; upper bound excluded
        System.out.println(y);
        System.out.println();

        // if you want to have 0-6 (upper bound included)
        System.out.println("0-6: ");
        int z = randomNumber.nextInt(6+1);// upper bound included, 0-7 (7 is not included)
        System.out.println(z);
        System.out.println();

        // if you want to have 1-6 (0 excluded, but upper bound included)
        System.out.println("1-6: ");
        int t = randomNumber.nextInt(6) + 1;// upper bound included, 0+1....5+1
        System.out.println(t);
        System.out.println();

        // Random boolean:
        System.out.println("Random boolean: ");
        boolean theBoolean = randomNumber.nextBoolean();
        System.out.println(theBoolean);
    }
}
