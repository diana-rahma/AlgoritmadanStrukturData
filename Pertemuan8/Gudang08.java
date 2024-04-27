package Pertemuan8;

public class Gudang08 {
    Barang08[] tumpukan;
    int size, top;

    public Gudang08(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang08[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang08 brg){
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang08 ambilBarang(){
        if(!cekKosong()){
            Barang08 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari Gudang");
        } else {
            System.out.println("Tumpukan barang kosong");
        }
        return null;
    }

    public Barang08 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang08 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+barangTeratas.nama);
        } else {
            System.out.println("Tumpukan barang kosong");
        }
        return null;
    }

    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang");
            for(int i = 0; i <= top; i++){
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode){
        StackKonversi08 stack = new StackKonversi08();
        while(kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    
}
