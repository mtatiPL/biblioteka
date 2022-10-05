public class Bibliotekarz extends Osoba {
    private int DataZatrudnienia;

    public Bibliotekarz(String imie, String nazwisko, int DataUr, int dataZatrudnienia) {
        super(imie, nazwisko, DataUr);
        DataZatrudnienia = dataZatrudnienia;
    }

    public int getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public void setDataZatrudnienia(int dataZatrudnienia) {
        DataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "Bibliotekarz{" +
                "DataZatrudnienia=" + DataZatrudnienia +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
