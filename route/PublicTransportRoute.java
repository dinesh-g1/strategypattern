package route;

import java.awt.*;

public class PublicTransportRoute implements Route{

    @Override
    public void findRouteBetween(Point start, Point destination) {
        System.out.println("This is public transport route between the start and destination.");
    }
}
