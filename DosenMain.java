import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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