package Pertemuan2;
import java.util.Scanner;

public class DragonMain08 {
    public static void main(String[] args) {
        Dragon08 drgn = new Dragon08(1, 5, 10, 12);

        String langkah;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan langkah dragon (kanan/kiri/atas/bawah) : ");
        langkah = sc.nextLine();

        switch (langkah) {
            case "kanan":
                drgn.moveRight();
                break;
        
            case "kiri":
                drgn.moveLeft();
                break;
        
            case "atas":
                drgn.moveUp();
                break;
        
            case "bawah":
                drgn.moveDown();
                break;
        
            default:
                break;
        }

        drgn.printPosition();
        drgn.detectCollision(0,0);
    }
}
