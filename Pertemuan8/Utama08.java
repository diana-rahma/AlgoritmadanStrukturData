package Pertemuan8;
import java.util.Scanner;

public class Utama08 {
    public static void main(String[] args) {
        // Gudang08 gudang = new Gudang08(7);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Masukkan jumlah tumpukan barang: ");
        int jumlah = scanner.nextInt();
        Gudang08 gudang = new Gudang08(jumlah);
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat tumpukan teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner1.next();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner1.next();
                    Barang08 barangBaru = new Barang08(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                
                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.peek();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
