package Pertemuan10.Tugas;
import java.util.Scanner; 

public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama      : ");
                    String nama = input.nextLine();
                    System.out.print("Nomor HP  : ");
                    int noHp = sc.nextInt();
                    Pembeli pbl = new Pembeli(nama, noHp);
                    sc.nextLine();
                    antri.Enqueue(pbl);
                    break;
                
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHp != 0){
                        System.out.println("Antrian yang keluar: " + data.nama + ", "+ data.noHp);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.peekRear();
                    break;

                case 5:
                    System.out.println("Masukkan nama: ");
                    String carinama = input.nextLine();
                    antri.peekPosition(carinama);
                    break;
                
                case 6:
                    antri.daftarPembeli();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }

    public static void menu(){
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("5. Cek antrian berdasarkan nama");
        System.out.println("6. Cek semua antrian");
        System.out.println("----------------------");
    }
    
}
