package model;

import java.util.ArrayList;

public class Vehicle {

    private int maxSpeed =200;
    private int currentSpeed;
    private String make;
    private String model;
    private ArrayList<Owner> owners = new ArrayList<>();


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

    public Vehicle(int maxSpeed, int currentSpeed, String make, String model) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.make = make;
        this.model = model;
    }

    public Vehicle(int maxSpeed, int currentSpeed, String make, String model, ArrayList<Owner> owners) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.make = make;
        this.model = model;
        this.owners = owners;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("maxSpeed=").append(maxSpeed);
        sb.append(", currentSpeed=").append(currentSpeed);
        sb.append(", make='").append(make).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", owners=").append(owners);
        sb.append('}');
        return sb.toString();
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public ArrayList<Owner> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<Owner> owners) {
        this.owners = owners;
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
