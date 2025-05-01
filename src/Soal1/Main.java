package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perusahaan perusahaan = new Perusahaan(); //membuat objek perusahaan

        while(true) {
            // menu utama
            System.out.println("=== SISTEM MANAJEMEN KARYAWAN PERUSAHAAN PT TEKOTOK ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi");
            System.out.println("4. Ubah Gaji");
            System.out.println("5. Tampilkan Semua Karyawan");
            System.out.println("6. Cari Karyawan");
            System.out.println("7. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int pilih = input.nextInt();
            input.nextLine(); // membuat newline

            switch (pilih){
                case 1:
                    //tambah karyawan baru dengan validasi ID
                    System.out.print("ID : ");
                    String idBaru = input.nextLine();

                    boolean idSudahAda = false;
                    for (Karyawan x : perusahaan.daftarKaryawan) {
                        if (x.getId().equals(idBaru)) {
                            System.out.println("ID sudah digunakan");
                            idSudahAda = true;
                        }
                    }
                    if (idSudahAda) break;
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("Posisi : ");
                    String posisi = input.nextLine();
                    System.out.print("Gaji : ");
                    double gaji = input.nextDouble();
                    input.nextLine();
                    perusahaan.tambah(new Karyawan(idBaru, nama, posisi, gaji));
                    break;

                case 2:
                    // hapus karyawan berdasarkan ID
                    System.out.print("ID karyawan yang ingin dihapus : ");
                    perusahaan.hapus(input.nextLine());
                    break;

                case 3:
                    //ubah posisi karyawan
                    System.out.print("ID : ");
                    String idPosisi = input.nextLine();
                    System.out.print("Posisi baru : ");
                    perusahaan.ubahPosisi(idPosisi, input.nextLine());
                    break;

                case 4:
                    //ubah gaji karyawan
                    System.out.print("ID: ");
                    String idGaji = input.nextLine();
                    System.out.print("Gaji baru: ");
                    double gajiBaru = input.nextDouble();
                    input.nextLine();
                    perusahaan.ubahGaji(idGaji, gajiBaru);
                    break;

                case 5:
                    //tampilkan semua karyawan
                    perusahaan.tampilkanSemua();
                    break;

                case 6:
                    // cari karyawan berdasarkan ID
                    System.out.print("Cari ID : ");
                    perusahaan.cariKaryawan(input.nextLine());
                    break;

                case 7:
                    // keluar dari program
                    System.out.print("Program selesai.");
                    return;
                default:
                    // jika user mengetik angka diluar 1-7
                    System.out.print("Pilihan salah.");
            }

        }

    }
}
