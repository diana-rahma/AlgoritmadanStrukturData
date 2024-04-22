package UTS;
import java.util.Scanner;
public class utsMain {
    public static void main(String[] args) {
        uts data = new uts();
        Scanner sc = new Scanner(System.in);
        int angka[] = {23, 33, 42, 39, 40, 5, 3, 14, 3, 30, 14, 45, 48, 27, 44, 14, 21};
        System.out.println("Sorting dengan merge sort");
        uts mSort = new uts();
        System.out.println("Data awal");
        mSort.printArray(angka);
        mSort.mergeSort(angka);
        System.out.println("Setelah diurutkan");
        mSort.printArray(angka);

        System.out.println("=====================");
        System.out.println("Pencarian Data");
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cariAngka = sc.nextInt();
        System.out.println("Pencarian menggunakan sequential sort");
        int posisi = data.FindSeqAngka(angka, cariAngka);
        data.TampilPosisi(cariAngka, posisi);
    }
}
