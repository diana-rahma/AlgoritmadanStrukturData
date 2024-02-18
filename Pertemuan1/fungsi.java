package Pertemuan1;
import java.util.Scanner;
public class fungsi {
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static String[] namaCabang = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[] jmlBunga = new int[4];
    static int[] bungaMati = {1, 2, 0, 5};
    static int stockBunga[][] = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}

    };
    static long pendapatanCabang = 0;
    public static void main(String[] args) {
        pendapatan();
        stockBunga4();
    }

    // fungsi untuk menampilkan pendapatan setiap cabang
    static void pendapatan(){
        System.out.println("=======================================================");
        System.out.println("Pendapatan pada setiap cabang jika semua bunga habis");
        System.out.println("=======================================================");
        for (int i = 0; i < stockBunga.length; i++ ){
            for (int j = 0; j < hargaBunga.length; j++){
                pendapatanCabang += stockBunga[i][j] * hargaBunga[j];
                
            }
            System.out.println("Pendapatan dari cabang "+ namaCabang[i] +" adalah Rp."+ pendapatanCabang);
        }
    }

    // fungsi untuk mengetahui jumlah Stock pada cabang royalgarden 4
    static void stockBunga4(){
        System.out.println("=======================================================");
        System.out.println("Stock bunga pada cabang RoyalGarden4");
        System.out.println("=======================================================");
        for(int i = 3; i < 4; i++){
            for(int j = 0; j < stockBunga[0].length; j++){
                stockBunga[i][j] -= bungaMati[j];
                System.out.printf("%s : %d (mati %d) \n", namaBunga[j], stockBunga[i][j], bungaMati[j]);
            }
        }
    }
}
