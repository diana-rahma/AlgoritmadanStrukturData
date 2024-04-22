package UTS;

public class pencarianUts {
    uts listBk[] = new uts[5];

    public void cariSeqJudul(String cari) {
        int count = 0;
        for (int j = 0; j < angka.length; j++) {
            if (angka[j].angka.equals(cari)) {
                count++;
                System.out.println("Data : " + cari + " ditemukan pada indeks " + j);
                listBk[j].tampilDataBuku();

            }
        }
        
        if (count == 0) {
            System.out.println("Data : " + cari + " tidak ditemukan");
        } else if (count > 1) {
            System.out.println("\nHasil yang ditemukan lebih dari satu");
        }
    }
}
