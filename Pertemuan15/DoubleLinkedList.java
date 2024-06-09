public class DoubleLinkedList {
    Node08 head;
    int size;

    public DoubleLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if(isEmpty()){
            head = new Node08(null, item, jarak, null);
        } else {
            Node08 newNode = new Node08(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void remove(int index) {
        Node08 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int getJarak(int index) throws Exception{
        if(isEmpty() || index < 0 || index >= size){
            throw new Exception("Nilai index di luar batas");
        } 
        Node08 tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public int get(int index) throws Exception {
        if (index > size || index < 0) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node08 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }



    // Node08 head;
    // int size;

    // public DoubleLinkedList(){
    //     head = null;
    //     size = 0;
    // }

    // public boolean isEmpty(){
    //     return head == null;
    // }

    // public void addFirst(int item, int jarak){
    //     if(isEmpty()){
    //         head = new Node08(null, item, jarak, null);
    //     } else {
    //         Node08 newNode = new Node08(null, item, jarak, head);
    //         head.prev = newNode;
    //         head = newNode;
    //     }
    //     size++;
    // }

    // public int size(){
    //     return size;
    // }

    // public void clear(){
    //     head = null;
    //     size = 0;
    // }

    // public void remove(int index) throws Exception {
    //     Node08 current = head;
    //     while (current != null) {
    //         if (current.data == index) {
    //             if (current.prev != null) {
    //                 current.prev.next = current.next;
    //             } else {
    //                 head = current.next;
    //             }
    //             if (current.next != null) {
    //                 current.next.prev = current.prev;
    //             }
    //             break;
    //         }
    //         current = current.next;
    //     }
    //     size--;
    // }

    // public int getJarak(int index) throws Exception {
    //     if (isEmpty() || index < 0 || index >= size) {
    //         throw new Exception("Nilai index di luar batas");
    //     }
    //     Node08 tmp = head;
    //     for (int i = 0; i < index; i++) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.jarak;
    // }

    // public int get(int index) throws Exception {
    //     if (isEmpty() || index < 0 || index >= size) {
    //         throw new Exception("Linked List kosong atau indeks di luar batas");
    //     }
    //     Node08 tmp = head;
    //     for (int i = 0; i < index; i++) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.data;
    // }
}
