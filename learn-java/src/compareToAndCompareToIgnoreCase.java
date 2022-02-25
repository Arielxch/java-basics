public class compareToAndCompareToIgnoreCase {
    public static void main(String[] args) {
        // String compareTo() and compareToIgnoreCase() method compares two strings lexicographically and returns 0 if they are equal
        compareStrings("banana", "Apple");
    }

    public static void compareStrings(String x, String y){
        int a = x.compareToIgnoreCase(y);
        if (a > 0){
            System.out.println(x);
        } else if (a==0){
            System.out.println("The two strings are lexicographically equal");
        } else {
            System.out.println(y);
        }

    }
}
