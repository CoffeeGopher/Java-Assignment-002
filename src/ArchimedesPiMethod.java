import java.util.Scanner;
import static java.lang.Math.*;

public class ArchimedesPiMethod {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("Number of sides: " + i + ", Pi approx.: " + getPiFromSideCount(i));

        }

        int numberOfSidesForAnswer = 8;
        System.out.println("\nFINAL ANSWER:\nNumber of sides: " + numberOfSidesForAnswer + ", Pi approx.: "+ getPiFromSideCount(numberOfSidesForAnswer));
    }

    static double getPiFromSideCount(int sideCount) {
        double segmentAngle = 360.0 / sideCount;
        double triangleBase = 2 * sin(toRadians(segmentAngle / 2));
        double polygonPerimeter = triangleBase * sideCount;
        return polygonPerimeter / 2;
    }
}
