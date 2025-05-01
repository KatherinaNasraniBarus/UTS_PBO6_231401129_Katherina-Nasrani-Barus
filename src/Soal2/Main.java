package Soal2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        boolean lanjut = true;

        System.out.println("========= Selamat Datang di ParkingChan =========");
        while (lanjut) {
            System.out.print("Masukkan jenis kendaraan (Motor/Mobil/Truk) : ");
            String jenis = input.nextLine();

            Kendaraan kendaraan = new Kendaraan(jenis);
            System.out.print("Pilih metode input durasi parkir (Langsung/Jam) : ");
            String metode = input.nextLine();

            double biaya = 0;

            if (metode.equalsIgnoreCase("Langsung")) {
                System.out.print("Masukkan lama parkir (jam) : ");
                int jam = input.nextInt();
                input.nextLine();
                biaya = kendaraan.hitungBiaya(jam);
            } else if (metode.equalsIgnoreCase("Jam")) {
                System.out.print("Jam masuk (0-23)  : ");
                int masuk = input.nextInt();
                System.out.print("Jam keluar (0-23) : ");
                int keluar = input.nextInt();
                input.nextLine();
                biaya = kendaraan.hitungBiaya(masuk, keluar);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            kendaraan.tampilRingkasan();
            daftarKendaraan.add(kendaraan);

            input.nextLine();
            System.out.print("Tambah kendaraan lain? (y/n) : ");
            String ulang = input.nextLine();
            if (!ulang.equalsIgnoreCase("y")) {
                lanjut = false;
            }
    }

        //ringkasan akhir
        double totalPendapatan = 0;
        for (Kendaraan x : daftarKendaraan) {
            totalPendapatan += x.getTotalBiaya();
        }

        System.out.println("=== RINGKASAN AKHIR ===");
        System.out.println("Jumlah kendaraan : " + daftarKendaraan.size());
        System.out.println("Total pendapatan parkir : Rp " + totalPendapatan);
        System.out.println("Terima kasih atas kunjungan Anda...");
    }
}
