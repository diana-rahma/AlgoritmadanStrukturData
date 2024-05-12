package Pertemuan11.Tugas1;

public class SLLMain {
    public static void main(String[] args) {
        SingleLInkedLIst mhs = new SingleLInkedLIst();
        mhs.print();
        mhs.addFirst(112, "Prita");
        mhs.print();
        mhs.addLast(115, "Sari");
        mhs.print();
        mhs.addFirst(111, "Anton");
        mhs.print();
        mhs.insertAfter(112, 113, "Yusuf");
        mhs.print();
        mhs.insertAt(3, 114, "Doni");
        mhs.print();
    }
}
