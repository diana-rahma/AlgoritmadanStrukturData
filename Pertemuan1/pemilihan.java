package Pertemuan1;

import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = sc.nextFloat();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        uts = sc.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        uas = sc.nextFloat();

        nilaiAkhir = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.4F);
        if (nilaiAkhir > 80 && nilaiAkhir <=100) {
            nilaiHuruf = "A";
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
        }
        else {
            nilaiHuruf = "E";
        }

        System.out.println("======================");
        System.out.println("======================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");
        
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("MAAF, ANDA DINYATAKAN TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA DINYATAKAN LULUS");
        }
        
        
    }
}