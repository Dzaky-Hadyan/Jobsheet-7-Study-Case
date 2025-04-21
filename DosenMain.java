import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();
        Dosen d1 = new Dosen("D001", "Budi Hartono");
        Dosen d2 = new Dosen("D002", "Rina Marlina");
        Dosen d3 = new Dosen("D003", "Agus Wijaya");
        Dosen d4 = new Dosen("D004", "Siti Aminah");
        Dosen d5 = new Dosen("D005", "Andi Pratama");

        ListMatkul listMatkul = new ListMatkul();
        MataKuliah m1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah m2 = new MataKuliah("MK002", "Pemrograman Java", 3);
        MataKuliah m3 = new MataKuliah("MK003", "Basis Data", 3);
        MataKuliah m4 = new MataKuliah("MK004", "Algoritma dan Pemrograman", 3);
        MataKuliah m5 = new MataKuliah("MK005", "Matematika Diskrit", 3);
        MataKuliah m6 = new MataKuliah("MK006", "Jaringan Komputer", 3);
        MataKuliah m7 = new MataKuliah("MK007", "Pemrograman Web", 3);
        
        JadwalDosen listJadwalDosen = new JadwalDosen();
        Jadwal j1 = new Jadwal(d1, m1, "Senin", "08:00");
        Jadwal j2 = new Jadwal(d2, m2, "Selasa", "10:00");
        Jadwal j3 = new Jadwal(d3, m3, "Rabu", "09:00");
        Jadwal j4 = new Jadwal(d1, m4, "Kamis", "13:00");
        Jadwal j5 = new Jadwal(d4, m5, "Jumat", "07:00");
        Jadwal j6 = new Jadwal(d5, m6, "Senin", "11:00");
        Jadwal j7 = new Jadwal(d2, m7, "Rabu", "14:00");
        
        int menu = 0;
        do {
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Jadwal");
            System.out.println("4. Urutkan Jadwal Berdasarkan Hari & Jam");
            System.out.println("5. Cari Jadwal Berdasarkan Nama Dosen");
            System.out.println("0. Keluar");
            System.out.print("Menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    
                    break;
            
                case 2:

                    break;

                case 3:

                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}