package Pertemuan11.Tugas1;


public class SingleLInkedLIst {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Data Mahasiswa:\t");
            while(tmp != null){
                System.out.print(tmp.nim + ", " + tmp.nama +"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    // 
    public void addFirst(int nim, String nama){
        Node ndInput = new Node(nim, nama, null);
        if(isEmpty()){
            // 
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int nim, String nama){
        Node ndInput = new Node(nim, nama, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int nim, String nama){
        Node ndInput = new Node(nim, nama, null);
        Node temp = head;
        do{
            if(temp.nim == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while(temp != null);
    }

    public void insertAt(int index, int nim, String nama){
        Node ndInput = new Node(nim, nama, null);
        if(index < 0){
            System.out.println("perbaiki logikanya! kalau indeksnya -1 bagaimana??");
        } else if(index == 0) {
            addFirst(nim, nama);
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(nim, nama, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
