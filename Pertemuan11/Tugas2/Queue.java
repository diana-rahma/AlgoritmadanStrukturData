package Pertemuan11.Tugas2;

public class Queue {
    LinkedList antrian;
    Node front, rear;
    int size;

    Queue(){
        antrian = new LinkedList();
        front = antrian.head;
        rear = antrian.tail;
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        return antrian.isEmpty();
    }

    public void peek(){
        Mahasiswa mhs = antrian.getFirst();
        if(!isEmpty()){
            System.out.println("Mahasiswa terdepan: " + mhs.nim + ", " + mhs.nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        Mahasiswa mhs = antrian.getLast();
        if(!isEmpty()){
            System.out.println("Pembeli paling belakang: " + mhs.nim + ", " + mhs.nama);
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa dt){
        antrian.addLast(dt);
        front = antrian.head;
        rear = antrian.tail;
        size++;
    }

    public Mahasiswa Dequeue(){
        Mahasiswa dt = new Mahasiswa();
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian.getFirst();
        }
        return dt;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            antrian.print();
            System.out.println("Jumlah elemen : "+ size);
        }
    }

    public void printMhs(int idx){
            if (isEmpty()){
                System.out.println("Queue masih kosong");
            } else {
                if((idx-1) < 0){
                    System.out.println("Data masih kosong");
                } else {
                    Mahasiswa mhs = antrian.getData(idx-1);
                    System.out.println(mhs.nim + ", " + mhs.nama + ", ");
                }
            }  
    }

    public void peekPosition(int dt){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int index = antrian.indexOf(dt);
            System.out.println("Data berada pada posisi ke-" +  (index));  
        }
    }

    public void clear(){
        antrian.clear();
    }
}
