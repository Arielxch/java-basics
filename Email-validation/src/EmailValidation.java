public class EmailValidation {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        swap(x,y);


    }

    public static void swap (int x, int y){
        System.out.print("inside swap: x is:" + x + " y is:" + y);
        int s;
        s = x;
        x = y;
        y = s;
        System.out.println(" inside swap: x is:" + x);
        System.out.println("y is:" + y);
    }

    public static boolean compareNumbers (int x, int y, int z){
        boolean isTrue = true;
        if (z == 3 || z == (x+y)){
            return isTrue;
        } else {
            return !isTrue;
        }
    }









}
