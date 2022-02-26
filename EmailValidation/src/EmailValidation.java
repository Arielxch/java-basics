public class EmailValidation {

    public static void main(String[] args) {


//        System.out.println(isValidEmail("abc..def@mail.com"));
//        System.out.println(isValidEmail("abc#def@mail.com"));
//        System.out.println(isValidEmail("abc.def@mail"));
//        System.out.println(isValidEmail("abc.def@mail..com"));
//        System.out.println(isValidEmail("abc_d@mail.com"));
//        System.out.println(isValidEmail("abc.def@mail.com"));
//        System.out.println(isValidEmail("abc@mail.com"));
//        System.out.println(isValidEmail("abc.def@mail-archive.com"));
//        System.out.println(isValidEmail("tzu-yang.yu@mail.mcgill.c1a"));
//        System.out.println(isValidEmail("@"));
    }



    // check if the prefix is valid:
    // 1a) Check if an input character is alphanumeric;
    public static boolean isAlphanumeric(char x){
        return Character.isLetterOrDigit(x);
    }

    // 1b) check if an input character is a valid prefix character:
    // only alphanumeric characters, dashes, periods, or underscores are valid;
    public static boolean isValidPrefixChar(char x){
        return isAlphanumeric(x)|| x =='-'||x =='.'|| x=='_';
    }


    // 1c) check if the String contains exactly one ‘@’;
    public static boolean exactlyOneAt(String x){
        int lengthBeforeRemoveAt = x.length();
        String afterRemoveAt = x.replace("@", "");
        int lengthAfterRemoveAt = afterRemoveAt.length();
        return lengthBeforeRemoveAt - lengthAfterRemoveAt ==1;
    }

    // 1d) return the prefix of a possible email address;
    public static StringBuilder getPrefix(String x){
        StringBuilder prefix = new StringBuilder();
            int indexOfAt = x.indexOf("@");
            for (int i = 0; i < indexOfAt; i++){
                String characterToString = Character.toString(x.charAt(i));
                prefix.append(characterToString);
            }
        return prefix;
    }

    // In prefix, an underscore, a period, or a dash must always be followed by one or more alphanumeric characters;
    public static boolean followedByAlphanumericPrefix (String x){
        boolean theNextCharacter = false;
        for (int i = 0; i < x.length(); i++){
            if (((x.charAt(i) == '_' || x.charAt(i) == '.' || x.charAt(i) == '-') && (isAlphanumeric(x.charAt(i+1)))) || isAlphanumeric((x.charAt(i)))){
                theNextCharacter = true;
            } else{
                theNextCharacter = false;
                break;
            }
        }
        return theNextCharacter;
    }





    // Check if the domain is Valid:

    // 1b) check if a character is valid for the first portion of the domain:
    // only alphanumeric characters, dashes, or periods are valid;
    public static boolean isValidDomainChar(char x){
        return isAlphanumeric(x)|| x =='-'||x =='.';
    }

    // check if the periods and dashes always followed by one or more alphanumeric characters;
    public static boolean followedByAlphanumericDomain (String x){
        boolean theNextCharacter = false;
        for (int i = 0; i < x.length(); i++){
            if (((x.charAt(i) == '.' || x.charAt(i) == '-') && (isAlphanumeric(x.charAt(i+1)))) || isAlphanumeric(x.charAt(i))){
                theNextCharacter = true;
            } else{
                theNextCharacter = false;
                break;
            }
        }
        return theNextCharacter;
    }


    // 1e) get the domain of a possible email address;
    public static StringBuilder getDomain(String x){
        StringBuilder domain = new StringBuilder();
            int indexOfAt = x.indexOf("@");
            for (int i = indexOfAt + 1; i< x.length(); i++){
                String characterToString = Character.toString(x.charAt(i));
                domain.append(characterToString);
            }
        return domain;
    }


    // 1c) check if the domain contains at least one ‘.’;
    public static boolean atLeastOnePeriod(String x){
        int lengthBeforeRemovePeriod = x.length();
        String afterRemovePeriod = x.replace(".", "");
        int lengthAfterRemovePeriod = afterRemovePeriod.length();
        return lengthBeforeRemovePeriod - lengthAfterRemovePeriod >=1;
    }


    // check if the first portion contains at least one character choosing from: alphanumeric characters, periods, and dashes
    public static boolean domainFirstPartsLettersValid(String x) {
        boolean domainFirstPartsLetter = false;
        int theLastPeriod = x.lastIndexOf(".");
        for (int i = 0; i < theLastPeriod; i++) {
            char ch = x.charAt(i);
            if ((ch == '.' || ch == '-' || isAlphanumeric(ch))) {
                domainFirstPartsLetter = true;
            } else {
                domainFirstPartsLetter = false;
            }
        }
        return domainFirstPartsLetter;
    }



    // check if the second portion contains only letters of alphabets;
    public static boolean domainSecondPartsLettersValid(String x){
        boolean domainSecondPartsLetter = false;
        int theLastPeriod = x.lastIndexOf(".");
        for (int i = theLastPeriod + 1; i < x.length(); i++){
            char ch = x.charAt(i);
            if (ch >= 'a' && ch <='z' || ch >= 'A' && ch <= 'Z'){
                domainSecondPartsLetter = true;
            } else {
                domainSecondPartsLetter = false;
            }
        }
        return domainSecondPartsLetter;
    }


    // In domain, the last period must always be followed by at least two characters;
    public static boolean domainMoreThanTwoAlphabet(String x) {
        String secondPortionOfDomain = x.substring(x.lastIndexOf(".") + 1, x.length()-1);
        return secondPortionOfDomain.length() >= 2;
    }



    // 1f) check if the prefix is valid:
    // boolean atLeastOneCharacter: contains at least one character;
    // boolean thePrefixChar: only alphanumeric characters, underscores (‘_’), periods (‘.’), and dashes (‘-’).
    // boolean alphanumericFollows: An underscore, a period, or a dash must always be followed by one or more alphanumeric characters.
    // boolean firstLetterIsValid: The first character must be alphanumeric.

    public static boolean isValidPrefix(String x){
        StringBuilder prefix = new StringBuilder(getPrefix(x));
        boolean prefixCanBeUsed = false;
        boolean atLeastOneCharacter = prefix.length()>=1;
        boolean firstLetterIsValid = atLeastOneCharacter && isAlphanumeric(prefix.charAt(0));
        boolean alphanumericFollows = followedByAlphanumericPrefix(String.valueOf(prefix));
        for (int i = 0; i < prefix.length(); i++){
            boolean thePrefixChar = isValidPrefixChar(prefix.charAt(i));
            if (atLeastOneCharacter && thePrefixChar && alphanumericFollows && firstLetterIsValid){
                prefixCanBeUsed= true;
            } else {
                prefixCanBeUsed= false;
                break;
            }
        }
        return prefixCanBeUsed;
    }




    // 1f) check if the domain is valid:
    // boolean separatedByAPeriod: It is made up of two portions separated by a period;
    // boolean firstPortionValid: The first portion contains at least one character: only alphanumeric characters, periods, and dashes
    // boolean followedByAlphanumeric: a period or a dash must always be followed by one or more alphanumeric characters.
    // boolean secondPortionValid and boolean atLeastTwoChars: The second portion contains at least two characters
    public static boolean isValidDomain(String x){
        StringBuilder domain = new StringBuilder(getDomain(x));
        boolean separatedByAPeriod = atLeastOnePeriod(String.valueOf(domain));
        boolean firstPortionValid = domainFirstPartsLettersValid(String.valueOf(domain));
        boolean followedByAlphanumeric = followedByAlphanumericDomain(String.valueOf(domain));
        boolean secondPortionValid = domainSecondPartsLettersValid (String.valueOf(domain));
        boolean atLeastTwoChars = domainMoreThanTwoAlphabet(String.valueOf(domain));
        boolean domainCanBeUsed = false;
        for (int i = 0; i < domain.length(); i++){
            boolean theDomainChar = isValidDomainChar(domain.charAt(i));
            if (theDomainChar && separatedByAPeriod && firstPortionValid && followedByAlphanumeric && secondPortionValid && atLeastTwoChars){
                domainCanBeUsed = true;
            } else{
                domainCanBeUsed = false;
                break;
            }
        }
        return domainCanBeUsed;
    }

    // 1g) check if a string is a valid email address; use exactlyOneAt(x) from 1c), isValidPrefix(x) and isValidDomain(x) from 1f);

    public static boolean isValidEmail(String x){
        return exactlyOneAt(x) && isValidPrefix(x) && isValidDomain(x);
    }
}
