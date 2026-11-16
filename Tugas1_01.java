import java.util.Scanner;

public class Tugas1_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = input.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;

        // Input nilai
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i]; // Akumulasi total
        }

        // Perhitungan rata-rata, tertinggi, dan terendah
        double rataRata = (double) total / jumlah;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        // Menampilkan hasil rekap
        System.out.println("\n--- REKAP NILAI MAHASISWA ---");
        System.out.println("Nilai Rata-rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);

        System.out.println("\nDaftar Status Kelulusan:");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " (Nilai: " + nilaiMhs[i] + ") -> " + status);
        }

        input.close();
    }
}