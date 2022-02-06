public class Switch {
    public static void main(String args[]){
        String day = "PizzaDay";
        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday");
                break; // break must be added in switch so the following statement will not be executed;
            case"Monday":
                System.out.println("It is Monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("it is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("There is no match!");
                break;

        }

        String fruits = "Lychee";
        switch (fruits) {
            case "Water Melon":
                System.out.println("My favourate fruit is watermelon!");
                break;
            case "Apple":
                System.out.println("My favourate fruit is Apple!");
                break;
            case"Pear":
                System.out.println("My favourate fruit is pear!");
                break;
            case "Lychee":
                System.out.println("Lychee is my favourate fruit!!!!!");
                break;
            case "Jack Fruit":
                System.out.println("I truly like Jack fruit!");
                break;
            default:
                System.out.println("Tropical fruits are my favourate!!!");
        }
    }
}
