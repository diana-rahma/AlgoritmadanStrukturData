package Pertemuan10.Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(size == max){
            return true;
        } else {
            return false; 
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Pembeli terdepan: " + antrian[front].nama + ", " + antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli antri){
        if (isFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println("Pembeli paling belakang: " + antrian[i].nama + ", " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println("Pembeli paling belakang: " + antrian[i].nama + ", " + antrian[i].noHp);
            System.out.println("Jumlah elemen = "+ size );
        }
    }

    public void peekRear(){
        if(!isEmpty()){
            System.out.println("Pembeli paling belakang: " + antrian[rear].nama + ", " + antrian[rear].noHp);
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void daftarPembeli(){
            if (isEmpty()){
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while(i != rear){
                    System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHp);
                    i = (i + 1) % max;
                }
                System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHp);
                System.out.println("Jumlah elemen = "+ size );
            }  
    }

    public void peekPosition(String nama){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            if(size == 1){
                System.out.println("Data berada pada posisi ke-0");
            } else {
                int i = front;
                int found = 0;
                while(i != rear){
                    if(antrian[i].nama.equals(nama)){
                        System.out.println("Data berada pada posisi ke-"+ (i+1));
                        found = 1; 
                        break;
                    }
                    i = (i + 1) % max;
                }
                if(found == 0){
                    System.out.println("Posisi tidak ditemukan");
                }
            }
        }
    }
}
