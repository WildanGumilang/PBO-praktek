import perkuliahan.jadwal.*;

public class App {
    public static void main(String[] args) {
        
        Mahasiswa[] mahasiswa = new Mahasiswa[10];
        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Mahasiswa("Mahasiswa " + (i + 1), "01-01-2000", i % 2 == 0, 231511100 + i, "Teknik Komputer dan Informatika", "D3-Teknik Informatika");
        } 
        
        Dosen[] dosen = new Dosen[10];
        dosen[0] = new Dosen("Yudhi W", "10-10-1975", true, 111);
        dosen[1] = new Dosen("Trisna G", "11-11-1980", true, 112);
        dosen[2] = new Dosen("Ade H", "11-11-1980", false, 113);
        dosen[3] = new Dosen("Irawan T", "11-11-1980", true, 114);
        dosen[4] = new Dosen("Yadhi A", "11-11-1980", true, 115);
        dosen[5] = new Dosen("Rizqi S", "11-11-1980", true, 116);
        dosen[6] = new Dosen("Suprihanto", "11-11-1980", true, 117);
        dosen[7] = new Dosen("Santi S", "11-11-1980", false, 118);
        dosen[8] = new Dosen("Ade C", "11-11-1980", true, 113);
        dosen[9] = new Dosen("Zulkifli A", "11-11-1980", true, 113);
        
        
        MataKuliah[] matakuliah = new MataKuliah[11];
        matakuliah[0] = new MataKuliah("Komputer Grafik (TE)", 1001);
        matakuliah[1] = new MataKuliah("Basis Data (TE)", 1002);
        matakuliah[2] = new MataKuliah("Proyek 3", 1003);
        matakuliah[3] = new MataKuliah("PBO (TE)", 1004);
        matakuliah[4] = new MataKuliah("Aljabar Linear", 1005);
        matakuliah[5] = new MataKuliah("Matematika Diskrit II", 1006);
        matakuliah[6] = new MataKuliah("PRPL (TE)", 1007);
        matakuliah[7] = new MataKuliah("Komputer Grafik (PR)", 1008);
        matakuliah[8] = new MataKuliah("Basis Data (PR)", 1009);
        matakuliah[9] = new MataKuliah("PBO (PR)", 1010);
        matakuliah[10] = new MataKuliah("PRPL (PR)", 1011);
        
        Ruangan[] ruangan = new Ruangan[4];
        ruangan[0] = new Ruangan(101, "Lab Komputer D1");
        ruangan[1] = new Ruangan(102, "Kelas D2");
        ruangan[2] = new Ruangan(103, "Kelas D5");
        ruangan[3] = new Ruangan(104, "Lab Komputer D4");
        
        Jadwal[] jadwal = new Jadwal[11];
        jadwal[0] = new Jadwal("Senin", "08:40", "10:40", matakuliah[3], dosen[4], ruangan[1]);
        jadwal[1] = new Jadwal("Senin", "10:40", "12:20", matakuliah[0], dosen[0], ruangan[1]);
        jadwal[2] = new Jadwal("Senin", "13:00", "15:30", matakuliah[5], dosen[6], ruangan[1]);
        jadwal[3] = new Jadwal("Senin", "15:50", "18:20", matakuliah[7], dosen[1], ruangan[0]);
        jadwal[4] = new Jadwal("Selasa", "07:00", "08:40", matakuliah[1], dosen[8], ruangan[1]);
        jadwal[5] = new Jadwal("Selasa", "08:40", "10:40", matakuliah[4], dosen[5], ruangan[1]);
        jadwal[6] = new Jadwal("Selasa", "10:40", "12:20", matakuliah[6], dosen[7], ruangan[1]);
        jadwal[7] = new Jadwal("Rabu", "07:00", "16:40", matakuliah[2], dosen[3], ruangan[3]);
        jadwal[8] = new Jadwal("Kamis", "09:50", "15:30", matakuliah[10], dosen[4], ruangan[0]);
        jadwal[9] = new Jadwal("Kamis", "15:30", "18:20", matakuliah[9], dosen[9], ruangan[1]);
        jadwal[10] = new Jadwal("Jumat", "07:00", "14:40", matakuliah[8], dosen[2], ruangan[3]);
        
        System.out.println("\nData Mahasiswa :\n");
        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i].tampilkanData(); 
        }
        
        System.out.println("\nData Dosen :\n");
        for (int i = 0; i < dosen.length; i++) {
            dosen[i].tampilkanData(); 
        }
        
        System.out.println("\nJadwal Perkuliahan : \n");
        jadwal[0].tampilkanData(true);
        jadwal[1].tampilkanData(false);
        jadwal[2].tampilkanData(false);
        jadwal[3].tampilkanData(false);
        jadwal[4].tampilkanData(true);
        jadwal[5].tampilkanData(false);
        jadwal[6].tampilkanData(false);
        jadwal[7].tampilkanData(true);
        jadwal[8].tampilkanData(true);
        jadwal[9].tampilkanData(false);
        jadwal[10].tampilkanData(true);
    }
}