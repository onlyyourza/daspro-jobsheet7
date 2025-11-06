import java.util.Scanner;
public class Parking14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        while (true) {
            System.out.println("\n=== Jenis Kendaraan ===");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan (1/2) atau 0 untuk keluar: ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Pilihan tidak valid, coba lagi!");
            }
        }
        System.out.println("\nTotal biaya parkir: Rp " + total);
        sc.close();
    }
}
