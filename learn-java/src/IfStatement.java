public class IfStatement {
    public static void main (String args[]){
        int age = 11;
        if (age >= 18){
            System.out.println("You are an adult.");
        } else if (age < 18 && age > 16){
            System.out.println("You are almost an adult.");
        } else{
            System.out.println("You are a child");
        }



    }
}
