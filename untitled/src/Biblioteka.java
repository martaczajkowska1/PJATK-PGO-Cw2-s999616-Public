public class Biblioteka {

    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc){
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        if (liczbaKsiazek < ksiazki.length){
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek ++;
        }else{
            System.out.println("Brak miejsca!");
        }
    }

    public void wypiszDostepneKsiazki(){
        for (int i = 0; i< liczbaKsiazek; i++) {
            ksiazki[i].wypiszInfo();
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul){
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki(){
       return liczbaKsiazek;
        }

        public void wypozyczKsiazke(String tytul, Czytelnik czytelnik){
        for(int i = 0; i < liczbaKsiazek; i++){
            if(ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                ksiazki[i].wypozycz();
                czytelnik.zwiekszLiczbeWypozyczen();
                System.out.println("Wypożyczono książkę " + tytul);
                return;
            }
            }
        System.out.println("Nie ma takiej książki");
        }

        public void zwrocKsiazke(String tytul, Czytelnik czytelnik){
        for ( int i = 0; i < liczbaKsiazek; i++){
            if(ksiazki[i].getTytul().equalsIgnoreCase(tytul)){
                ksiazki[i].zwroc();
                czytelnik.zmniejszLiczbeWypozyczen();
                System.out.println("Zwrócono książkę " + tytul);
                return;
            }
        }
            System.out.println("Nie ma takiej książki w bibliotece");
        }
        }



