package assignment2;

import assignment2.fuels.Dilithium;
import assignment2.fuels.Gasoline;
import assignment2.vehicles.Car;
import assignment2.vehicles.Enterprise;
import assignment2.vehicles.Truck;
import assignment2.vehicles.Vehicle;

import java.util.List;

public class App {

    public static void main(String[] args) {
        testAssignment2(new Car(), new Truck(), new Enterprise());
    }

    public static void testAssignment2(Vehicle v1, Vehicle v2, Vehicle v3) {

        boolean v1lLoaded = v1.loadFuel(new Gasoline(5));
        boolean v2lLoaded = v2.loadFuel(new Dilithium(1000));
        boolean v3lLoaded = v3.loadFuel(new Dilithium(3));

        System.out.printf("Vehicle 1 is loaded? %b\n", v1lLoaded);
        System.out.printf("Vehicle 2 is loaded? %b\n", v2lLoaded);
        System.out.printf("Vehicle 3 is loaded? %b\n", v3lLoaded);

        for (int i = 0; v1.move(); i++)
            System.out.println("Vehicle one is still going strong after " + i + " steps");
        for (int i = 0; v2.move(); i++)
            System.out.println("Vehicle two is still going strong after " + i + " steps");
        for (int i = 0; v3.move(); i++)
            System.out.println("Vehicle three is still going strong after " + i + " steps");

        List a;
    }
}
