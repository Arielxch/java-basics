public class wrapperClasses {
    public static void main (String []args){
        // wrapper class = provides a way to use primitive data types as reference data type
        // reference data types contain useful methods, they can also be used with collections (ex. ArrayList)
        // reach primitive data type has a corresponding wrapper class:
        // ex: primitive     wrapper
        //     --------      ------
        //     boolean       Boolean
        //     char          Char
        //     int           Int
        //     double        Double
        // boxing and unboxing features
        // but primitive datatypes are much faster to access then reference datatypes

        Boolean a = true;
        Character b = "@";
        Integer c = 123;
        Double d = 3.14;
        String e = "John";

        // unboxing feature
        if (a==true) {
            System.out.println("this is true");
        }


    }
}
