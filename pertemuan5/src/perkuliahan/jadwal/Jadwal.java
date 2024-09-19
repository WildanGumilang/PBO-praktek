package perkuliahan.jadwal;

public class Jadwal {
    String hari;
    String waktu_mulai;
    String waktu_selesai;
    MataKuliah mataKuliah;
    Dosen dosen;
    Ruangan ruangan;

    public Jadwal(String hari, String waktu_mulai, String waktu_selesai, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan) {
        this.hari = hari;
        this.waktu_mulai = waktu_mulai;
        this.waktu_selesai = waktu_selesai;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }
    String getHari() {
        return hari;
    }
    String getWaktu_mulai() {
        return waktu_mulai;
    }
    String getWaktu_selesai() {
        return waktu_selesai;
    }
    MataKuliah getMataKuliah() {
        return mataKuliah;
    }
    Dosen getDosen() {
        return dosen;
    }
    Ruangan getRuangan() {
        return ruangan;
    }
    public void tampilkanData(boolean tampilkanHari) {
        if (tampilkanHari) {
            System.out.println("--------------------------------");
            System.out.println("Hari             : " + getHari());
        }
        System.out.println("Waktu            : " + getWaktu_mulai() + " - " + getWaktu_selesai());
        System.out.println("Mata Kuliah      : " + getMataKuliah().getNamaMK());
        System.out.println("Dosen Pengampu   : " + getDosen().getNama());
        System.out.println("Ruangan          : " + getRuangan().getNamaRuangan());
        System.out.println();
    }
}
