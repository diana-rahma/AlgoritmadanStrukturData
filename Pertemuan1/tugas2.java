package Pertemuan1;
import java.util.Scanner;
// Tugas nomer 2
public class tugas2 {
    static Scanner input = new Scanner(System.in);
    static int menu;
    static Double jarak, kecepatan, waktu;
    public static void main(String[] args) {
        do {
            menu();
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    kecepatan();
                    break;
    
                case 2:
                    jarak();
                    break;
    
                case 3:
                    waktu();
                    break;
    
                case 4:
                    System.out.println("Anda telah keluar");
                    break;
            
                default:
                    System.out.println("Menu tidak tersedia");;
            }
        } while (menu != 4);
    }
    
    static void menu() {
        System.out.println("==========================================");
        System.out.println("Program hitung kecepatan, jarak, dan waktu");
        System.out.println("==========================================");
        System.out.println("1. Hitung kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("4. Keluar");
        System.out.print("Pilih salah satu menu : ");
    }

    static void kecepatan() {
        System.out.println("============= Hitung Kecepatan =============");
        System.out.print("Masukkan jarak : ");
        jarak = input.nextDouble();
        System.out.print("Masukkan waktu : ");
        waktu = input.nextDouble();
        Double hasilKecepatan = jarak /   waktu;
        System.out.println("Hasil perhitungan kecepatannya adalah " + hasilKecepatan);
    }

    static void jarak() {
        System.out.println("============== Hitung Jarak ==============");
        System.out.print("Masukkan kecepatan : ");
        kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu : ");
        waktu = input.nextDouble();
        Double hasilJarak = kecepatan * waktu;
        System.out.println("Hasil perhitungan jaraknya adalah : " +hasilJarak);
    }

    static void waktu() {
        System.out.println("============== Hitung Waktu ==============");
        System.out.print("Masukkan jarak : ");
        jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan : ");
        kecepatan = input.nextDouble();
        Double hasilWaktu = jarak / kecepatan;
        System.out.println("Hasil perhitungan waktunya adalah : " + hasilWaktu);
    }
}
