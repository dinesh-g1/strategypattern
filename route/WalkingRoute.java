package route;

import java.awt.*;

public class WalkingRoute implements Route{
    @Override
    public void findRouteBetween(Point start, Point destination) {
        System.out.println("This is walking route between the start and destination.");
    }
}
