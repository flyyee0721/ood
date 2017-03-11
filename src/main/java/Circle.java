/**
 * Created by jianye on 3/10/17.
 */
public class Circle {

    private int radius = 1;

    private Circle() { }

    private Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() { return radius; }

    public double getSize() {
        return Math.PI * radius * radius;
    }

}
