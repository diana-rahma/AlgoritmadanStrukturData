package Pertemuan1;
import java.util.Scanner;
import java.util.Arrays;

public class coba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array untuk menyimpan data mata kuliah
        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};

        // Deklarasi array untuk menyimpan nilai, SKS, dan IP
        double[][] ip = new double[matkul.length][3];

        // Looping untuk memasukkan nilai dan SKS
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai mata kuliah " + matkul[i] + " : ");
            ip[i][0] = sc.nextDouble();

            System.out.print("Masukkan SKS : ");
            ip[i][1] = sc.nextDouble();

            // Menghitung IP
            ip[i][2] = ip[i][0] * ip[i][1];
        }

        // Menampilkan hasil
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.println("Hasil Konversi Nilai");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Nama Mata Kuliah | Nilai | SKS | IP |");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < ip.length; i++) {
            System.out.printf("| %-15s | %.2f | %.2f | %.2f |\n", matkul[i], ip[i][0], ip[i][1], ip[i][2]);
        }
    }
}

//    public static void main(String[] args) {
//     int[][] rating = {
//         {4,3,4,4},
//         {1,1,2,3},
//         {1,2,3,4}
//     };
//     int i;

    
//             for ( i = 1; i <= 15; i++) {
//                 if (i == 6 || i == 10) {
//                     continue;
//                 } 
//                 if (i % 2 == 0) {
//                     System.out.print(i + " ");
//                 } else {
//                     System.out.print("* ");
//                 }
//             }
//         }
    

    // public static void main(String[] args) {
    //     // Membuat array dua dimensi untuk menyimpan data rating
    //     int[][] rating = {{4, 3, 4, 4}, {1, 1, 2, 3}, {1, 2, 3, 4}};

    //     // Membuat array satu dimensi untuk menyimpan rata-rata rating tiap movie
    //     double[] avgRating = new double[4];

    //     // Memanggil fungsi hitungRataRata untuk mengisi array avgRating
    //     hitungRataRata(rating, avgRating);

    //     // Memanggil fungsi cariMaxMin untuk mencari movie dengan rating tertinggi dan terendah
    //     int[] maxMin = cariMaxMin(avgRating);

    //     // Mencetak hasil
    //     System.out.println("Rata-rata rating tiap movie:");
    //     System.out.println(Arrays.toString(avgRating));
    //     System.out.println("Movie dengan rating tertinggi: " + maxMin[0]);
    //     System.out.println("Movie dengan rating terendah: " + maxMin[1]);

        
    // }

    // // Fungsi untuk menghitung rata-rata rating tiap movie
    // public static void hitungRataRata(int[][] rating, double[] avgRating) {
    //     // Menggunakan loop for untuk mengakses tiap kolom (movie)
    //     for (int i = 0; i < rating[0].length; i++) {
    //         // Menginisialisasi variabel total dengan 0
    //         int total = 0;
    //         // Menggunakan loop for untuk mengakses tiap baris (penonton)
    //         for (int j = 0; j < rating.length; j++) {
    //             // Menambahkan nilai rating ke total
    //             total += rating[j][i];
    //         }
    //         // Menghitung rata-rata rating dengan membagi total dengan jumlah penonton
    //         avgRating[i] = (double) total / rating.length;
    //     }
    // }

    // // Fungsi untuk mencari movie dengan rating tertinggi dan terendah
    // public static int[] cariMaxMin(double[] avgRating) {
    //     // Menginisialisasi variabel max dan min dengan nilai pertama dari array avgRating
    //     double max = avgRating[0];
    //     double min = avgRating[0];
    //     // Menginisialisasi variabel maxIndex dan minIndex dengan 0
    //     int maxIndex = 0;
    //     int minIndex = 0;
    //     // Menggunakan loop for untuk mengakses tiap elemen dari array avgRating
    //     for (int i = 0; i < avgRating.length; i++) {
    //         // Jika elemen saat ini lebih besar dari max, maka update max dan maxIndex
    //         if (avgRating[i] > max) {
    //             max = avgRating[i];
    //             maxIndex = i;
    //         }
    //         // Jika elemen saat ini lebih kecil dari min, maka update min dan minIndex
    //         if (avgRating[i] < min) {
    //             min = avgRating[i];
    //             minIndex = i;
    //         }
    //     }
    //     // Mengembalikan array yang berisi maxIndex dan minIndex
    //     return new int[]{maxIndex, minIndex};

    // }




    

    
    //    static int[][] stock = {
    //         {10, 5, 15, 7}, // RoyalGarden 1
    //         {6, 11, 9, 12}, // RoyalGarden 2
    //         {2, 10, 10, 5}, // RoyalGarden 3
    //         {5, 7, 12, 9}, // RoyalGarden 4
    //     };
    //     static String[] nama = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    //     static int[] harga = {75000, 50000, 60000, 10000};
    //     static int[] stockMati = {-1, -2, 0, -5};

    
    //     public static void main(String[] args) {
    //         pendapatan();
    //         stockCabang();
    //         bungaMati();
    //     }

    //     static void pendapatan(){
    //         int totalPendapatan = 0;
    //         for (int i = 0; i < stock.length; i++) {
    //             int pendapatanCabang = 0;
    //             for (int j = 0; j < stock[i].length; j++) {
    //                 pendapatanCabang += stock[i][j] * harga[j];
    //             }
    //             totalPendapatan += pendapatanCabang;
    //             System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + pendapatanCabang);
    //         }
    //         System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    //     }

    //     static void stockCabang() {
    //         for (int i = 0; i < stock.length; i++) {
    //             int totalStock = 0;
    //             for (int j = 0; j <stock.length; j++) {
    //                 totalStock += stock[j][i];
    //             }
    //             System.out.println("Stock " + nama[i] + ": " + totalStock); // ganti stock[i] dengan nama[i]
    //         }
    //     }

    //     static void bungaMati() {
    //         for (int i = 0; i < nama.length; i++) {
    //             int totalStock = 0;
    //             for (int j = 0; j < stock.length; j++) {
    //                 int stockSisa = stock[j][i] - stockMati[i]; // buat variabel lokal stockSisa
    //                 totalStock += stockSisa; // tambahkan stockSisa ke totalStock
    //                 System.out.println("Stock " + nama[i] + ": " + stockSisa); // cetak stockSisa sebagai output
    //             }
    //             System.out.println("Total Stock " + nama[i] + ": " + totalStock); // cetak totalStock sebagai output
    //         }
    //     }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     // Deklarasi array untuk menyimpan data input
    //     String[][] dataInput = new String[10][3];
        
    //     // Deklarasi array untuk menyimpan nilai setara
    //     double[] nilaiSetara = {4.0, 3.75, 3.5, 3.0, 2.75, 2.5, 2.0, 1.0, 0.0};

    //     // Masukkan data input
    //     for (int i = 0; i < dataInput.length; i++) {
    //         System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
    //         dataInput[i][0] = scanner.nextLine();

    //         System.out.print("Masukkan Bobot SKS untuk matakuliah " + dataInput[i][0] + ": ");
    //         dataInput[i][1] = scanner.nextLine();

    //         System.out.print("Masukkan nilai huruf untuk matakuliah " + dataInput[i][0] + ": ");
    //         dataInput[i][2] = scanner.nextLine();
    //     }

    //     // Hitung IP semester
    //     double ipSemester = 0.0;
    //     int totalSks = 0;
    //     for (int i = 0; i < dataInput.length; i++) {
    //         // Cari nilai setara
    //         int indexNilaiSetara = -1;
    //         for (int j = 0; j < nilaiSetara.length; j++) {
    //             if (dataInput[i][2].equalsIgnoreCase(Character.toString((char) ('A' + j)))) {
    //                 indexNilaiSetara = j;
    //                 break;
    //             }
    //         }

    //         // Hitung nilai IP untuk setiap mata kuliah
    //         double nilaiIP = nilaiSetara[indexNilaiSetara] * Integer.parseInt(dataInput[i][1]);

    //         // Tambahkan nilai IP ke total IP
    //         ipSemester += nilaiIP;

    //         // Hitung total SKS
    //         totalSks += Integer.parseInt(dataInput[i][1]);
    //     }

    //     // Tampilkan tabel
    //     System.out.println("| Nama Mata Kuliah | Bobot SKS | Nilai Huruf | Nilai Setara |");
    //     System.out.println("|---|---|---|---|");
    //     for (int i = 0; i < dataInput.length; i++) {
    //         System.out.printf("| %-15s | %-10s | %-10s | %-12s |\n", dataInput[i][0], dataInput[i][1], dataInput[i][2], nilaiSetara[i]);
    //     }

    //     // Hitung IP semester
    //     ipSemester /= totalSks;

    //     // Tampilkan hasil
    //     System.out.println("IP Semester: " + ipSemester);
    // }
