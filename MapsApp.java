import route.*;

import java.awt.*;

public class MapsApp {
    public static void main(String[] args) {
        BikeRoute bikeRoute = new BikeRoute();
        Navigator navigator = new Navigator(new Point(10,20), new Point(120,150), bikeRoute);
        navigator.getRoute();

        navigator.changeRoute(new CarRoute());
        navigator.getRoute();

        navigator.changeRoute(new PublicTransportRoute());
        navigator.getRoute();

        navigator.changeRoute(new WalkingRoute());
        navigator.getRoute();
    }
}
