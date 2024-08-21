public abstract class FlyingAnimalAB extends AnimalAB {
    protected int numberOfWings;
    protected double wingSpan;

    public FlyingAnimalAB(String name, String animalType, int age, String habitat, int numberOfWings, double wingSpan, double height, double weight) {
        super(name, animalType, age, habitat, 2, height, weight);
        this.numberOfWings = numberOfWings;
        this.wingSpan = wingSpan;
    }

    public abstract void fly();
}