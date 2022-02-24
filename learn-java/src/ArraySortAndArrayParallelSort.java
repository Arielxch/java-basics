import java.util.Arrays;

public class ArraySortAndArrayParallelSort {
    public static void main(String[] args) {

        // an array is mutable

        int [] theGrade = {91,33,65,100,82,99,78};
        Arrays.sort(theGrade);
        System.out.println(Arrays.toString(theGrade));

        // parallel sort uses threading - each thread gets a chunk of the list and all the chunks are sorted it in parallel. These sorted chunks are then merged into a result.
        //It's faster when there are a lot of elements in the collection
        int [] theNum = {98,53,9,10,12,66,78};
        Arrays.parallelSort(theNum);
        System.out.println(Arrays.toString(theNum));


    }
}
