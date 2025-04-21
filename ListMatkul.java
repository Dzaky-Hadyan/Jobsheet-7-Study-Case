public class ListMatkul {
    MataKuliah[] listMatkul = new MataKuliah[7];
    int idx;
    void tambah(MataKuliah mataKuliah) {
        if (idx < this.listMatkul.length) {
            this.listMatkul[idx] = mataKuliah;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
}
