package Tugas1;

import java.util.Scanner;

public class tugas1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasBawah, batasAtas;

        System.out.print("Masukkan batas bawah: ");
        batasBawah = input.nextInt();
        
        System.out.print("Masukkan batas atas: ");
        batasAtas = input.nextInt();

        int a = 0, b = 1, c;

        System.out.println("Deret Fibonacci dari " + batasBawah + " sampai " + batasAtas + ":");
        while (a <= batasAtas) {
            if (a >= batasBawah) {
                System.out.print(a + " ");
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}
       

