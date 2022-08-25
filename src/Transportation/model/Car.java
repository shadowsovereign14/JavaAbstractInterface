package Transportation.model;

public class Car implements TransportVehicles{

    @Override
    public void transport(int budget) {
        if(TransportVehicles.car <= budget) {
            System.out.println("You can drive a car");
        } else {
            System.out.println("You can't take the car as means of transportation");
        }
    }
}
