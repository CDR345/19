package test;

import model.City;
import model.Owner;
import model.Vehicle;

import java.util.ArrayList;

public class EntryPoint {

    public static void main(String[] args) {
        vehcile_owners();

    }

    public static void vehcile_owners() {
        Owner owner1 = new Owner("John", "Doe");
        Owner owner2 = new Owner("Jane", "Smith");

        ArrayList<Owner> owners = new ArrayList<>();
        owners.add(owner1);
        owners.add(owner2);
        Vehicle vehicle1 = new Vehicle(150, "BMW", "A");
        vehicle1.setOwners(owners);

        vehicle1.accelerate(30);
//        System.out.println("After acceleration: "+vehicle1.getCurrentSpeed());
//        vehicle1.decelerate(100);
//
//        System.out.println("After decelerate" +
//                +vehicle1.getCurrentSpeed());

        System.out.println("Vehicle:" + vehicle1);

    }
}
