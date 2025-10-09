package Tugas1;

public class tugas1A {
     public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.println("Deret Fibonacci sampai 100:");

        System.out.print(a + " " + b + " ");

        c = a + b;
        while (c <= 100) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}

