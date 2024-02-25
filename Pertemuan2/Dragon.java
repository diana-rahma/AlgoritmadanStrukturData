package Pertemuan2;
import java.util.Scanner;

public class Dragon {
    int x, y, width, height;

    public Dragon() {

    }
    Dragon(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        x -=1 ;
        detectCollision(x, y);
        // if(x < 0 || x > width){
        //     detectCollision(x, y);
        // }
    }

    void moveRight(){
        x += 1;
        detectCollision(x, y);
        // if(x < 0 || x > width){
        //     detectCollision(x, y);
        // }
    }

    void moveUp(){
        y -= 1;
        detectCollision(x, y);
        // if(y < 0 || y > height){
        //     detectCollision(x, y);
        // }
    }

    void moveDown(){
        y += 1;
        detectCollision(x, y);
        // if(y < 0 || y > height){
        //     detectCollision(x, y);
        // }
    }

    void printPosition() {
        System.out.println("Posisi dragon: (" + x + ", " + y + ")");
    }

    void detectCollision(int x, int y) {
        if ( x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over!");
        }
    }

}
