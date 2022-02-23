import java.util.Random;

public class Array {
    public static void main (String args[]){
        // array = used to store multiple values in a single variable

        String[] cars = {"BMW", "Audi", "Tesla"};
        // Re-assign a value to the x element of the array
        cars[0] = "Benz";

//        String [] cars = new String[3];
//        cars [0] = "BMW";
//        cars [1] = "Audi";
//        cars [2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[] fruits = {"Apple", "Jack fruits", "Strawberry", "Lychee", "Dragon eyes"};

//        String [] fruits = new String [5];
//
//        fruits [0] = "Apple";
//        fruits [1] = "Jack fruit";
//        fruits [2] = "Strawberry";
//        fruits [3] = "Lychee";
//        fruits [4] = "dragon eyes";

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        int[] numbers = {16, 28, 32, 66, 55};
        for (int i = 0; i < numbers.length; i ++){
            System.out.println(numbers[i]);
        }

        int[] theNumbers = new int[5];

        Random getRandomNumber = new Random();
        theNumbers[0] = getRandomNumber.nextInt(10);
        theNumbers[1] = getRandomNumber.nextInt(5);
        theNumbers[2] = getRandomNumber.nextInt(8);
        theNumbers[3] = getRandomNumber.nextInt(9);
        theNumbers[4] = getRandomNumber.nextInt(2);

        for (int i=0; i< theNumbers.length; i++){
            System.out.println(theNumbers[i]);
        }

//        initial value of an array
        boolean [] myBoolean = new boolean[2];
        theBoolean(myBoolean);

        int[] myInt = new int[2];
        theInt(myInt);

        String[] myString = new String[2];
        theString(myString);

        double[] myDouble = new double[2];
        theDouble(myDouble);







    }

    public static void theBoolean(boolean[]a){
        for (boolean b: a){
            System.out.println(b + " is the initial value of an array of boolean");
        }
    }

    public static void theInt (int[]a){
        for(int s:a){
            System.out.println(s + " is the initial value of an array of integer");
        }
    }

    public static void theString (String[]a){
        for (String s: a){
            System.out.println(s + " is the initial value of an array of string");
        }
    }

    public static void theDouble (double[]a){
        for (double s: a){
            System.out.println(s + " is the initial value of an array of double");
        }
    }


}
