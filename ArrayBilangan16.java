import java.util.Arrays;

public class ArrayBilangan16 {
    public static void main(String[] args) {
        // 1 & 2. Membuat array bertipe integer dengan kapasitas 4 elemen
        int[] bil = new int[4];

        // 3. Mengisi masing-masing elemen array
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // 4. Menampilkan seluruh isi elemen menggunakan perulangan for
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // 5. Menampilkan isi array menggunakan foreach loop dan Arrays.toString()
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}