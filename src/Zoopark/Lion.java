package Zoopark;

public class Lion extends Animals {
    public Lion() {
    }

    @Override
    public void breathe() {
        System.out.println("Lion breathes air");
    }

    @Override
    public void move() {
        System.out.println("Lion walks the earth");
    }

    public void roar() {
        System.out.println("lion roars");
    }

    public void eat() {
        System.out.println("lion eats");
    }
}
