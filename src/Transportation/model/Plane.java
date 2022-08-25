package Transportation.model;

public class Plane implements TransportVehicles {

    public void transport(int budget) {
        if(TransportVehicles.plane <= budget) {
            System.out.println("You can book a flight");
        } else {
            System.out.println("You can't take the plane as means of transportation");
        }
    }
}
