package jianye.ood.chapter10;

/**
 * Created by jianye on 3/12/17.
 */
//Utility class is declared to be final and has a private constructor.
//You can define utility classes that contain static methods and static data.

public final class GuessDate {

    //getValue is defined as a static method because it is not dependent on a specific object of the GuessDate class
    public static int getValue() {
        return 0;
    }

    private GuessDate() {}

}
