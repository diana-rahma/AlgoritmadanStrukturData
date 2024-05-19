package Pertemuan12.Tugas1;

public class DLLQueue {
    Node head, tail;
    int size;

    public DLLQueue(){
        head = null;
        size = 1;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(int nomor, String nama){
        Node newNode = new Node(head, nomor, nama, head);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
        while(current.next != null){
            current = current.next;
        }
        newNode = new Node(current, nomor, nama, null);
        current.next = newNode;
        size++;
        }
    }

    public void dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else {
            Node tmp = head;
            head = head.next;
            if(head != null){
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println(tmp.nama + " telah selesai divaksinasi");
        }
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.printf("| %-5s | %-5s |\n", "No.", "Nama");
            while(tmp != null){
                System.out.printf("| %-5s | %-5s |\n", tmp.nomor , tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian: "+ size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
