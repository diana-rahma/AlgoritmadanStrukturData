package Pertemuan7;
import java.util.Scanner;

public class BukuMain08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku08 data = new PencarianBuku08();
        int jumBuku = 5;

        System.out.println("==============================");
        System.out.println("Masukkan data buku urut dari kodebuku terkecil : ");
        for(int i = 0; i < jumBuku; i++){
            System.out.println("-------------------");
            System.out.print("Kode Buku \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock  \t : ");
            int stock = s.nextInt();

            Buku08 m = new Buku08(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("------------------------------");
        System.out.println("Data keselururhan Mahasiswa : ");
        data.tampil();

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan Kode Buku yang dicari");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        // 
        data.TampilData(cari, posisi);

        // binary search
        System.out.println("==============================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
    
}
