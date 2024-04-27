// TIDAK DIGUNAKAN / SALAH


package Pertemuan7;
import java.util.Scanner;

public class Buku08 {
    int tahunTerbit, stock;
    String judulBuku, kodeBuku, pengarang;

    public Buku08(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;

    }

    public void tampilDataBuku(){
        System.out.println("======================");
        System.out.println("Kode buku       : "+kodeBuku);
        System.out.println("Judul buku      : "+judulBuku);
        System.out.println("Tahun terbit    : "+tahunTerbit);
        System.out.println("Pengarang       : "+pengarang);
        System.out.println("Stock           : "+stock);
    }

    public static class PencarianCobaBuku {
        Buku_08 listBk[] = new Buku_08[5];
    int idx;

    void tambah(Buku_08 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;      
        } else {
            System.out.println("data sudah penuh!");
        }
    }

    void tampil(){
        for(Buku_08 m : listBk){
            m.tampilDataBuku();
        }
    }

    // Sequential search + sesudah modifikasi menggunakan tipe data string
    public int FindSeqSearch(String cari){
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++){
          if(listBk[j].kodeBuku.equals(cari)){
            posisi = j;
            break;
          }
        }
        return posisi;
    }

    // public int FindSeqSearch(int cari){
    //     int posisi = -1;
    //     for(int j = 0; j < listBk.length; j++){
    //         if(listBk[j].kodeBuku == cari){
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    // soal nomer 3 sequential
    public Buku_08 FindBuku(String cari) {
        Buku_08 dataBuku = null; 
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
            dataBuku = listBk[j]; 
            break;
            }
        }
        return dataBuku;
    }

    public void tampilPosisi(String x, int pos){
        if (pos != -1){
            System.out.println("Data : "+ x +" ditemukan pada index " + pos);
        } else {
            System.out.println("Data "+ x + " tidak ditemukan");
        }
    }

    // 14
    public void TampilData(String x, int pos){
        if( pos != -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    //  Binary search + sesudah modifikasi menggunakan string
    public int FindBinarySearch(String cari, int left, int right){
        int mid;
        if(right >= left){
          mid = (right + left) / 2;
          if (cari.equals(listBk[mid].kodeBuku)){
            return (mid); 
          } else if(listBk[mid].kodeBuku.compareTo(cari) > 0) {
            return FindBinarySearch(cari, left, mid - 1);
          } else {
            return FindBinarySearch(cari, mid + 1, right);
          }
        }
        return -1;
    }

    // public int FindBinarySearch(int cari, int left, int right){
    //     int mid;
    //     if(right >= left){
    //         mid = (left+right) / 2;
    //         if (cari == listBk[mid].kodeBuku){
    //             return (mid); 
    //         } else if(listBk[mid].kodeBuku < cari) {
    //             return FindBinarySearch(cari, left, mid-1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }


    // Modifikasi tugas 2
    // - membuat sorting
    public void selectionSort(){
        for(int i=0; i<listBk.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listBk.length; j++){
                if(listBk[j].kodeBuku.compareToIgnoreCase(listBk[idxMin].kodeBuku) < 0){
                    idxMin = j;
                }
            }

            Buku_08 tmp = listBk[idxMin];
            listBk[idxMin] = listBk[i];
            listBk[i] = tmp;
        }
    }

    // Mencari judul menggunakan sequential serach
    public int FindJudulSeq(String cari){
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++){
            if(listBk[j].judulBuku.equalsIgnoreCase(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // mencari judul menggunakan binary
    public int FindJudulBinary(String cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+right) / 2;
            if (cari.equals(listBk[mid].judulBuku)){
                return (mid); 
            } else if(listBk[mid].judulBuku.compareTo(cari) > 0) {
                return FindJudulBinary(cari, left, mid-1);
            } else {
                return FindJudulBinary(cari, mid + 1, right);
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
        System.out.println("------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan Kode Buku yang dicari");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        // soal nomer 3 
        Buku_08 databuku = data.FindBuku(cari);
        databuku.tampilDataBuku();

        // binary search
        System.out.println("==============================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

       

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


