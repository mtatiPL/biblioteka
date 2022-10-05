import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Czytelnik> czytelnicy= new ArrayList<>();
    private ArrayList<Bibliotekarz> bibliotekarze= new ArrayList<>();
    private ArrayList<Ksiazka> ksiazki= new ArrayList<>();

    public Biblioteka(ArrayList<Czytelnik> czytelnicy, ArrayList<Bibliotekarz> bibliotekarze, ArrayList<Ksiazka> ksiazki) {
        this.czytelnicy = czytelnicy;
        this.bibliotekarze = bibliotekarze;
        this.ksiazki = ksiazki;
    }

    public ArrayList<Czytelnik> getCzytelnicy() {
        return czytelnicy;
    }

    public ArrayList<Bibliotekarz> getBibliotekarze() {
        return bibliotekarze;
    }

    public ArrayList<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setCzytelnicy(ArrayList<Czytelnik> czytelnicy) {
        this.czytelnicy = czytelnicy;
    }

    public void setBibliotekarze(ArrayList<Bibliotekarz> bibliotekarze) {
        this.bibliotekarze = bibliotekarze;
    }

    public void setKsiazki(ArrayList<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }
}
