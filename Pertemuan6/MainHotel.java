package Pertemuan6;

public class MainHotel {
    public static void main(String[] abcd) {
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

        System.out.println("------------ Data Setelah sorting asc berdasarkan harga ------------");
        hServ.bubbleSortHarga();
        hServ.tampilAll();

        System.out.println("------------ Data setelah sorting desc berdasarkan bintang ------------");
        hServ.bubbleSortBintang();
        hServ.tampilAll();

        System.out.println("------------ Data setelah sorting asc berdasarkan harga ------------");
        hServ.selectionSortHarga();
        hServ.tampilAll();

        System.out.println("------------ Data setelah sorting desc berdasarkan bintang ------------");
        hServ.selectionSortBintang();
        hServ.tampilAll();
    }
}
