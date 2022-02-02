public class Module4SecondSample {
    public static void main(String[]args){
        System.out.println(isEven(11));
        print("John");

    }
    public static boolean isEven(int a){
        if (a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    // a - z [97, 122]
    // A - Z [65, 90]
    // to check the ASCII code of a letter, use: char x = "x" then debug, you will be able to see the ASCII code of this letter
    public static void print (String hisName){
        char firstLetter = hisName.charAt(0);
        if (firstLetter <= 90 && firstLetter >= 65){
            System.out.println("The string started with capital letter");
        }else if (firstLetter <= 122 && firstLetter >= 97){
            System.out.println("The first letter is a lowercase letter");
        }
    }




}
