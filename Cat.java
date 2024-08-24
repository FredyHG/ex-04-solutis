public class Cat extends LandAnimalAB {
    private double foodConsumed;
    private double distanceMoved;
    private int hoursSlept;

    public Cat(String name, int age, String habitat, double height, double weight) {
        super(name, "Cat", age, habitat, 4, height, weight);
    }

    @Override
    public void eat() {
        foodConsumed += 0.2;
        System.out.println("Cat ate 0.2kg of food.");
    }

    @Override
    public void move() {
        distanceMoved += 1.0;
        System.out.println("Cat moved 1km.");
    }

    @Override
    public void sleep() {
        hoursSlept += 10;
        System.out.println("Cat sleep for 10 hours.");
    }
}