package Pertemuan5;

public class MainLatprak {
    public static void main(String[] args) {
        Latprak08[] mobils = {
                new Latprak08("BMW", "M2 Coupe", 2016, 6816, 728),
                new Latprak08("Ford", "Fiesta ST", 2014, 3921, 575),
                new Latprak08("Nissan", "370Z", 2009, 4360, 657),
                new Latprak08("Subaru", "BRZ", 2014, 4058, 609),
                new Latprak08("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Latprak08("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Latprak08("Toyota", "86/GT86", 2014, 4180, 609),
                new Latprak08("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Latprak08 showroom = new Latprak08(mobils);

        // A. Mencari top acceleration tertinggi
        int maxAcceleration = showroom.cariMaxAcceleration();
        System.out.println("Top Acceleration Tertinggi adalah: " + maxAcceleration);

        // B. Mencari top acceleration teredndah
        int minAcceleration = showroom.cariMinAcceleration();
        System.out.println("Top Acceleration Terendah adalah: " + minAcceleration);

        // C. Menghitung rata-rata top power
        double averagePower = showroom.hitungRerataPower();
        System.out.println("Rata-rata Top Power adalah: " + averagePower);
    }
}
