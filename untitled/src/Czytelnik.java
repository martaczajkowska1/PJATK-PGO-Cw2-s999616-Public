public class Czytelnik {

    private String Imie;
    private String Nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String Imie, String Nazwisko, int numerKarty, int liczbaWypozyczen){
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane(){
        System.out.println("Imie: "+ Imie);
        System.out.println("Nazwisko: "+ Nazwisko);
        System.out.println("Numer karty: "+ numerKarty);
        System.out.println("Liczba wypożyczeń: " + liczbaWypozyczen);

    }

    public void zwiekszLiczbeWypozyczen(){
        liczbaWypozyczen++;
    }

    public void zmniejszLiczbeWypozyczen(){
        liczbaWypozyczen--;
    }



}
