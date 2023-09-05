package web.model;

public class Car {
    private String model;
    private int maxSpeed;
    private int minSpeed;

    public Car() {
    }

    public Car(String model, int maxSpeed, int minSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", minSpeed=" + minSpeed +
                '}';
    }
}
