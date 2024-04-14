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
    // public int FindJudulSeq(String cari){
    //     int posisi = -1;
    //     for(int j = 0; j < listBk.length; j++){
    //         if(listBk[j].judulBuku.equalsIgnoreCase(cari)){
    //             posisi = j;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    // // mencari judul menggunakan binary
    // public int FindJudulBinary(String cari, int left, int right){
    //     int mid;
    //     if(right >= left){
    //         mid = (left+right) / 2;
    //         if (cari.equals(listBk[mid].judulBuku)){
    //             return (mid); 
    //         } else if(listBk[mid].judulBuku.compareTo(cari) > 0) {
    //             return FindJudulBinary(cari, left, mid-1);
    //         } else {
    //             return FindJudulBinary(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    // menampilkan hasil judul buku
    public void cariSeqJudul(String cari) {
        int count = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(cari)) {
                count++;
                System.out.println("Data : " + cari + " ditemukan pada indeks " + j);
                listBk[j].tampilDataBuku();

            }
        }
        
        if (count == 0) {
            System.out.println("Data : " + cari + " tidak ditemukan");
        } else if (count > 1) {
            System.out.println("\nHasil yang ditemukan lebih dari satu");
        }
    }

    public void cariBinJudul(String cari) {
        int left = 0;
        int right = listBk.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = listBk[mid].judulBuku.compareTo(cari);
            
            if (result == 0) {
                found = true;
                int start = mid;
                int end = mid;

                while (start > 0 && listBk[start - 1].judulBuku.equals(cari)) {
                    start--;
                }
                while (end < listBk.length - 1 && listBk[end + 1].judulBuku.equals(cari)) {
                    end++;
                }

                System.out.println("Data '" + cari + "'' ditemukan pada indeks " + (start) + " sampai " + (end));
                for (int i = start; i <= end; i++) {
                    listBk[i].tampilDataBuku();
                }
                System.out.println("\nHasil yang ditemukan lebih dari satu");
                break;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } if (!found) {
            System.out.println("Data : " + cari + " tidak ditemukan");
        }
    }
}
