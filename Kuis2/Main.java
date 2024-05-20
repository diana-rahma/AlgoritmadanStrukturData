package Kuis2;
import java.util.Scanner;

class Node {
    Team data;
    Node prev, next;

    public Node(Team data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class DLL {
    Node head;
    int size;

    public DLL(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addTeam(Team item){
        Node newNode = new Node(item);
        if(isEmpty()){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void updatePoints(Team team, int points) {
        Node current = head;
        while (current != null) {
            if (current.data.getTeam().equals(team.getTeam())) {
                current.data.addPoints(points);
                return;
            }
            current = current.next;
        }
    }

    public void addPoints(Team team, int points, boolean win) {
        Node node = cariNode(team);
        if (node != null) {
            node.data.addPoints(points);
            if (win) {
                node.data.addWin();
            } else {
                node.data.addLose();
            }
        }
    }
    
    private Node cariNode(Team team) {
        Node current = head;
        while (current != null) {
            if (current.data.getTeam().equals(team.getTeam())) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while(tmp != null){
                System.out.print("Team: "+tmp.data.team + ", "+ tmp.data.win +", "+tmp.data.lose + "\n");
                tmp = tmp.next;
            }
            // System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void printHasilPertandingan(int[][] results) {
        if (!isEmpty()) {
            for (int i = 0; i < results.length; i++) {
                System.out.println(getPertandingan(i + 1) + ": " + results[i][0] + " - " + results[i][1]);
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    // public void printKlasemen() {
    //     if (!isEmpty()) {
    //         Node current = head;
    //         System.out.println("Klasemen:");
    //         while (current != null) {
    //             System.out.println("| "+ current.data.team + current.data.win + current.data.lose + " |");
    //             current = current.next;
    //         }
    //     } else {
    //         System.out.println("Klasemen kosong");
    //     }
    // }

    class Poin {
        public static final int MENANG = 3;
        public static final int MENANG_OT = 2;
        public static final int KALAH = 0;
    }

    public static String getPertandingan(int matchId){
        switch (matchId) {
            case 1:
                return "Bali United Basketball vs Amartha Hangtuah Jakarta";
            case 2:
                return "Pacific Caesar Surabaya vs Rajawali Medan";
            case 3:
                return "Satria Muda Pertamina Jakarta vs Borneo Hornbills";
            case 4:
                return "Pelita Jaya Jakarta vs Satya Wacana Salatiga";
            case 5:
                return "Bali United Basketball vs Bima Perkasa Jogja";
            case 6:
                return "Pacific Caesar Surabaya vs Tangerang Hawks Basketball Club";
            case 7:
                return "Satria Muda Pertamina Jakarta vs Dewa United Banten";
            case 8:
                return "Prawira Harum Bandung vs Kesatria Bengawan Solo";
            case 9:
                return "Satya Wacana Salatiga vs Rajawali Medan";
            case 10:
                return "Pelita Jaya Jakarta vs Tangerang Hawks Basketball Club";
            case 11:
                return "Bima Perkasa Jogja vs Dewa United Banten";
            case 12:
                return "RANS Simba Bogor vs Bali United Basketball";
            case 13:
                return "Borneo Hornbills vs Tangerang Hawks Basketball Club";
            case 14:
                return "Pelita Jaya Jakarta vs Satria Muda Pertamina Jakarta";
            case 15:
                return "Satya Wacana Salatiga vs Amartha Hangtuah Jakarta";
            default:
                return "Pertandingan tidak diketahui";
        }
    }
}

class Team {
    String team;
    int points, win, lose;

    public Team(String team){
        this.team = team;
        this.points = 0;
        this.win = 0;
        this.lose = 0;
    }

    public String getTeam(){
        return team;
    }

    public int getPoints(){
        return points;
    }

    public void addPoints(int points){
        this.points += points;
    }

    public int getWin(){
        return win;
    }

    public void addWin(){
        this.win++;
    }

    public int getLose(){
        return lose;
    }

    public void addLose(){
        this.lose++;
    }

    @Override
    public String toString() {
        return "Team: " + team + ", Points: " + points + ", Wins: " + win + ", Losses: " + lose;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL klasemen = new DLL();

        Team[] teams = {
            new Team("Pelita Jaya Jakarta"),
            new Team("Dewa United Banten"),
            new Team("Kesatria Bengawan Solo"),
            new Team("Bali United Basketball"),
            new Team("Rajawali Medan"),
            new Team("Prawira Harum Bandung"),
            new Team("RANS Simba Bogor"),
            new Team("Satria Muda Pertamina Jakarta"),
            new Team("Borneo Hornbills"),
            new Team("Amartha Hangtuah Jakarta"),
            new Team("Satya Wacana Salatiga"),
            new Team("Bima Perkasa Jogja"),
            new Team("Tangerang Hawks Basketball Club"),
            new Team("Pacific Caesar Surabaya")
        };

        for (Team team : teams) {
            klasemen.addTeam(team);
        }

        int[][] hasilPertandingan = {
            {90, 80},
            {94, 83},
            {93, 84},
            {78, 74},
            {80, 85},
            {88, 92},
            {77, 90},
            {66, 80},
            {70, 60},
            {82, 88},
            {90, 75},
            {79, 85},
            {81, 77},
            {76, 92},
            {85, 70}
        };

        boolean exit = false;
        while (!exit) {
            System.out.println("------------------------------------");
            System.out.println("| Liga Bola Basket Indonesia - IBL |");
            System.out.println("------------------------------------");
            System.out.println("|        PILIH MENU BERIKUT        |");
            System.out.println("------------------------------------");
            System.out.println("| 1. Input Hasil Tiap Pertandingan |");
            System.out.println("| 2. Cetak Hasil Pertandingan      |");
            System.out.println("| 3. Cetak Klasemen                |");
            System.out.println("| 4. Keluar                        |");                    
            System.out.println("------------------------------------");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor match (1-15): ");
                    int nomorMatch = sc.nextInt();
                    sc.nextLine();
                    String match = DLL.getPertandingan(nomorMatch);
                    if ("Pertandingan tidak diketahui".equals(match)) {
                        System.out.println("Nomor match tidak valid.");
                        break;
                    }
                    System.out.println("Match: " + match);

                    System.out.print("Masukkan nama tim pemenang: ");
                    String winnerName = sc.nextLine();
                    Team winner = getNamaTeam(teams, winnerName);

                    System.out.print("Apakah pertandingan ini overtime? (y/n): ");
                    String overtimeInput = sc.nextLine();
                    boolean isOvertime = overtimeInput.equalsIgnoreCase("y");

                    int points = isOvertime ? DLL.Poin.MENANG_OT : DLL.Poin.MENANG;
                    if (winner != null) {
                        klasemen.addPoints(winner, points, true);
                        String loserName = getLoserName(match, winnerName);
                        Team loser = getNamaTeam(teams, loserName);
                        klasemen.addPoints(loser, DLL.Poin.KALAH, false);
                        System.out.println("Poin match: " + match + " sudah ditambahkan.");
                    } else {
                        System.out.println("Nama tim pemenang tidak valid.");
                    }
                    break;
                case 2:
                    klasemen.printHasilPertandingan(hasilPertandingan);
                    
                    break;
                case 3:
                    klasemen.print();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static Team getNamaTeam(Team[] teams, String name) {
        for (Team team : teams) {
            if (team.getTeam().equalsIgnoreCase(name)) {
                return team;
            }
        }
        return null;
    }

    public static String getLoserName(String match, String winnerName) {
        String[] teamsInMatch = match.split(" vs ");
        return teamsInMatch[0].equalsIgnoreCase(winnerName) ? teamsInMatch[1] : teamsInMatch[0];
    }
}

