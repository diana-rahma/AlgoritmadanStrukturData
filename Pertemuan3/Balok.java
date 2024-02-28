package Pertemuan3;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok(int a, int b){

    }

    public Balok(String a, String b){
        
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
