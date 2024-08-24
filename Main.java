public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 5, "House", 0.5, 30.0);
        Cat cat = new Cat("Whiskers", 3, "Apartment", 0.3, 5.0);
        Lion lion = new Lion("Gerald", 7, "Jungle", 1.5, 43);
        Elephant elephant = new Elephant("Pocket", 14, "Jungle", 3, 800);
        Fish fish = new Fish("Nemo", 1, "Ocean", 100.0, 0.2, 1.5);
        Pigeon pigeon = new Pigeon("Sky", 2, "Urban", 2, 0.8, 0.3, 0.5);

        System.out.println("==========================================");
        System.out.println("Dog:");
        dog.eat();
        dog.move();
        dog.sleep();

        System.out.println("==========================================");
        System.out.println("Cat:");
        cat.eat();
        cat.move();
        cat.sleep();

        System.out.println("==========================================");
        System.out.println("Lion:");
        lion.eat();
        lion.move();
        lion.sleep();

        System.out.println("==========================================");
        System.out.println("Elephant:");
        elephant.eat();
        elephant.move();
        elephant.sleep();

        System.out.println("==========================================");
        System.out.println("Fish:");
        fish.eat();
        fish.move();
        fish.sleep();

        System.out.println("==========================================");
        System.out.println("Pigeon:");
        pigeon.eat();
        pigeon.move();
        pigeon.sleep();
        System.out.println("==========================================");
    }
}
