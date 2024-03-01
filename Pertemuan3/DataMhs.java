package Pertemuan3;

public class DataMhs {
    public String nama;
    public int nim;
    public String gender;
    public float ipk;

    float hitungRataIPK(DataMhs[] mhs, int n) {
        float totalIPK = 0;
        for (int j = 1; j < n; j++) {
            totalIPK += mhs[j].ipk;
        }
        return totalIPK / (n - 1);
    }

    float cariMhsIpkTertinggi(DataMhs[] mhs, int n) {
        float ipkTertinggi = mhs[1].ipk;
        for (int j = 1; j < n; j++) {
            if (mhs[j].ipk > ipkTertinggi) {
                ipkTertinggi = mhs[j].ipk;
            }
        }
        return ipkTertinggi;
    }
}
