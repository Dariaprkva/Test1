package Zoopark;

public class Shark extends Animals {
    public Shark() {}

    @Override
    public void breathe() {
        System.out.println("Shark breathes underwater");
    }

    @Override
    public void move() {
        System.out.println("Shark swims underwater");
    }
    public void bite() {
        System.out.println("Shark bites");
    }
}