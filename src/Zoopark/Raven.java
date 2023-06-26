package Zoopark;

public class Raven extends Animals {
    public Raven() {}

    @Override
    public void breathe() {
        System.out.println("Raven breathes air");
    }

    @Override
    public void move() {
        System.out.println("Raven flies in the sky");
    }
    public void cawing() {
        System.out.println("Raven caws");
    }
}
