package Pertemuan7;

import java.util.Scanner;

public class CobaBuku {
    int kodeBuku, tahunTerbit, stock;
    String judulBuku, pengarang;

    public CobaBuku(int kodeBuku, String 
    judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;

    }

    public void tampilDataBuku(){
        System.out.println("======================");
        System.out.println("Kode buku : "+kodeBuku);
        System.out.println("Judul buku : "+judulBuku);
        System.out.println("Tahun terbit : "+tahunTerbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }

    public static class PencarianBuku08 {
        Buku08 listBk[] = new Buku08[5];
        int idx;
    
        void tambah(Buku08 m){
            if (idx < listBk.length){
                listBk[idx] = m;
                idx++;      
            } else {
                System.out.println("data sudah penuh!");
            }
        }
    
        void tampil(){
            for(Buku08 m : listBk){
                m.tampilDataBuku();
            }
        }
    
        public int FindSeqSearch(int cari){
            int posisi = -1;
            for(int j = 0; j < listBk.length; j++){
                if(listBk[j].kodeBuku == cari){
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }
    
        public void tampilPosisi(int x, int pos){
            if (pos != -1){
                System.out.println("Data : "+ x +" ditemukan pada index " + pos);
            } else {
                System.out.println("Data "+ x + "tidak ditemukan");
            }
        }
    
        // 14
        public void TampilData(int x, int pos){
            if( pos != -1){
                System.out.println("Kode Buku\t : " + x);
                System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
                System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
                System.out.println("Pengarang\t : " + listBk[pos].pengarang);
                System.out.println("Stock\t\t : " + listBk[pos].stock);
            } else {
                System.out.println("Data " + x + "tidak ditemukan");
            }
        }
    
        public int FindBinarySearch(int cari, int left, int right){
            int mid;
            if(right >= left){
                mid = left + (right - left) / 2;
                if (cari == listBk[mid].kodeBuku){
                    return (mid); 
                } else if(listBk[mid].kodeBuku > cari) {
                    return FindBinarySearch(cari, left, mid-1);
                } else {
                    return FindBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }
    }

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
            System.out.print("Stock \t\t: ");
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


