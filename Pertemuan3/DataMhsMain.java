package Pertemuan3;
import java.util.Scanner;

public class DataMhsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : ");
        int i = sc.nextInt();
        DataMhs[] mhs = new DataMhs[i];

        for(int j = 0; j < i; j++) {
            mhs[j] = new DataMhs();
            System.out.println("Masukkan data mahasiswa ke-" + j);
            System.out.println("Masukkan nama : ");
            mhs[j].nama = sc.next();
            System.out.println("Masukkan nim : ");
            mhs[j].nim = sc.nextInt();
            System.out.println("Masukkan jenis kelamin : ");
            mhs[j].gender = sc.next();
            System.out.println("Masukkan IPK : ");
            mhs[j].ipk = sc.nextFloat();
        }

        for(int k = 0; k < i; k++){
            System.out.println("==============================");
            System.out.println("Data mahasiswa ke-" + k);
            System.out.println("Nama : " + mhs[k].nama);
            System.out.println("Nim : " + mhs[k].nim);
            System.out.println("Jenis Kelamin : " + mhs[k].gender);
            System.out.println("Nilai IPK : " + mhs[k].ipk);
        }
        
    }
}
