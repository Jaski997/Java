package Creatures;



public class Pet extends Animal {

    public Pet(String species) {
        super(species);
    }

    public void feed(double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("My weight now " + this.weight + "\n");
        } else
            System.out.print("You killed your pet\n");
    }
}