//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Czytelnik Czytelnik1 = new Czytelnik("Jan", "Kowalski", 123, 2);
        Czytelnik Czytelnik2 = new Czytelnik("Anna", "Nowak", 345, 5);
        Czytelnik Czytelnik3 = new Czytelnik("Maria", "Kwiatkowska", 235, 6);


        Czytelnik1.wypiszDane();
        Czytelnik2.wypiszDane();
        Czytelnik3.wypiszDane();

        Czytelnik1.zwiekszLiczbeWypozyczen();
        Czytelnik2.zwiekszLiczbeWypozyczen();
        Czytelnik3.zwiekszLiczbeWypozyczen();


        System.out.println("Po zwiększeniu wypożyczeń:");
        Czytelnik1.wypiszDane();
        Czytelnik2.wypiszDane();
        Czytelnik3.wypiszDane();

        Czytelnik1.zmniejszLiczbeWypozyczen();
        Czytelnik2.zmniejszLiczbeWypozyczen();
        Czytelnik3.zmniejszLiczbeWypozyczen();

        System.out.println("Po zmniejszeniu wypożyczeń:");
        Czytelnik1.wypiszDane();
        Czytelnik2.wypiszDane();
        Czytelnik3.wypiszDane();





    }
}