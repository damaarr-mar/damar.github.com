package Tugas2;

import java.util.Scanner;

public class tugas2 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Cetak bilangan genap dari 1 sampai N");
            System.out.println("2. Hitung jumlah angka dari 1 sampai N");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai N: ");
                    int n1 = input.nextInt();
                    System.out.println("Bilangan genap dari 1 sampai " + n1 + ":");
                    for (int i = 1; i <= n1; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("Masukkan nilai N: ");
                    int n2 = input.nextInt();
                    int jumlah = 0;
                    for (int i = 1; i <= n2; i++) {
                        jumlah += i;
                    }
                    System.out.println("Jumlah angka dari 1 sampai " + n2 + " adalah: " + jumlah);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.\n");
            }

        } while (pilihan != 3);

    }
}

