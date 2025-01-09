package route;

import java.awt.*;

public class Navigator {
    private Route route;
    private final Point start;
    private final Point destination;

    public Navigator(Point start, Point destination,Route route) {
        this.route = route;
        this.start = start;
        this.destination = destination;
    }

    public void changeRoute(Route route) {
        this.route = route;
    }

    public void getRoute() {
        route.findRouteBetween(start, destination);
    }
}
