import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.print("Geben Sie das Jahr ein: ");
        int Jahr = In.readInt();
        
        Out.print("Geben Sie den Monat ein: ");
        int Monat = In.readInt();

        //Fehlerausgabe, wenn ein falscher Monat angegben wurde.
        if (Monat < 1 || Monat > 12) {
            Out.println("Ungültiger Monat. Bitte geben Sie einen Wert zwischen 1 und 12 ein.");
            return;
        }

        int Tage;
        switch (Monat) {
            case 1, 3, 5, 7, 8, 10, 12:
                Tage = 31;
                break;
            case 4, 6, 9, 11:
                Tage = 30;
                break;
            case 2:
                Tage = (istSchaltjahr(Jahr)) ? 29 : 28;
                break;
            default:
                Tage = 0; //sollte nie erreicht werden
                break;
        }

        Out.println("Der Monat " + Monat + " im Jahr " + Jahr + " hat " + Tage + " Tage.");

    }

    private static boolean istSchaltjahr(int Jahr) {
        return (Jahr % 4 == 0 && Jahr % 100 != 0) || (Jahr % 400 == 0);
    }
}
