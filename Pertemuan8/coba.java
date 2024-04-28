package Pertemuan8;
import java.util.Scanner;

public class coba {
    int kode;
    String nama, kategori;

    coba(int kode, String nama, String kategori){
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }

    public static class Gudang08 {
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
    public static class StackKonversi08 {
        int size;
        int[] tumpukanBiner;
        int top;

        public StackKonversi08(){
            this.size = 32; //asumsi 32 bit
            tumpukanBiner = new int[size];
            top = -1;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == size -1;
        }

        public void push(int data){
            if(isFull()){
                System.out.println("Stack penuh");
            } else {
                top++;
                tumpukanBiner[top] = data;
            }
        }

        public int pop(){
            if (isEmpty()){
                System.out.println("Stack kosong");
                return -1;
            } else {
                int data = tumpukanBiner[top];
                top--;
                return data;
            }
        }

        public coba ambilBarang(){
            if (!isFull()){
                coba delete = tumpukan[top];
                top--;
                System.out.println("Barang "+ delete.nama + " diambil dari gudang");
                System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
                return delete;
            } else {
                System.out.println("Tumpukan barang kosong");
                return null;
            }
        }

    }  

    public static void main(String[] args) {
        Gudang08 gudang = new Gudang08(7);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
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
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }

}
