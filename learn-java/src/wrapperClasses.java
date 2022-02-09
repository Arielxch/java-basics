public class wrapperClasses {
    public static void main (String []args){
        // wrapper class = provides a way to use primitive data types as reference data type
        // reference data types contain useful methods, they can also be used with collections (ex. ArrayList)
        // reach primitive data type has a corresponding wrapper class:
        // ex: primitive     wrapper
        //     --------      ------
        //     boolean       Boolean
        //     char          Character
        //     int           Integer
        //     double        Double
        // boxing and unboxing features
        // but primitive datatypes are much faster to access then reference datatypes

        // Only for Boolean and Character, the parent class is Object class, for the rest of number classes (Integer,
        // long, short, double....), their parent class is the number class

        Boolean a = true; // a is an object of boolean type
        Character b = '@'; // b is an object of character type
        Integer c = 123;  // c is an object of Integer type
        Double d = 3.14;  // d is an object of Double type
        String e = "John"; // e is an object of String type

        // comparing variable and wrapper class

        boolean herResult = true;

        Boolean hisResult = true;

        System.out.println(herResult); // you cannot use method with a variable
        System.out.println(hisResult.equals(false)); // you can use method with object


        // wrapper class with methods examples

        String priceA = "12";
        String priceB = "18";

        int price1 = Integer.parseInt(priceA);
        int price2 = Integer.parseInt (priceB);

        int sum = price1 + price2;

        System.out.println(sum);

        String pricec = "12.223";
        String priced = "18.112";

        Double price3 = Double.parseDouble(pricec);
        Double price4 = Double.parseDouble (priced);

        Double sum2 = price3 + price4;

        System.out.println(sum2);

        // Boxing and unBoxing

        // Boxing is when you convert primitive datatype to object: autoboxing vs normal boxing
        // autoboxing:
        int f = 100;
        Integer g = f;
        System.out.println("autoboxing: " + g);

        // (normal) boxing: convert a variable into an object with the help of addition method;
        int h = 100;
        Integer i = Integer.valueOf(h);
        System.out.println("boxing: " + i);

        //unboxingL when you convert wrapper class objects to its respective primitive type:

        Integer j = 98;
        int newJ = j.intValue();
        System.out.println("unboxing:" + newJ);

        Double k = 150.50;
        double newK = k.doubleValue();
        System.out.println("unboxing:" + newK);

        // auto-unboxing
        Integer l = 22;
        int newL = l;
        System.out.println("auto-unboxing: " + newL);







    }
}
