# Laporan Jobsheet 6
## Searching


Nama    : Diana Rahmawati
NIM     : 2341720162
Kelas   : TI - 1H

### 6.2. Searching / Pencarian Menggunakan Agoritma Sequential Search
#### 6.2.2 Verifikasi Hasil Percobaan

#### 6.2.3 Pertanyaan 
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!
    **Jawab:** Fungsi break digunakan untuk menghenetikan perulangan jika data yang dicari sudah ditemukan.
<br>
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
    **Jawab:** Program masih dapat berjalan, karena pada  sequiential search tidak memperhatikan urutan data. Data akan dicek mulai dari index ke-0 hingga index terakhir, jika terdapat data yang sesuai maka data ditemukan. 
<br>
2. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti gambar berikut 
    **Jawab:**
<br>

### 6.3. Searching / Pencarian Menggunakan Binary Search
#### 6.3.3 Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
    **Jawab:** 
    ```java
    mid = (left+right) / 2; 
    ```
<br>
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
    **Jawab:**

    return FindBinarySearch(cari, left, mid-1); <br>
    return FindBinarySearch(cari, mid + 1, right);
<br>
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? 
    **Jawab:** Tidak bisa, karena pada algoritma binary search terdapat pengecekan data yang akan dicari apakah berada di sebalah kanan atau kiri. Jika data tidak terurut maka pengecekan tersebut akan menghasilkan pilihan yang kurang valid sehingga bisa saja data ada namun pada pencarian menghasilkan data tidak ditemukan.
<br>
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!
    **Jawab:**
<br>

### 6.4. Percobaan Pengayaan Divide and Conquer

#### 6.4.2 Verifikasi Hasil Percobaan

### 6.5 Latihan Praktikum
