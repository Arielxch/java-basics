public class Module4LoopSamples {
    public static void main(String[] args) {
        // arrayType [] var_name; example: int[]name
        // String[] var_name = new String[3]; means we have an array with 3 elements, must use "new" for a new object
        //initial value for integer is 0

        int[] nums = new int[3]; // an array of int
        nums [0] = 10;
        nums [1] = 20;
        nums [2] = 30;
        int[] newNum = {1,2,3,4};
       // One way to print an array
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        //for loop to print array
        for (int i = 0; i < 3; i++){
            System.out.println(newNum[i]);
        }
        System.out.println("end of it");

    }







}
