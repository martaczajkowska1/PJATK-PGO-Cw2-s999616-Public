//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Biblioteka Biblioteka1 = new Biblioteka(5);

        Ksiazka Ksiazka1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 300, true);
        Ksiazka Ksiazka2 = new Ksiazka("W pustyni i w puszczy", "Henryk Sienkiewicz", 250, true);
        Ksiazka Ksiazka3 = new Ksiazka("Krzyżacy", "Henryk Sienkiewicz", 400, true);


        Biblioteka1.dodajKsiazke(Ksiazka1);
        Biblioteka1.dodajKsiazke(Ksiazka2);
        Biblioteka1.dodajKsiazke(Ksiazka3);

        System.out.println("Dostępne książki: ");
        Biblioteka1.wypiszDostepneKsiazki();

        Czytelnik Czytelnik1 = new Czytelnik("Jan", "Kowalski", 123, 2);
        Czytelnik Czytelnik2 = new Czytelnik("Anna", "Nowak", 345, 5);
        Czytelnik Czytelnik3 = new Czytelnik("Maria", "Kwiatkowska", 235, 6);

        Biblioteka1.wypozyczKsiazke("Pan Tadeusz", Czytelnik1);
        Biblioteka1.wypozyczKsiazke("W pustyni i w puszczy", Czytelnik2);
        Biblioteka1.wypozyczKsiazke("Krzyżacy", Czytelnik3);

        System.out.println("Wypisz dostępne książki po wypożyczeniach: ");
        Biblioteka1.wypiszDostepneKsiazki();

        Biblioteka1.zwrocKsiazke("Pan Tadeusz", Czytelnik1);
        Biblioteka1.zwrocKsiazke("W pustyni i w puszczy", Czytelnik2);
        Biblioteka1.zwrocKsiazke("Krzyżacy", Czytelnik3);

        System.out.println("Wypisz dostępne książki po zwrotach: ");
        Biblioteka1.wypiszDostepneKsiazki();








    }
}