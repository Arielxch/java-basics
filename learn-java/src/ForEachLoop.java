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

        // use for each in an array list
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add(0, "jack fruit");
        fruits.add(1, "leechy");
        fruits.add(2, "longan");
        fruits.add(3, "durian");

        for (String i : fruits){
            System.out.println(i + " is one of my favorite fruit!" + " I just love it!");
        }


    }
}
