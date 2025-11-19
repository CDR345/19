package test;

import model.City;

public class EntryPoint {

    public static void main(String[] args) {
        City city1 = new City("Bordeaux", "France", .2, false);
        City city2 = new City("Little Beijing", "China", 6.5, true);

        System.out.println(city1);
    }

}
