package perkuliahan.jadwal;

public class MataKuliah {
    int kodeMK;
    String namaMK;

    public MataKuliah(String namaMK, int kodeMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }
    public String getNamaMK() {
        return namaMK;
    }
}
