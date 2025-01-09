package route;

import java.awt.*;

public class BikeRoute implements Route{
    @Override
    public void findRouteBetween(Point start, Point destination) {
        System.out.println("This is bike route between the start and destination.");
    }
}
