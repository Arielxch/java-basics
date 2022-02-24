public class Palindromes {
    public static void main(String[] args) {
        // ex: mom, dad, madam

        String original = "radce car";
        original = original.replace(" ",""); //--> replace a space with an empty String

        String reverse="";
        for (int i = original.length()-1; i >=0; i--){
            reverse+=original.charAt(i);
        }
        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++){
            if (original.charAt(i)!= reverse.charAt(i)){
                palindrome=false;
                break;
            }
        }
        if (palindrome){
            System.out.println("Palindrome is true!");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
