package Pertemuan5;

public class Faktorial08 {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        
        return fakto;
    }

    // Selain menggunakan for (pertanyaan no. 2)
    // public int faktorialBF(int n) {
    //     int fakto = 1;
    //     int i = 1;
    //     while(i <= n){
    //         fakto = fakto * i;
    //         i++;
    //     }
    //     return fakto;
    // }
    // public int faktorialBF(int n) {
    //     int fakto = 1;
    //     int i = 1;
    //     do{
    //         fakto = fakto * i;
    //         i++;
    //     }while (i <= n); 
    //     return fakto;
    // }
    
    
    public int faktorialDC(int n) {
        if(n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
