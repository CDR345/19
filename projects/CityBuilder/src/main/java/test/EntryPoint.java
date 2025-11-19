package test;

import model.City;
import model.Vehicle;

public class EntryPoint {

    public static void main(String[] args) {
      //  City city1 = new City("Bordeaux", "France", .2, false);
      //  City city2 = new City("Little Beijing", "China", 6.5, true);

       // System.out.println(city1);

        Vehicle vehicle1 = new Vehicle(150, "BMW","A");
        vehicle1.accelerate(30);
        System.out.println("After acceleration: "+vehicle1.getCurrentSpeed());
        vehicle1.decelerate(100);

        System.out.println("After decelerate" +
                +vehicle1.getCurrentSpeed());

    }

}
