public class Dog extends LandAnimalAB {
    private double foodConsumed;
    private double distanceMoved;
    private int hoursSlept;

    public Dog(String name, int age, String habitat, double height, double weight) {
        super(name, "Dog", age, habitat, 4, height, weight);
    }

    @Override
    public void eat() {
        foodConsumed += 0.5;
        System.out.println("Dog ate 0.5kg of food.");
    }

    @Override
    public void move() {
        distanceMoved += 2.0;
        System.out.println("Dog moved 2km.");
    }

    @Override
    public void sleep() {
        hoursSlept += 8;
        System.out.println("Dog slept for 8 hours.");
    }
}