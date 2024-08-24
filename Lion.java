public class Lion extends LandAnimalAB {
    private double foodConsumed;
    private double distanceMoved;
    private int hoursSlept;

    public Lion(String name, int age, String habitat, double height, double weight) {
        super(name, "Lion", age, habitat, 4, height, weight);
    }

    @Override
    public void eat() {
        foodConsumed += 3;
        System.out.println("Lion eat 3kg of food.");
    }

    @Override
    public void move() {
        distanceMoved += 9;
        System.out.println("Lion moved 9km.");
    }

    @Override
    public void sleep() {
        hoursSlept += 18;
        System.out.println("Lion sleep for 18 hours.");
    }
}