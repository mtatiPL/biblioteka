public class Ksiazka {
    private String tytul;
    private String autor;
    private  boolean czyWypozyczona;

    public Ksiazka(String tytul, String autor, boolean czyWypozyczona) {
        this.tytul = tytul;
        this.autor = autor;
        this.czyWypozyczona = czyWypozyczona;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", czyWypozyczona=" + czyWypozyczona +
                '}';
    }
}
