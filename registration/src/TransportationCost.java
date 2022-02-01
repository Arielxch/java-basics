public class TransportationCost {
    public static void main (String args[]){
        int distance = Integer.parseInt(args[0]);
        int ev = 60;
        int gasMileage = distance - ev;
        double evPerKmCost = 2.0/60.0;
        double gasCost = gasMileage * (7.0/100.0) * 1.5;

        if (distance <= 60){
            double totalCost = distance * evPerKmCost;
            System.out.println("Your transportation cost is " + totalCost);
            System.out.println("You spend " + evPerKmCost + " per km.");
        } else if (distance > 60 ) {
            double totalCost = 2 + gasCost;
            double costPerKm = totalCost / distance;
            System.out.println("Your transportation cost is " + totalCost);
            System.out.println("You spend " + costPerKm + " per km.");
        }




    }
}

