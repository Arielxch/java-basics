public class ReplaceCharactersInAString {
    public static void main(String[] args) {
        // 1: without StringBuffer/StringBuilder: String.replace(String x, String y)
        String myFruit = "Apple";
        String theFruit = myFruit.replace("p", "b");
        System.out.println(myFruit); // --> the original string has not been changed because string is immutable
        System.out.println(theFruit);





        // 2: substring() method:
        // substring(int beginIndex, int endIndex) method of the String class.
        // It returns a new string that is a substring of this string.
        // The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.

        String a = "I love apple pie!";
        String b = a.substring(0,12);
        String c = Character.toString(a.charAt(a.length()-1));
        System.out.println(b+c);


        //StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
        // StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

        // 3. StringBuilder x = new StringBuilder("insert string x's content here");
        StringBuilder theFlower = new StringBuilder("Daisy");
        //append (String s): modifies a string by appending a new string to the end.
        // Takes boolean, char, int, long, String etc. as parameter. It returns the modified StringBuffer object.
        theFlower.append(" is my favourite flower");
        System.out.println(theFlower); // --> theFlower variable becomes "Daisy is my favourite flower"

        // reverse() reverses the value of the given StringBuffer object.
        // For example, abcd becomes dcba. It then returns the modified object.

        theFlower.reverse();
        System.out.println(theFlower);
        System.out.println(theFlower.reverse());

        // delete(int start, int end) deletes a string from the given StringBuilder object starting from the start index to the end index;
        theFlower.delete(21, 28);
        System.out.println(theFlower);

        // insert(int offset, "the inserted string content") inserts a string s into the position specified by the offset (the inserted place is before the offset).
        // System.out.println(theFlower.indexOf("f"));
        theFlower.insert(11, " mother's");
        System.out.println(theFlower);

        //replace(int start, int end, String x) replaces the characters in the substring of the StringBuilder with characters in the given string
        //System.out.println(theFlower.lastIndexOf("favourite"))
        theFlower.replace(21, 30,"second favourite!");// --> the last index should be end+1, because the end index is excluded.
        System.out.println(theFlower);







    }
}
