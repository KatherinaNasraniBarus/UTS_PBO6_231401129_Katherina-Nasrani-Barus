package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perusahaan perusahaan = new Perusahaan();

        while(true) {
            System.out.println("n=== SISTEM MANAJEMEN KARYAWAN PERUSAHAAN PT TEKOTOK");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi");
            System.out.println("4. Ubah Gaji");
            System.out.println("5. Tampilkan Semua Karyawan");
            System.out.println("6. Cari Karyawan");
            System.out.println("7. Keluar");
            System.out.println("Masukkan Pilihan : ");
            int pilih = input.nextInt();
            input.nextLine();

            switch (pilih){
                case 1:
                    System.out.println("ID : ");
                    String id = input.nextLine();
                    System.out.println("Nama : ");
                    String nama = input.nextLine();
                    System.out.println("Posisi : ");
                    String posisi = input.nextLine();
                    System.out.println("Gaji : ");
                    double gaji = input.nextDouble();
                    input.nextLine();
                    perusahaan.tambah(new Karyawan(id, nama, posisi, gaji));
                    break;

                case 2:
                    System.out.println("ID karyawan yang ingin dihapus : ");
                    peru
            }

        }

    }
}
