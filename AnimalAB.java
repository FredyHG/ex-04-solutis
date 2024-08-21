public abstract class AnimalAB implements AnimalIF {
    protected String name;
    protected String animalType;
    protected int age;
    protected String habitat;
    protected int numberOfLegs;
    protected double height;
    protected double weight;

    public AnimalAB(String name, String animalType, int age, String habitat, int numberOfLegs, double height, double weight) {
        this.name = name;
        this.animalType = animalType;
        this.age = age;
        this.habitat = habitat;
        this.numberOfLegs = numberOfLegs;
        this.height = height;
        this.weight = weight;
    }

    public abstract void eat();
    public abstract void move();
    public abstract void sleep();
}