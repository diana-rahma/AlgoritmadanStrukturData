package Pertemuan2;

public class Buku08 {
    String judul, pengarang;
    int halaman, stok, harga, total, bayar, diskon;

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: "+ halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp "+ harga);
        System.out.println("Harga Total: " + total);
        System.out.println("Diskon sebesar : Rp" + diskon);
        System.out.println("Harga bayar setelah dikurangi diskon : Rp " + bayar);
    }

    void terjual(int jml){
        if (stok > 10){
            stok -= jml;
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(int jml){
        total = harga * jml;
    }

    void hitungDiskon(){
        if(total > 150000){
            diskon += total * 0.12;
        } else if (total > 75000 && total <= 150000) {
            diskon += total * 0.5;
        } else {
            System.out.println("Tidak ada diskon");
        }
    }

    void hitungHargaBayar(){
        bayar = total - diskon;
    }

    public Buku08(){
        
    }

    public Buku08(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}