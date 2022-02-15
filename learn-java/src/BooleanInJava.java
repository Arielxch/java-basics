public class BooleanInJava {
    public static void main(String[] args) {

        boolean passDoor = true;
        boolean missDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if (passDoor){
            System.out.println("we passed the first door");
            doorCount = doorCount + 1;
        }
        if (passDoor){
            System.out.println("we passed the second door");
            doorCount = doorCount + 1;
        }
        if (passDoor){
            System.out.println("we passed the third door");
            doorCount = doorCount + 1;
        }

        if (doorCount == 3) {
            passedAllDoors = true;
            System.out.println("Congratulations! You won the game");
        }




    }
}
