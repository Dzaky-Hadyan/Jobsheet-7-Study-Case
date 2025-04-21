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

        public int sequentialSearching(String cari) {
            int posisi = -1;
            for (int j = 0; j < listJadwal.length; j++) {
              if (listJadwal[j].dosen.namaDosen == cari) {
                posisi = j;
                break;
              }
            }
            return posisi;

    }
}