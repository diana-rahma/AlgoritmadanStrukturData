package Pertemuan1;
import java.util.Scanner;

public class perulangan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nim : ");
        long nim = input.nextLong();
        
        long n = nim % 100;
        if (n < 10) {
            n += 10;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
               continue;
            } 
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
           
            
        }
    }
}


