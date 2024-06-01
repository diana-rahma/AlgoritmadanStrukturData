# JOBSHEET 13 - TREE
## PERTEMUAN 14

Nama : Diana Rahmawati<br>
NIM : 2341720162 <br>
Kelas : TI - 1H

### 13.2 Kegiatan Praktikum 1 - Implementasi Binary Search Tree menggunakan Linked List
<img src="percobaan1.png"><br>

#### 13.2.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?<br>
**Jawab:** Karena Binary Search Tree lebih terstruktur daripada Binary Tree. Dimana Binary Search Tree mengeliminasi setngah node, jadi pencarian dilikakukan pada setengah dari node yang tersisa. <br>
2. Untuk apakah di class **Node**, kegunaan dari atribut **left** dan **right**?<br>
**Jawab:** Attribut left digunakan untuk menunjukkan ke node <br>
3.  a. Untuk apakah kegunaan dari atribut root di dalam class **BinaryTree**?<br>
    b. Ketika objek tree pertama kali dibuat, apakah nilai dari **root**?<br>
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?<br>
5. Perhatikan method **add()**, di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
```java 
if(data<current.data){
    if(current.left!=null){
        current = current.left;
    }else{
        current.left = new Node(data);
    break;
    }
}
```
**Jawab:**


### 13.3 Kegiatan Praktikum 2 - Implementasi binary tree dengan array
<img src="percobaan2.png"><br>

#### 13.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class **BinaryTreeArray**?
2. Apakah kegunaan dari method **populateData()**?
3. Apakah kegunaan dari method **traverseInOrder()**?
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?