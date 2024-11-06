import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.print("X-Koordinate: ");
        double x = In.readInt();

        Out.print("y-Koordinate: ");
        double y = In.readInt();

        double radius = 4;

        double AbstandZumMittelpunkt = Math.sqrt(x * x + y * y);

        //Prüfen, ob der Punkt im grünen Bereich liegt
        boolean istImErstenQuadrant = (x >= 0 && y >= 0);
        boolean istImKreis = (AbstandZumMittelpunkt <= radius);

        if(istImErstenQuadrant && istImKreis) {
            Out.println("Der Punkt befindet sich innerhalb der grünen Fläche!");
        } else {
            Out.println("Der Punkt befindet sich außerhalb der grünen Fläche!");
        }
    }
}
