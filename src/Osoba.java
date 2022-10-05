public abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    private int DataUr;

    public Osoba(String imie, String nazwisko, int DataUr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.DataUr = DataUr;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", DataUr=" + DataUr +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getDataUr() {
        return DataUr;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUr(int dataUr) {
        DataUr = dataUr;
    }
}


