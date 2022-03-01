public class FoodMain {
 // array of objects: similar to array
    public static void main(String[] args) {

        // an array:
        // String[] theString = new String[]

        // an array of objects:
        // Object[] theArray = new Object[]


//        Food[] refrigerator = new Food[3];
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot-dog");
        Food[] refrigerator = {food1, food2, food3};

//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);




    }

}
