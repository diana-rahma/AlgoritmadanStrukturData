package Pertemuan5;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah elemen yang dihitung:");
        int elemen = sc.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for(int i = 0; i < elemen; i++) {
            int nilai = 0, pangkat = 0;
            System.out.println("Masukkan nilai yang akan dipangkatkan: ");
            nilai = sc.nextInt();
            System.out.println("Masukkan nilai pangkat: ");
            pangkat = sc.nextInt();
            png[i] = new Pangkat08(nilai, pangkat);
        }

        // Pertanyaan 4
        System.out.println("------------------- PILIHAN -------------------");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilih menu 1/2: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i = 0; i < elemen; i++){
                    System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
        
            default:
                System.out.println("Menu tidak tersedia.");
        }  
    }
}
