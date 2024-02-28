package Pertemuan3;

public class LatPrak1_Limas {
    public double panjangSisiAlas;
    public double tinggiLimas;
    public double sisiMiring;

    void hitungSisiMiring(){
        sisiMiring = Math.sqrt((panjangSisiAlas/2 * panjangSisiAlas/2) + (tinggiLimas * tinggiLimas));
    }

    double hitungLuasPermukaanLimas(){
        return (panjangSisiAlas * panjangSisiAlas) + (4 * (sisiMiring * panjangSisiAlas / 2));
    }

    double hitungVolumeLimas(){
        return (panjangSisiAlas * panjangSisiAlas) * tinggiLimas / 3;
    }
}
