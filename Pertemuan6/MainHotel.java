package Pertemuan6;
import java.util.Scanner;
public class MainHotel {
    public static void main(String[] abcd) {
        Scanner sc = new Scanner(System.in);
        HotelService hServ = new HotelService();
        Hotel r1 = new Hotel("Hotel Anggrek", "Surabaya", 300000, (byte)1);
        Hotel r2 = new Hotel("Hotel Mawar", "Malang", 700000, (byte)4);
        Hotel r3 = new Hotel("Hotel Melati", "Batu", 400000, (byte)2);
        Hotel r4 = new Hotel("Hotel Jayabaya", "Makassar", 800000, (byte)5);
        Hotel r5 = new Hotel("Hotel Sky", "Bandung", 500000, (byte)3);

        hServ.tambahHotel(r1);
        hServ.tambahHotel(r2);
        hServ.tambahHotel(r3);
        hServ.tambahHotel(r4);
        hServ.tambahHotel(r5);

        System.out.println("------------ Data sebelum sorting ------------ ");
        hServ.tampilAll();

        System.out.println("-------- Pilihan Sorting --------");
        System.out.println("1. Sorting harga bubble sort");
        System.out.println("2. Sorting bintang bubble sort");
        System.out.println("3. Sorting harga selection sort");
        System.out.println("4. Sorting bintang selection sort");
        System.out.print("Pilih menu 1 - 4: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("------------ Data Setelah sorting asc berdasarkan harga ------------");
                hServ.bubbleSortHarga();
                hServ.tampilAll();
                break;

            case 2:
                System.out.println("------------ Data setelah sorting desc berdasarkan bintang ------------");
                hServ.bubbleSortBintang();
                hServ.tampilAll();
                break;

            case 3:
                System.out.println("------------ Data setelah sorting asc berdasarkan harga ------------");
                hServ.selectionSortHarga();
                hServ.tampilAll();
                break;

            case 4:
                System.out.println("------------ Data setelah sorting desc berdasarkan bintang ------------");
                hServ.selectionSortBintang();
                hServ.tampilAll();
                break;
        
            default:
                System.out.println("Pilihan tidak tersedia");
        }   
    }
}
