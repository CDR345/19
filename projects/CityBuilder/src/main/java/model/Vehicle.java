package model;

public class Vehicle {

    private int maxSpeed =200;
    private int currentSpeed;
    private String make;
    private String model;


    public Vehicle(int currentSpeed, String make, String model) {
        this.make = make;
        this.model = model;
        this.currentSpeed = Math.min(currentSpeed, maxSpeed);

    }

    public void accelerate(int speed){
    currentSpeed +=speed;
        if(currentSpeed > maxSpeed){
            currentSpeed = maxSpeed;
        }
    }

    public void decelerate(int speed){
        currentSpeed -=speed;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
