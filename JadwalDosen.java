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

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                // Prioritaskan sorting berdasarkan hari dulu
                if (listJadwal[j].kodeHari > listJadwal[j + 1].kodeHari) {
                    // Swap jika hari lebih besar
                    Jadwal temp = listJadwal[j];
                    listJadwal[j] = listJadwal[j + 1];
                    listJadwal[j + 1] = temp;
                }
                // Jika hari sama, bandingkan jam
                else if (listJadwal[j].kodeHari == listJadwal[j + 1].kodeHari) {
                    if (listJadwal[j].jamjam > listJadwal[j + 1].jamjam) {
                        // Swap jika jam lebih besar
                        Jadwal temp = listJadwal[j];
                        listJadwal[j] = listJadwal[j + 1];
                        listJadwal[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void tampilJadwal() {
        for (int i = 0; i < idx; i++) {
            listJadwal[i].tampilData();
        }
        System.out.println(); 
    }

    // Selection Sort
    // void sortingDSC() {
    // for (int i = 0; i < idx - 1; i++) {
    // int idxMax = i;
    // for (int j = i + 1; j < idx; j++) {
    // if (dataDosen[j].usia > dataDosen[idxMax].usia) {
    // idxMax = j;
    // }
    // }
    // Dosen01 temp = dataDosen[idxMax];
    // dataDosen[idxMax] = dataDosen[i];
    // dataDosen[i] = temp;
    // }
    // }

    // Insertion Sort
    // void insertionSort() {
    // for (int i = 1; i < idx; i++) {
    // Dosen01 temp = dataDosen[i];
    // int j = i - 1;
    // while (j >= 0 && dataDosen[j].usia < temp.usia) {
    // dataDosen[j + 1] = dataDosen[j];
    // j--;
    // }
    // dataDosen[j + 1] = temp;
    // }
    // }

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