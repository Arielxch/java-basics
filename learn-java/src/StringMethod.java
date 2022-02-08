import java.util.Locale;

public class StringMethod {
    public static void main (String []args){
        // String = a reference data type that can sore one or more characters

        // equals method
        String name = "john";
        String herName = "     Lucy                    ";
        boolean result = name.equals("John");
        System.out.println(result);
        System.out.println();

        //equalsIgnoreCase method
        boolean secondResult = name.equalsIgnoreCase("John");
        System.out.println(secondResult);
        System.out.println();

        // length method
        int resultInt = name.length();
        System.out.println(resultInt);
        System.out.println();

        //chartAt
        char resultChar = name.charAt(3);
        System.out.println(resultChar);
        System.out.println();

        //indexOf
        int resultIndex = name.indexOf("j");
        System.out.println(resultIndex);
        System.out.println();

        // isEmpty
        boolean resultEmpty = name.isEmpty();
        System.out.println(resultEmpty);
        System.out.println();

        // toUpperCase
        String nameUpperc= name.toUpperCase();
        System.out.println(nameUpperc);
        System.out.println();

        // toLowerCase
        String nameLower = name.toLowerCase();
        System.out.println(nameLower);
        System.out.println();

        //trim: removes whitespace from both end of a string
        String herNewName = herName.trim();
        System.out.println(herNewName);
        System.out.println();

        //replace
        String nameReplace = name.replace("j", "D");
        System.out.println(nameReplace);
        System.out.println();







    }
}
