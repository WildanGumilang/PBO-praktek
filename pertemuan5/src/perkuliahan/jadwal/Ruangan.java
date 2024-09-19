package perkuliahan.jadwal;

public class Ruangan {
    int kodeRuangan;
    String namaRuangan;

    public Ruangan(int kodeRuangan, String namaRuangan) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
    }
    String getNamaRuangan() {
        return namaRuangan;
    }
}