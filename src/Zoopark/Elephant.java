package Zoopark;

public class Elephant extends Animals{
    public Elephant() {}

    @Override
    public void breathe() {
        System.out.println("Elephant breathes air");
    }
    @Override
    public void move() {
        System.out.println("Elephant walks the earth");
    }
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }
}


  /*  @Override
    public void breathe() {
        System.out.println("elephant breathes air");
    }


}*/
