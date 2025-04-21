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
                    if (listJadwal[j].kodeHari > listJadwal[j + 1].kodeHari) {
                        Jadwal temp = listJadwal[j];
                        listJadwal[j] = listJadwal[j + 1];
                        listJadwal[j + 1] = temp;
                    }
                }
            }
        }
    
        // Selection Sort 
        // void sortingDSC() {
        //     for (int i = 0; i < idx - 1; i++) {
        //         int idxMax = i;
        //         for (int j = i + 1; j < idx; j++) {
        //             if (dataDosen[j].usia > dataDosen[idxMax].usia) {
        //                 idxMax = j;
        //             }
        //         }
        //         Dosen01 temp = dataDosen[idxMax];
        //         dataDosen[idxMax] = dataDosen[i];
        //         dataDosen[i] = temp;
        //     }
        // }
    
        // Insertion Sort 
        // void insertionSort() {
        //     for (int i = 1; i < idx; i++) {
        //         Dosen01 temp = dataDosen[i];
        //         int j = i - 1;
        //         while (j >= 0 && dataDosen[j].usia < temp.usia) {
        //             dataDosen[j + 1] = dataDosen[j];
        //             j--;
        //         }
        //         dataDosen[j + 1] = temp;
        //     }
        // }
}
