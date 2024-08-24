public class Elephant extends LandAnimalAB {
    private double foodConsumed;
    private double distanceMoved;
    private int hoursSlept;

    public Elephant(String name, int age, String habitat, double height, double weight) {
        super(name, "Elephant", age, habitat, 4, height, weight);
    }

    @Override
    public void eat() {
        foodConsumed += 7;
        System.out.println("Elephant eat 7kg of food.");
    }

    @Override
    public void move() {
        distanceMoved += 14;
        System.out.println("Elephant moved 14km.");
    }

    @Override
    public void sleep() {
        hoursSlept += 15;
        System.out.println("Elephant sleep for 15 hours.");
    }
}