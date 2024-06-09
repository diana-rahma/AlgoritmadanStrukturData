import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) throws Exception {
        Graph08 gedung = new percobaan1().new Graph08(6);
        Scanner sc = new Scanner(System.in);

        // peercobaan 1
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal: ");
        int asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc.nextInt();
        int pathExists = gedung.cekPath(asal, tujuan);
        System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + (pathExists == 1 ? " bertetangga" : " tidak bertetangga"));
        
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        
    // int pilih;
    
    // do{
    //     menu();
    //     pilih = sc.nextInt();
    //     switch (pilih) {
    //         case 1:
    //             System.out.println("Masukkan gedung asal: ");
    //             int asal = sc.nextInt();
    //             System.out.println("Masukkan gedung tujuan: ");
    //             int tujuan = sc.nextInt();
    //             System.out.println("Masukkan jarak: ");
    //             int jarak = sc.nextInt();
    //             gedung.addEdge(asal, tujuan, jarak);
    //             break;
            
    //         case 2:
    //             System.out.println("Masukkan gedung asal: ");
    //             asal = sc.nextInt();
    //             System.out.println("Masukkan gedung tujuan: ");
    //             tujuan = sc.nextInt();
    //             gedung.removeEdge(asal, tujuan);
    //             break;

    //         case 3:
    //             System.out.println("Masukkan gedung yang akan dicek degree-nya: ");
    //             asal = sc.nextInt();
    //             gedung.degree(asal);
    //             break;
            
    //         case 4:
    //             gedung.printGraph();
    //             break;

    //         case 5:
    //             System.out.println("Masukkan gedung asal: ");
    //             asal = sc.nextInt();
    //             System.out.println("Masukkan gedung tujuan: ");
    //             tujuan = sc.nextInt();
    //             boolean exists = gedung.cekEdge(asal, tujuan);
    //             System.out.println("Edge dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan) + (exists ? " ada." : " tidak ada."));
    //             break;

    //         case 6:
    //             System.out.println("Masukkan gedung asal: ");
    //             asal = sc.nextInt();
    //             System.out.println("Masukkan gedung tujuan: ");
    //             tujuan = sc.nextInt();
    //             System.out.println("Masukkan jarak baru: ");
    //             jarak = sc.nextInt();
    //             gedung.updateJarak(asal, tujuan, jarak);
    //             break;

    //         case 7:
    //             int edgeCount = gedung.hitungEdge();
    //             System.out.println("Jumlah edge dalam graf: " + edgeCount);
    //             break;

    //         default:
                
    //             break;
    //     }
    // } while (pilih == 1 ||pilih == 2 ||pilih == 3 ||pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

    public static void menu() {
        System.out.println("-------------------------");
        System.out.println("| Pilih Menu Dibawah ini |");
        System.out.println("-------------------------");
        System.out.println("| 1. Add Edge            |");
        System.out.println("| 2. Remove Edge         |");
        System.out.println("| 3. Degree              |");
        System.out.println("| 4. Print Graph         |");
        System.out.println("| 5. Cek Edge            |");
        System.out.println("| 6. Update Jarak        |");
        System.out.println("| 7. Hitung Edge         |");
        System.out.println("| 8. Keluar              |");
        System.out.println("-------------------------");
    }

    class Node08 {
        int data;
        int jarak;
        Node08 prev, next;
    
        public Node08(Node08 prev, int data, int jarak, Node08 next) {
            this.prev = prev;
            this.data = data;
            this.jarak = jarak;
            this.next = next;
        }
    }
    
    class DoubleLinkedList {
        Node08 head;
        int size;
    
        public DoubleLinkedList() {
            head = null;
            size = 0;
        }
    
        public boolean isEmpty() {
            return head == null;
        }
    
        public void addFirst(int item, int jarak) {
            if (isEmpty()) {
                head = new Node08(null, item, jarak, null);
            } else {
                Node08 newNode = new Node08(null, item, jarak, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }
    
        public int size() {
            return size;
        }
    
        public void clear() {
            head = null;
            size = 0;
        }
    
        public void remove(int item) {
            Node08 current = head;
            while (current != null) {
                if (current.data == item) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    size--;
                    return;
                }
                current = current.next;
            }
        }
    
        public int getJarak(int index) throws Exception {
            if (isEmpty() || index < 0 || index >= size) {
                throw new Exception("Nilai index di luar batas");
            }
            Node08 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.jarak;
        }
    
        public int get(int index) throws Exception {
            if (isEmpty() || index < 0 || index >= size) {
                throw new Exception("Nilai index di luar batas");
            }
            Node08 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }

        public void updateJarak(int item, int newJarak) {
            Node08 current = head;
            while (current != null) {
                if (current.data == item) {
                    current.jarak = newJarak;
                    return;
                }
                current = current.next;
            }
        }
    }
    
    class Graph08 {
        int vertex;
        DoubleLinkedList[] list;
    
        public Graph08(int v) {
            vertex = v;
            list = new DoubleLinkedList[v];
            for (int i = 0; i < v; i++) {
                list[i] = new DoubleLinkedList();
            }
        }
    
        public void addEdge(int asal, int tujuan, int jarak) {
            list[asal].addFirst(tujuan, jarak);
            // Apabila graf yang dibuat adalah undirected graph, maka tambahkan kode berikut.
            // list[tujuan].addFirst(asal, jarak);
        }
    
        public void degree(int asal) throws Exception {
            int totalIn = 0, totalOut = 0;
    
            // inDegree
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        ++totalIn;
                    }
                }
            }
    
            // outDegree
            totalOut = list[asal].size();
    
            System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
            System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
            System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        }
    
        public void removeEdge(int asal, int tujuan) {
            list[asal].remove(tujuan);
        }
    
        public void removeAllEdge() {
            for (int i = 0; i < vertex; i++) {
                list[i].clear();
            }
        }
    
        public void printGraph() throws Exception {
            for (int i = 0; i < vertex; i++) {
                if (list[i].size() > 0) {
                    System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                    }
                    System.out.println("");
                }
            }
            System.out.println("");
        }

        public int cekPath(int asal, int tujuan) {
            Node08 current = list[asal].head;
            while (current != null) {
                if (current.data == tujuan) {
                    return 1;
                }
                current = current.next;
            }
            return 0;
        }

        public boolean cekEdge(int asal, int tujuan) {
            Node08 current = list[asal].head;
            while (current != null) {
                if (current.data == tujuan) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // tugas 2
        public void updateJarak(int asal, int tujuan, int newJarak) {
            Node08 current = list[asal].head;
            while (current != null) {
                if (current.data == tujuan) {
                    current.jarak = newJarak;
                    return;
                }
                current = current.next;
            }
            System.out.println("Edge tidak ditemukan.");
        }

        // tugas 3
        public int hitungEdge() {
            int edgeCount = 0;
            for (int i = 0; i < vertex; i++) {
                edgeCount += list[i].size();
            }
            return edgeCount;
        }
    }
}
