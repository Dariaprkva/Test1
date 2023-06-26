package Zoopark;

public class Dolphin extends Animals {
    public Dolphin() {}

    @Override
    public void breathe() {
        System.out.println("Dolphin breathes underwater");
    }

    @Override
    public void move() {
        System.out.println("Dolphin swims underwater");
    }
    public void whistle() {
        System.out.println("Dolphin whistles");
    }
}