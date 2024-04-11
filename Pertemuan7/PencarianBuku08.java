package Pertemuan7;

public class PencarianBuku08 {
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

    // soal pertanyaan
    // public int FindBuku(int cari){
    //     int posisi = -1;
    //     for(int j = 0; j < listBk.length; j++){
    //         if(listBk[j].kodeBuku == cari){
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    // public BukuNoAbsen FindBuku(int cari) {
    //     BukuNoAbsen dataBuku = null;
    //     for (int j = 0; j < listBk.length; j++) {
    //       if (listBk[j].kodeBuku == cari) {
    //         dataBuku = listBk[j];
    //         break;
    //       }
    //     }
    //     return dataBuku;
    //   }

    public void tampilPosisi(int x, int pos){
        if (pos != -1){
            System.out.println("Data : "+ x +" ditemukan pada index " + pos);
        } else {
            System.out.println("Data "+ x + " tidak ditemukan");
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

    // public String FindJudulSeq(String cari){
        // String posisi = -1;
        // for(int j = 0; j < listBk.length; j++){
        //     if(listBk[j].kodeBuku == cari){
        //         posisi = j;
        //         break;
        //     }
        // }
        // return posisi;
    // }

    public int FindSeqSearchStr(int cari){
        int posisi = -1;
        for(int j = 0; j < listBk.length; j++){
            if(listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // public String FindJudulBinary(String cari, String left, String right){
        // String mid;
        // if(right >= left){
        //     mid = (left+right) / 2;
        //     if (cari == listBk[mid].kodeBuku){
        //         return (mid); 
        //     } else if(listBk[mid].kodeBuku > cari) {
        //         return FindBinarySearch(cari, left, mid-1);
        //     } else {
        //         return FindBinarySearch(cari, mid + 1, right);
        //     }
        // }
        // return -1;
    // }
}
