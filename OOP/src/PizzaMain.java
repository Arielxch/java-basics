public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        Pizza pizza2 = new Pizza("thin crust", "mayonnaise", "chicken");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.topping);

        Pizza pizza3 = new Pizza("French bread", "Buffalo");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);


    }




}
