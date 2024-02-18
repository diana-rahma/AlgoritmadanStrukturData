package Pertemuan1;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int namakota = -1;
        char[] KODE = new char[10];
        KODE[0] = 'A'; 
        KODE[1] = 'B';
        KODE[2] = 'D';
        KODE[3] = 'E';
        KODE[4] = 'F';
        KODE[5] = 'G';
        KODE[6] = 'H';
        KODE[7] = 'L';
        KODE[8] = 'N';
        KODE[9] = 'T';
        
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'},
        };

        System.out.print("Masukkan kode plat nomor: ");
        String inputPlat = input.nextLine();

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputPlat.charAt(0)) {
                namakota = i;
                break;
            }
        }
        if (namakota == -1) {
            System.out.println("Kode plat tidak ditemukan!");
        } else {
            System.out.println("Kota: " + new String(KOTA[namakota]));
        }
    }
}
