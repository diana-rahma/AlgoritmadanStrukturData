package Pertemuan11.Tugas2;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Queue antri = new Queue();
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    int nim = sc.nextInt();
                    System.out.print("Nama  : ");
                    String nama = input.nextLine();
                    Mahasiswa pbl = new Mahasiswa(nim, nama);
                    sc.nextLine();
                    antri.Enqueue(pbl);
                    break;
                
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (data.nim != 0 && !"".equals(data.nama)){
                        System.out.println("Antrian yang keluar: " + data.nim + ", "+ data.nama);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    System.out.println("Masukkan nim: ");
                    int carinim = sc.nextInt();
                    antri.peekPosition(carinim);
                    break;
                
                case 6:
                    System.out.println("Masukkan nomor urutan: ");
                    int no = sc.nextInt();
                    antri.printMhs(no);
                    break;

                case 7:
                    antri.print();

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    public static void menu(){
        System.out.println("---------------------------------------");
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("5. Cek antrian berdasarkan nim");
        System.out.println("6. Cek antrian berdasarkan urutan");
        System.out.println("7. Cek semua antrian");
        System.out.println("---------------------------------------");
    }
}
