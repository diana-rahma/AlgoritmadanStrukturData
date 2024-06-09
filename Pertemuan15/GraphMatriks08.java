public class GraphMatriks08 {
    int vertex;
    int[][] matriks;

    public GraphMatriks08(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph(){
        for(int i = 0; i < vertex; i++){
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for(int j = 0; j < vertex; j++){
                if(matriks[i][j] != -1){
                    System.out.print("Gedung "+ (char) ('A'+j) + " (" + matriks[i][j] + "m),");
                }
            }
            System.out.println("");
        }
    }

    public int outDegree(int v) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int inDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public void printDegrees() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": inDegree = " + inDegree(i) + ", outDegree = " + outDegree(i));
        }
    }
}
