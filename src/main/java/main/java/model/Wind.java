package main.java.model;

public class Wind {
    private int speed;
    private int degree;

    public Wind() {
    }

    public Wind(int speed, int degree) {
        this.speed = speed;
        this.degree = degree;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", degree=" + degree +
                '}';
    }
}
