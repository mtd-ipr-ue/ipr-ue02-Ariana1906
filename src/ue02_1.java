import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Hello, World!");
       
        Out.println("Gebe eine ganze Zahl ein: ");
        int x = In.readInt();

        Out.println("Gebe eine zweite ganze Zahl ein: ");
        int y = In.readInt();

        Out.println("Gebe eine dritte ganze Zahl ein: ");
        int z = In.readInt();

        int max;

        if (x>= y && x >= z) {
            max = x;
        } else if (y>= x && y >= z) {
            max = y;
        } else {
            max = z;
        }

        Out.println("Das Maximum der drei Zahlen ist: " + max);


    }
}
