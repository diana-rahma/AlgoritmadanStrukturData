package Pertemuan14;

public class BinaryTreeArrayMain08 {
    public static void main(String[] args) {
        BinaryTreeArray08 bta = new BinaryTreeArray08();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateDate(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.print("\n");
    }
}
