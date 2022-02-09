public class NestedLoopPatterns {
    public static void main(String[] args) {
        // print out the following pattern
        // +/\/\/\/\/\+
        // |          |
        // +/\/\/\/\/\+
        //
        // +/\/\/\/\/\+
        // |          |
        // |          |
        // |          |
        // |          |
        // |          |
        // +/\/\/\/\/\+

        drawPlusLine();
        drawBarLine();
        drawPlusLine();
        drawNothing();
        drawPlusLine();
        drawBarLine();
        drawBarLine();
        drawBarLine();
        drawBarLine();
        drawBarLine();
        drawPlusLine();


    }
    public static void drawPlusLine(){
        System.out.print("+");
        for (int i=0; i <=5; i++){
            System.out.print("/\\");
        }
        System.out.println("+");

    }

    public static void drawBarLine(){
        System.out.print("|");
        for (int i = 1; i <=10; i++){
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void drawNothing(){
        for (int i = 1; i<=11; i++){
            System.out.print(" ");
        }
        System.out.println(" ");

    }

}
