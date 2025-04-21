public class Jadwal {
    Dosen dosen;
    MataKuliah matakuliah;
    String hari;
    String jam;

    public Jadwal(Dosen dosen, MataKuliah mataKuliah, String hari, String jam) {
        this.dosen = dosen;
        this.matakuliah = mataKuliah;
        this.hari = hari;
        this.jam = jam;
    }


}