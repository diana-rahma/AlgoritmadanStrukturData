package Pertemuan3;
import java.util.Scanner;

public class DataMhsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");
        int i = sc.nextInt();
        DataMhs[] mhs = new DataMhs[i];

        for(int j = 1; j < i; j++) {
            mhs[j] = new DataMhs();
            System.out.println("Masukkan data mahasiswa ke-" + j);
            System.out.print("Masukkan nama : ");
            mhs[j].nama = sc.next();
            System.out.print("Masukkan nim : ");
            mhs[j].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            mhs[j].gender = sc.next();
            System.out.print("Masukkan IPK : ");
            mhs[j].ipk = sc.nextFloat();
        }

        System.out.println();
        for(int k = 1; k < i; k++){
            System.out.println("Data mahasiswa ke-" + k);
            System.out.println("Nama : " + mhs[k].nama);
            System.out.println("Nim : " + mhs[k].nim);
            System.out.println("Jenis Kelamin : " + mhs[k].gender);
            System.out.println("Nilai IPK : " + mhs[k].ipk);
        }

        float rataIPK = mhs[1].hitungRataIPK(mhs, i);
        System.out.println("\nRata-rata IPK seluruh mahasiswa: " + rataIPK);

        float ipkTertinggi = mhs[1].cariMhsIpkTertinggi(mhs, i);
        System.out.println("Nilai IPK Tertinggi dari seluruh mahasiswa: " + ipkTertinggi);
    }
}
