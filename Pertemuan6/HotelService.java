package Pertemuan6;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambahHotel(Hotel h){
        if(idx < rooms.length){
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll(){
        for(Hotel htl : rooms){
            System.out.println("Nama: " + htl.nama);
            System.out.println("Kota: " + htl.kota);
            System.out.println("Harga: " + htl.harga);
            System.out.println("Bintang: " + htl.bintang);
            System.out.println("------------------------------");
        }
    }

    void bubbleSortHarga(){
        for(int i = 0; i < idx-1; i++){
            for(int j = 0; j < idx -i-1; j++){
                if(rooms[j].harga > rooms[j + 1].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = tmp; 
                }
            }
        }
    }

    void bubbleSortBintang(){
        for(int i = 0; i < rooms.length-1; i++){
            for(int j = 1; j < rooms.length-i; i++){
                if(rooms[j].bintang > rooms[j - 1].bintang){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j+1] = tmp;
                }
            }
        }
    }
    
    void selectionSortHarga(){
        for(int i = 0; i < rooms.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < rooms.length; j++){
                if(rooms[j].harga < rooms[idxMin].harga){
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }

    void selectionSortBintang(){
        for(int i = 0; i < rooms.length-1; i++){
            int idxMax = i;
            for(int j = i + 1; j < rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMax].bintang){
                    idxMax = j;
                }
            }
            Hotel temp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}
