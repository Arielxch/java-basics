public class HumanMain {
    public static void main(String[] args) {
        // constructor: special method that is called when an object is instantiated (created)
        Human human1 = new Human("John", 65, 70.0);
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);

        Human human2 = new Human("Lucy", 66, 60);
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);

        human2.eat();
        human1.drink();
    }

}
