package Pertemuan7;
import java.util.Scanner;

public class BukuMain08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku08 data = new PencarianBuku08();
        int jumBuku = 5;

        System.out.println("==============================");
        System.out.println("Masukkan data buku : ");
        for(int i = 0; i < jumBuku; i++){
            System.out.println("-------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine(); 
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print ("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock  \t\t : ");
            int stock = s.nextInt();

            Buku_08 m = new Buku_08(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        // System.out.println("------------------------------");
        // System.out.println("Data keseluruhan Buku : ");
        // data.tampil();

        // System.out.println("------------------------------");
        // System.out.println("------------------------------");
        // System.out.println("Pencarian Data");
        // System.out.println("Masukkan Kode Buku yang dicari");
        // System.out.print("Kode Buku : ");
        // String cari = s1.nextLine();
        // System.out.println("Menggunakan sequential search");
        // int posisi = data.FindSeqSearch(cari);
        // data.tampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

        // modifikasi soal latihan 2 
        System.out.println("------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------");
        System.out.println("Data keseluruhan Buku setelah diurutkan : ");
        data.selectionSort();
        data.tampil();

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan Judul Buku yang dicari");
        System.out.print("Judul Buku : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan sequential search");
        data.cariSeqJudul(cari);
        // data.tampilJudul(cari, posisi);
        // data.tampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

        // soal nomer 3 
        // Buku_08 databuku = data.FindBuku(cari);
        // databuku.tampilDataBuku();

        // binary search
        System.out.println("==============================");
        System.out.println("Menggunakan binary search");
        data.cariBinJudul(cari);
        // posisi = data.FindJudulBinary(cari, 0, jumBuku - 1);
        // data.FindSeqJudul(cari);
        // data.FindBinJudul(cari);
        // data.tampilJudul(cari, posisi);
        // data.tampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

       

        // System.out.println("==============================");
        // System.out.println("Menggunakan binary search string");
        // posisi = data.FindSeqSearchStr(cari);
        // data.tampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

        // warn jika judul buku lebih dari 1
        // for(int i=0; i<data.posisi.length; i++){
        //     if(data.posisi[i] != 0){

        //     }
        // }
    }
    
}
