package Zoopark;

public abstract class Animals {
    private String howBreathe;
    private String howMove;

    public abstract void breathe();

    public abstract void move();

    public String getHowBreathe() {
        return howBreathe;
    }

    public void setHowBreathe(String howBreathe) {
        this.howBreathe = howBreathe;
    }

    public String getHowMove() {
        return howMove;
    }

    public void setHowMove(String howMove) {
        this.howMove = howMove;
    }
}
