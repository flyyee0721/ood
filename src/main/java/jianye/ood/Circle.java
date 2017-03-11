package jianye.ood;
import lombok.Data;
/**
 * Created by jianye on 3/10/17.
 */
@Data
public class Circle {

    private int radius = 1;

    public Circle() { }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() { return radius; }

    public double getSize() {
        return Math.PI * radius * radius;
    }

}
