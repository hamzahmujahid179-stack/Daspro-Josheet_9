import java.util.Scanner;

public class Tugas2_Kafe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        // 1. Fitur Pencarian Menu (Linear Search)
        System.out.println("--- PENCARIAN MENU KAFE ---");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = input.nextLine();
        boolean ditemukan = false;
        int hargaMenuDitemukan = 0;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                hargaMenuDitemukan = harga[i];
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu \"" + cariMenu + "\" tersedia dengan harga Rp " + hargaMenuDitemukan);
        } else {
            System.out.println("Maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe.");
        }

        // 2. Fitur Pemesanan
        System.out.println("\n--- PEMESANAN MENU ---");
        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananJumlah = new int[jumlahPesanan];
        int[] pesananSubtotal = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String namaPilihan = input.nextLine();

                // Validasi menu apakah ada di daftar
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPilihan)) {
                        pesananNama[i] = menu[j]; // Simpan nama standar dari array menu
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Menu tidak valid atau tidak tersedia! Silakan masukkan ulang.");
                }
            }

            System.out.print("Masukkan jumlah porsi untuk " + pesananNama[i] + ": ");
            pesananJumlah[i] = input.nextInt();
            input.nextLine(); // membersihkan buffer

            // Mencari harga satuan dan menghitung subtotal
            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(pesananNama[i])) {
                    hargaSatuan = harga[j];
                    break;
                }
            }
            pesananSubtotal[i] = hargaSatuan * pesananJumlah[i];
            totalBiaya += pesananSubtotal[i];
        }

        // 3. Menampilkan Daftar Pesanan & Total Biaya
        System.out.println("\n========================================");
        System.out.println("         STRUK PEMESANAN KAFE           ");
        System.out.println("========================================");
        System.out.printf("%-20s | %-5s | %-10s\n", "Nama Menu", "Jml", "Subtotal");
        System.out.println("----------------------------------------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s | %-5d | Rp %-7d\n", pesananNama[i], pesananJumlah[i], pesananSubtotal[i]);
        }
        System.out.println("========================================");
        System.out.println("TOTAL KESELURUHAN       : Rp " + totalBiaya);
        System.out.println("========================================");

        input.close();
    }
}