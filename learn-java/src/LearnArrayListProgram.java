import java.util.ArrayList;

public class LearnArrayListProgram {
    public static void main(String[] args) {
        // ArrayList = a resizable array;
        // elements can be added and removed after completion phrase
        // store reference data type
        // if you need to store integer, you need to use wrapper class
        // ArrayList<type> variableName = new ArrayList<type> ();

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot-dog");
        food.add("chicken wings");

        // to replace an element in an array, use .set (index, replacement)
        food.set (0, "sushi");
        // to remove an element, use . remove(index)
        food.remove(2); // remove hot-dog
        // to clear an array, use . clear()
//        food.clear();


        for(int i=0; i < food.size(); i ++) {
            System.out.println(food.get(i));

        }


    }
}
