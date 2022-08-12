package AirPlanesTest;

public class Airplanes {
    String model;

    public Airplanes(String model, int speed, int maxHeight, int maxFlyDistance) {
        this.model = model;
        this.speed = speed;
        this.maxHeight = maxHeight;
        MaxFlyDistance = maxFlyDistance;
    }

    int speed;
    int maxHeight;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxFlyDistance() {
        return MaxFlyDistance;
    }

    public void setMaxFlyDistance(int maxFlyDistance) {
        MaxFlyDistance = maxFlyDistance;
    }

    int MaxFlyDistance;

}
