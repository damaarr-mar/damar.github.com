package tugas3;

import java.util.Scanner;

public class tugas3 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kapasitasMaks = 10;
        int jumlahPasien, pasienDilayani = 0;

        System.out.print("Masukkan jumlah pasien yang datang: ");
        jumlahPasien = input.nextInt();

        for (int i = 1; i <= jumlahPasien; i++) {
            if ((i - pasienDilayani) > kapasitasMaks) {
                pasienDilayani++;
                System.out.println("Antrian penuh! Melayani pasien nomor " + pasienDilayani);
            }

            System.out.println("Pasien nomor " + i + " masuk ke antrian. Total antrean sekarang: " + (i - pasienDilayani));
        }

        System.out.println("\n=== Pasien yang masih dalam antrian ===");
        int pasienTerakhir = jumlahPasien;
        int antreanAwal = pasienDilayani + 1;

        for (int j = antreanAwal; j <= pasienTerakhir; j++) {
            System.out.print(j + " ");
        }

    }
}
