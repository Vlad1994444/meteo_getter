package main.java.model;

public class Clouds {
    private int cloudiness;

    public Clouds() {
    }

    public Clouds(int cloudiness) {
        this.cloudiness = cloudiness;
    }

    public int getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
        this.cloudiness = cloudiness;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "cloudiness=" + cloudiness +
                '}';
    }
}
