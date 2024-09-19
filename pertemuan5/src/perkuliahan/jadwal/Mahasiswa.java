package perkuliahan.jadwal;

public class Mahasiswa extends Person {
    int NIM;
    String jurusan;
    String prodi;

    public Mahasiswa(String nama, String tgl_lhr, Boolean gender, int NIM, String jurusan, String prodi) {
        super(nama, tgl_lhr, gender);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }
    public int getNIM() {
        return NIM;
    }
    public void tampilkanData() {
        System.out.println("Nama Mahasiswa   : " + getNama());
        System.out.println("NIM              : " + NIM);
        System.out.println("Tanggal Lahir    : " + getTgl_lhr());
        System.out.println("Gender           : " + (getGender() ? "Laki-laki" : "Perempuan"));
        System.out.println("Jurusan          : " + jurusan);
        System.out.println("Program Studi    : " + prodi);
        System.out.println("--------------------------------");
    }
}
