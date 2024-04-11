package Pertemuan2;

import java.util.Scanner;

public class coba2 {
    public static void main(String[] args) {
        coba dragon = new coba(1, 5, 20, 20);

        String langkah;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan langkah dragon (kanan/kiri/atas/bawah) : ");
        langkah = sc.nextLine();

        switch (langkah) {
            case "kanan":
                dragon.moveRight();
                break;
        
            case "kiri":
                dragon.moveLeft();
                break;
        
            case "atas":
                dragon.moveUp();
                break;
        
            case "bawah":
                dragon.moveDown();
                break;
        
            default:
                break;
        }
        // dragon.moveLeft();
        // dragon.moveUp();
        // dragon.moveRight();
        // dragon.moveDown();
        dragon.printPosition();
        dragon.detectCollision(0,0);
    }
}
  