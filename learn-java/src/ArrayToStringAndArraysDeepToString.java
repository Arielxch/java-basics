import java.util.Arrays;

public class ArrayToStringAndArraysDeepToString {
    public static void main(String[] args) {
        // use Arrays.toString() to print an array;
        int [] grade = {99, 98, 07, 99, 100, 96, 100};
        System.out.println(Arrays.toString(grade));

        // Arrays.deepToString() is for arrays of arrays (multi-dimension arrays)

        int[][] theInt= {{12,3},{65,7,5},{22,3,6}};
        System.out.println(Arrays.deepToString(theInt));


    }
}
