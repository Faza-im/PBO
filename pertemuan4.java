package pemro;

import java.util.Scanner;

public class pertemuan4 {

    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Mendefinisikan nisab zakat (misalnya 85 gram emas * Rp 1.000.000 = Rp 85.000.000)
        double nisabZakat = 8500000;
        char pilihan;
        
        System.out.println("Kalkulator Zakat");
        System.out.println("Nisab zakat saat ini adalah: Rp " + nisabZakat);
        System.out.println("--------------------------------------------");
        
        do {
            
            // Meminta pengguna memasukkan jumlah kekayaan (uang) dalam bentuk desimal
            System.out.print("Masukkan jumlah kekayaan Anda (dalam Rupiah): ");
            double totalKekayaan = input.nextDouble();

            // Cek apakah total kekayaan memenuhi nisab zakat
            if (totalKekayaan >= nisabZakat) {
                // Menghitung zakat sebesar 2.5%
                double jumlahZakat = totalKekayaan * 2.5 / 100;
                System.out.println("Jumlah zakat yang harus dibayarkan: Rp " + String.format("%,.2f", jumlahZakat));
            } else {
                System.out.println("Kekayaan Anda belum memenuhi nisab zakat yang sebesar Rp " + nisabZakat);
            }
            
            // Meminta pengguna apakah ingin menghitung zakat lagi
            do {
                System.out.print("Apakah Anda ingin menghitung zakat lagi? (y/n): ");
                pilihan = input.next().charAt(0);
                
                // Validasi input untuk pilihan
                if (pilihan != 'y' && pilihan != 'Y' && pilihan != 'n' && pilihan != 'N') {
                    System.out.println("Pilihan tidak valid. Masukkan 'y' atau 'n'.");
                }
            } while (pilihan != 'y' && pilihan != 'Y' && pilihan != 'n' && pilihan != 'N');
            
        } while (pilihan == 'y' || pilihan == 'Y');
        
        System.out.println("Terima kasih telah menggunakan kalkulator zakat.");
    }
}
