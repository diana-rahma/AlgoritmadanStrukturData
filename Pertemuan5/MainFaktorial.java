package Pertemuan5;
import java.util.Scanner;

public class MainFaktorial {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("----------------------");
    System.out.println("Masukkan jumlah elemen:");
    int iJml = sc.nextInt();

    Faktorial08[] fk = new Faktorial08[10];
    for(int i = 0; i < iJml; i++) {
        fk[i] = new Faktorial08();
        System.out.println("Masukkan nilai data ke-" + (i+1)+ ":");
        // int iNilai = sc.nextInt();
        fk[i].nilai = sc.nextInt();
    }

    System.out.println("HASIL - BRUTE FORCE");
    for(int i = 0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
    }
    
    System.out.println("HASIL - DIVIDE CONQUER");
    for(int i = 0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
    } 
   }
}
