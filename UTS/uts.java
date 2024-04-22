package UTS;

public class uts {
    utsMain angka[] = new utsMain[5];

    public void mergeSort(int[] angka){
        this.sort(angka, 0, angka.length - 1);
    }

    public void merge(int angka[], int left, int middle, int right){
        int[] temp = new int[angka.length];
        for (int i = left; i <= right; i++){
            temp[i] = angka[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while(a <= middle && b <= right){
            if (temp[a] <= temp[b]) {
                angka[c] = temp[a];
                a++;
            } else {
                angka[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for(int i = 0; i <= s; i++){
            angka[c + i] = temp[a + i];
        }
    }

    public void sort(int angka[], int left, int right){
        if (left < right){
            int middle = (left + right) / 2;
            sort(angka, left, middle);
            sort(angka, middle + 1, right);
            merge(angka, left, middle, right);
        }
    }

    public void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public int FindSeqAngka(int[] angka, int x){
        int posisi = 0;
        for (int i = 0; i < angka.length; i++){
            if(angka[i] == x){
                posisi = i;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int posisi){
        if(posisi != -1){
            System.out.println("Data "+x+ " ditemukan pada indeks "+posisi);
        } else {
            System.out.println("Data "+x+ " tidak ditemukan");
        }
    }

    // public void cariSeqJudul(String cari) {
    //     int count = 0;
    //     for (int j = 0; j < angka.length; j++) {
    //         if (angka[j].judulBuku.equals(cari)) {
    //             count++;
    //             System.out.println("Data : " + cari + " ditemukan pada indeks " + j);
    //             angka[j].tampilDataBuku();

    //         }
    //     }
        
    //     if (count == 0) {
    //         System.out.println("Data : " + cari + " tidak ditemukan");
    //     } else if (count > 1) {
    //         System.out.println("\nHasil yang ditemukan lebih dari satu");
    //     }
    // }
}
