public class Module4ArraySample {
    public static void main(String[] args) {
        String s = "mo";
        print (s);
        System.out.println("some other commands are here.......");
    }

    public static void print(String name){
        if (name.length() < 3){
            System.out.println(name);
            return; // add return here means if I finish the print process then go back the main method, do not go to the nest step
            // if you put exit here, then the "some other commands are here ..." won't be excuted because the whole program has been terminated by th exit command.
        } else {
            System.out.println("hi " + name);
        }
    }
}
