import java.util.Scanner;

public class PangkatDua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        int hasilPangkatDua = hitungPangkatDua(bilangan);

        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah: " + hasilPangkatDua);
    }

    private static int hitungPangkatDua(int bilangan) {
        int hasil = 1;

        for (int i = 0; i < 2; i++) {
            hasil *= bilangan;
        }

        return hasil;
    }
}
