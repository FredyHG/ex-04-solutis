public abstract class MarineAnimalAB extends AnimalAB {
    protected double maxDepth;

    public MarineAnimalAB(String name, String animalType, int age, String habitat, double maxDepth, double height, double weight) {
        super(name, animalType, age, habitat, 0, height, weight);
        this.maxDepth = maxDepth;
    }

    public abstract void swim();
}