package Pertemuan7;

import Pertemuan2.Buku08;

public class PencarianBuku08 {
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
            System.out.println("Data : "+ x +"ditemukan pada index " + pos);
        } else {
            System.out.println("Data "+ x + "tidak ditemukan");
        }
    }

    // 14
    public void TampilData(int x, int pos){
        if( pos != -1){
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+right) / 2;
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
