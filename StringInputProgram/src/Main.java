public class Main {

    public static void main(String[] args) {
        getFirstHalf("Apple");
        System.out.println();
        alphaString("banana", "apple");
        alphaString("snake", "squirrel");
        replaceAll("Apple", 'p','d');




    }
    public static void getFirstHalf(String x){
        for (int i = 0; i < x.length()/2; i++) {
            System.out.print(x.charAt(i));
        }
    }

    public static void alphaString(String x, String y){
        int a = x.compareTo(y);
        if (a < 0){
            System.out.println(x);
        } else if (a == 0){
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(y);
        }
    }

    public static void replaceAll(String beforeReplace, char b, char c){
        String x = Character.toString(b);
        String y = Character.toString(c);
        String replaced = beforeReplace.replace(x, y);
        System.out.println(replaced);
    }



}
