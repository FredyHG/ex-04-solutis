public class Fish extends MarineAnimalAB {
    private double foodConsumed;
    private double distanceSwam;

    public Fish(String name, int age, String habitat, double maxDepth, double height, double weight) {
        super(name, "Fish", age, habitat, maxDepth, height, weight);
    }

    @Override
    public void eat() {
        foodConsumed += 0.2;
        System.out.println("Fish ate 0.2kg of food.");
    }

    @Override
    public void move() {
        swim();
    }

    @Override
    public void sleep() {
        System.out.println("Fish sleep.");
    }

    @Override
    public void swim() {
        distanceSwam += 3.0;
        System.out.println("Fish swam 3km.");
    }
}