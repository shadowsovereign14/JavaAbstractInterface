package Transportation.model;

public class Train implements TransportVehicles {
    public void transport(int budget) {
        if(TransportVehicles.train <= budget) {
            System.out.println("You can ride a train");
        } else {
            System.out.println("You can't ride the train");
        }
    }
}
