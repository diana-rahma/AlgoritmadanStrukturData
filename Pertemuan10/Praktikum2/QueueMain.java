package Pertemuan10.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("----------------------");
    }

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
                    System.out.print("No Rekening   : ");
                    String norek = input.nextLine();
                    System.out.print("Nama          : ");
                    String nama = input.nextLine();
                    System.out.print("Alamat        : ");
                    String alamat = input.nextLine();
                    System.out.print("Umur          : ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo         : ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0  && data.saldo != 0){
                        System.out.println("Antrian yang keluar: " + data.norek + " "+ data.nama + " " + data.alamat + " "+data.umur + " " + data.saldo);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
