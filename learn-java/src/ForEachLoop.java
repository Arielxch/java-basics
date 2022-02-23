import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in an array/collection
        //            less step, mre readable
        //            less flexible


        // use for each in an array
        String[] animals = {"cat", "dog","alpaca","deer"};
        for (String i : animals){
            System.out.println(i + " is cute!");
        }

        String[] cars = new String[3];
        cars[0] = "BMW M2";
        cars[1] = "Veloster N";
        cars[2] = "GTI";
        for (String theCar:cars){
            System.out.println(theCar + "is a car.");
        }

        // use for each in an array list
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add(0, "jack fruit");
        fruits.add(1, "leechy");
        fruits.add(2, "longan");
        fruits.add(3, "durian");

        for (String i : fruits){
            System.out.println(i + " is one of my favorite fruit!" + " I just love it!");
        }

        ArrayList<Integer> theNumber = new ArrayList<Integer>();
        theNumber.add(0,2);
        theNumber.add(1,3);
        theNumber.add(2,5);

        for (int number : theNumber){
            System.out.println(number + " is chosen!");
        }

        String []flower = new String[5];
        flower[0] = "allium";
        flower[1] = "sunflower";
        flower[2] = "tulip";
        flower[3] = "daisy";
        flower[4] = "cherry blossoms";

        myFavorite(flower);






    }

    // use for-each as a method
    public static void myFavorite (String[]a){
        for (String s: a){
            System.out.println(s + " is my favorite flower!");
        }
    }

}
