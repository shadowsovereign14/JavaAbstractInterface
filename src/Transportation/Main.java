package Transportation;

import Transportation.model.*;

public class Main {

    public static void main(String[] args) {
        int budget = 500;
        TransportVehicles bus = new Bus();
        TransportVehicles car = new Car();
        TransportVehicles train = new Train();
        TransportVehicles plane = new Plane();

        bus.transport(budget);
        car.transport(budget);
        train.transport(budget);
        plane.transport(budget);
    }

}
