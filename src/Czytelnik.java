import java.util.ArrayList;

public class Czytelnik extends Osoba {
    private int NrCzytelnika;
    private ArrayList<Ksiazka> wypozyczoneKsiazki= new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, int DataUr, int nrCzytelnika, ArrayList<Ksiazka> wypozyczoneKsiazki) {
        super(imie, nazwisko, DataUr);
        NrCzytelnika = nrCzytelnika;
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    public int getNrCzytelnika() {
        return NrCzytelnika;
    }

    public ArrayList<Ksiazka> getWypozyczoneKsiazki() {
        return wypozyczoneKsiazki;
    }

    public void setNrCzytelnika(int nrCzytelnika) {
        NrCzytelnika = nrCzytelnika;
    }

    public void setWypozyczoneKsiazki(ArrayList<Ksiazka> wypozyczoneKsiazki) {
        this.wypozyczoneKsiazki = wypozyczoneKsiazki;
    }

    @Override
    public String toString() {
        return "Czytelnik{" +
                "NrCzytelnika=" + NrCzytelnika +
                ", wypozyczoneKsiazki=" + wypozyczoneKsiazki +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
