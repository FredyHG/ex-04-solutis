public class Pigeon extends FlyingAnimalAB {
    private double foodConsumed;
    private double distanceFlown;

    public Pigeon(String name, int age, String habitat, int numberOfWings, double wingSpan, double height, double weight) {
        super(name, "Pigeon", age, habitat, numberOfWings, wingSpan, height, weight);
    }

    @Override
    public void eat() {
        foodConsumed += 0.1;
        System.out.println("Pigeon ate 0.1kg of food.");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon slept.");
    }

    @Override
    public void fly() {
        distanceFlown += 5.0;
        System.out.println("Pigeon flew 5km.");
    }
}