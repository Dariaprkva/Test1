package Zoopark;

    public class Mockingbird extends Animals {
        public Mockingbird() {}

        @Override
        public void breathe() {
            System.out.println("Mockingbird breathes air");
        }

        @Override
        public void move() {
            System.out.println("Mockingbird flies in the sky");
        }
        public void tweet() {
            System.out.println("Mockingbird chirps");
        }
    }

