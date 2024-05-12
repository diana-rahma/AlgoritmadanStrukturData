package Pertemuan11.Tugas2;

public class LinkedList {
    Node head, tail;

    boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Data Mahasiswa:\t");
            while(tmp != null){
                System.out.print(tmp.data.nim + ", " + tmp.data.nama +"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    // 
    public void addFirst(Mahasiswa input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            // 
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, Mahasiswa input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data.nim == key){
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

    public void insertAt(int index, Mahasiswa input){
        // Node ndInput = new Node(input, null);
        if(index < 0){
            System.out.println("Index salah");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    public Mahasiswa getFirst(){
        if(!isEmpty()){
            return head.data;
        } else {
            return new Mahasiswa();
        }
    }

    public Mahasiswa getLast(){
        if(!isEmpty()){
            return tail.data;
        } else {
            return new Mahasiswa();
        }
    }

    public  Mahasiswa getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {  
            tmp = tmp.next; 
        }
        return tmp.data; 
    }

    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data.nim != key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong tidak dapat dihapus");
        } else if(head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while(temp.next == null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong tidak dapat dihapus");
        } else {
            Node temp = head;
            while (temp != null){
                if(temp.data.nim == key && temp == head){
                    removeFirst();
                    break;
                } else if(temp.next.data.nim == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for(int i = 0; i < index -1; i++ ){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }

    public void clear(){
        head = tail = null;
    }

}
