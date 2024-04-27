package Pertemuan8;
import java.util.Scanner;

public class PostfixMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfik08 post = new Postfik08(total);
        P = post.konversi(Q);
        System.out.println("POstfix: " + P);
    }
}
