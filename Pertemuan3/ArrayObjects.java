package Pertemuan3;
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah Persegi Panjang: ");
        int i = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[i];

        for(int j = 0; j < i; j++){
            ppArray[j] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + j);
            System.out.println("Masukkan panjang: ");
            ppArray[j].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[j].lebar = sc.nextInt();
        }

        for(int j = 0; j < i; j++){
            System.out.println("Persegi Panjang ke-" + j);
            System.out.println("Panjang: " + ppArray[j].panjang + ", lebar: " + ppArray[j].lebar);
        }

        // ppArray[0] = new PersegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // System.out.println("Persegi panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }    
}
