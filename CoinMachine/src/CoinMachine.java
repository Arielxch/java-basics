public class CoinMachine {
    public static void main(String[] args) {
       
        /* var cash is the amount of money dropped by customers;
        var price is the cost of the item; */
        int cash = Integer.parseInt(args[0]);
        int price = Integer.parseInt(args[1]);

        // Amounts of cash will always be multiples of 5;
        if (cash % 5 != 0) {
            System.out.println("Sorry, we only accept toonies, loonies, quaters, dimes and nickels");
            System.exit(0);
        }

        int diff = price - cash;

         /* the amount of cash will always be equal to or greater than price;
         amounts are considered to be integer amounts in cents; */
        if (cash < price){
            System.out.println("Sorry, the prices of your purchased item is " + price + " cents, please pay " + diff + " cents more" );
            System.exit(0);
        }

        int toonie = 200;
        int loonie = 100;
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int change = cash - price;
        int tooniesChange = change / toonie;
        int looniesChange = (change % toonie) / loonie;
        int quartersChange = (change % toonie % loonie) / quarter;
        int dimesChange = (change % toonie % loonie % quarter) / dime;
        int nickelChange = (change % toonie % loonie % quarter % dime) / nickel;


        System.out.println("Amount received: " + cash);
        System.out.println("Cost of the item: " + price);
        System.out.println("Required change: " + change + "\n");
        System.out.println("Change:");
        System.out.println("   toonies x " + tooniesChange);
        System.out.println("   loonie x " + looniesChange);
        System.out.println("   quarter x " + quartersChange);
        System.out.println("   dime x " + dimesChange);
        System.out.println("   nickel x " + nickelChange);
    }
}
