package Pertemuan1;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bobotNilai, ips, totalSks = 0, totalIp = 0;
        String matkul[]= {"Pancasila", "Konsep Teknologi Informasi","Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan, dan Kesehatan Kerja"};
        double[][] ip = new double[matkul.length][4];
        String[][] nilaiHuruf = new String[matkul.length][3];
        
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for(int i = 0; i < matkul.length; i++){
            System.out.print("Masukkan nilai mata kuliah " + matkul[i] +  " : ");
            ip[i][1] = sc.nextDouble();
            System.out.print("Masukkan SKS : ");
            ip[i][2] = sc.nextDouble();
            
            if (ip[i][1] > 80 && ip[i][1] <= 100){
                nilaiHuruf[i][1] = "A";
                bobotNilai = 4;
            }
             else if (ip[i][1] > 73 && ip[i][1] <= 80){
                nilaiHuruf[i][1] = "B+";
                bobotNilai = 3.5;
            }
             else if (ip[i][1] > 65 && ip[i][1] <= 73){
                nilaiHuruf[i][1] = "B";
                bobotNilai = 3;
            }
             else if (ip[i][1] > 60 && ip[i][1] <= 65){
                nilaiHuruf[i][1] = "C+";
                bobotNilai = 2.5;
            }
             else if (ip[i][1] > 50 && ip[i][1] <= 60){
                nilaiHuruf[i][1] = "C";
                bobotNilai = 2;
            }
             else if (ip[i][1] > 39 && ip[i][1] <= 50){
                nilaiHuruf[i][1] = "D";
                bobotNilai = 1;
            }
             else {
                nilaiHuruf[i][1] = "E";
                bobotNilai = 0;
            }
            ip[i][3] = bobotNilai;

            System.out.println();
        }   

        System.out.println("Hasil Konversi Nilai");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.format("| %-40s | %-10s | %-10s | %-10s | %-10s |\n", "MK", "Bobot SKS", "Nilai Huruf", "Nilai Angka", "Bobot Nilai");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("| %-40s | %.1f        | %-10s  | %.2f       | %.2f        |\n", matkul[i], ip[i][2], nilaiHuruf[i][1], ip[i][1], ip[i][3]);
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
       

        for (int i = 0; i < ip.length; i++) {
            totalSks += ip[i][2];
            totalIp += ip[i][3] * ip[i][2];
        }
        ips = totalIp / totalSks;
        System.out.println("IP : "+ ips);
    }
}