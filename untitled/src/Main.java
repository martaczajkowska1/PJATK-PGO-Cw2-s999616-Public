//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 320, true);
        Ksiazka ksiazka2 = new Ksiazka("Hobbit", "J.R.R. Tolkien", 295, true);
        Ksiazka ksiazka3 = new Ksiazka("Rok 1984", "George Orwell", 350, false);

        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();

        ksiazka1.wypozycz();
        ksiazka2.wypozycz();
        ksiazka3.wypozycz();

        System.out.println("Po wypożyczeniu");

        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();

        ksiazka1.zwroc();
        ksiazka2.zwroc();
        ksiazka3.zwroc();

        System.out.println("Po zwroóceniu");

        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();







    }
}