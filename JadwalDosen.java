public class JadwalDosen {
    Jadwal[] listJadwal = new Jadwal[7];
    int idx;

    public void tambahJadwal(Jadwal jadwal) {
        if (idx < this.listJadwal.length) {
            this.listJadwal[idx] = jadwal;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataJadwal() {
        System.out.println("=== DATA JADWAL KULIAH ===");
        for (Jadwal jadwal : listJadwal) {
            System.out.printf("Dosen\t\t: %s\n", jadwal.dosen.namaDosen);
            System.out.printf("Mata Kuliah\t: %s\n", jadwal.matakuliah.namaMK);
            System.out.printf("SKS\t\t: %s\n", jadwal.matakuliah.sks);
            System.out.printf("Hari\t\t: %s\n", jadwal.hari);
            System.out.printf("Jam\t\t: %s\n", jadwal.jam);
        }
    }
}
