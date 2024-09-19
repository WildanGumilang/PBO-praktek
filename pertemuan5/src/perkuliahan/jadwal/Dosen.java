package perkuliahan.jadwal;

public class Dosen extends Person {
    int kodeDosen;

    public Dosen(String nama, String tgl_lhr, Boolean gender, int kodeDosen) {
        super(nama, tgl_lhr, gender);
        this.kodeDosen = kodeDosen;
    }
    public void tampilkanData() {
        System.out.println("Nama Dosen       : " + getNama());
        System.out.println("Kode Dosen       : " + kodeDosen);
        System.out.println("Tanggal Lahir    : " + getTgl_lhr());
        System.out.println("Gender           : " + (getGender() ? "Laki-laki" : "Perempuan"));
        System.out.println("--------------------------------");
    }
}