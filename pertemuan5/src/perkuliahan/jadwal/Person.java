package perkuliahan.jadwal;

public class Person {
    private String nama;
    private String tgl_lhr;
    private Boolean gender;

    public Person(String nama, String tgl_lhr, Boolean gender) {
        this.nama = nama;
        this.tgl_lhr = tgl_lhr;
        this.gender = gender;
    }
    public String getNama() {
        return nama;
    }
    public String getTgl_lhr() {
        return tgl_lhr;
    }

    public Boolean getGender() {
        return gender;
    }
}