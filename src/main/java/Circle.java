/**
 * Created by jianye on 3/10/17.
 */
public class Circle {

    private static Circle ourInstance = new Circle();

    public static Circle getInstance() {
        return ourInstance;
    }

    private Circle() { }
}
