package Transportation.model;

public class Bus implements TransportVehicles{
    @Override
    public void transport(int budget) {
        if(TransportVehicles.car <= budget) {
            System.out.println("You can take the bus");
        } else {
            System.out.println("You can't take the bus as means of transportation");
        }
    }
}
