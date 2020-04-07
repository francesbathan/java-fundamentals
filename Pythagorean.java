import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        int squareA;
        int squareB;
        int total;
        double hypotenuse;

        squareA = legA * legA;
        squareB = legB * legB;

        total = squareB + squareA;

        hypotenuse = Math.sqrt(total);

        return hypotenuse;
    }
}