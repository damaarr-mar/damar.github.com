package tugas5;

public class tugas5 {
    public static void main(String[] args) {
        String[] karyawan = {"Andi", "Budi", "Citra", "Dina", "Eka"};
        int hari = 1;

        System.out.println("=== Jadwal Shift Karyawan ===");

        
        for (int i = 0; i < karyawan.length; i++) {
            for (int j = i + 1; j < karyawan.length; j++) {
                System.out.println("Hari ke-" + hari + ": " + karyawan[i] + " dan " + karyawan[j]);
                hari++;
            }
        }
    }
}