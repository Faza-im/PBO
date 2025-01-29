package ZakatTugas;

import java.util.Scanner;

public class ZakatFaza {
    public static void main(String[] args) {
        final double NISAB = 85000000; // Nisab dalam rupiah (85 juta)
        final double ZAKAT_RATE = 0.025; // Persentase zakat 2.5%

        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi Penghitung Zakat Penghasilan");
        System.out.println("======================================");

        try {
            System.out.print("Masukkan total penghasilan tahunan Anda (dalam rupiah): ");
            double penghasilan = input.nextDouble();

            if (penghasilan < 0) {
                System.out.println("Error: Penghasilan tidak boleh berupa angka negatif.");
            } else if (penghasilan >= NISAB) {
                double zakat = hitungZakat(penghasilan, ZAKAT_RATE);
                System.out.printf("Zakat yang harus dibayarkan: Rp %.2f%n", zakat);
            } else {
                System.out.println("Penghasilan Anda di bawah nisab, sehingga tidak wajib membayar zakat.");
            }

        } catch (Exception e) {
            System.out.println("Error: Masukkan angka yang valid untuk penghasilan.");
        } finally {
            input.close();
        }
    }

    public static double hitungZakat(double penghasilan, double zakatRate) {
        return penghasilan * zakatRate;
    }
}

