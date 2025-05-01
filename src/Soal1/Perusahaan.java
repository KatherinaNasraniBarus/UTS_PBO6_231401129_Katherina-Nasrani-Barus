package Soal1;


import java.util.ArrayList;

public class Perusahaan {
    ArrayList<Karyawan> daftarKaryawan = new ArrayList<>(); //list untuk menyimpan data karyawan

    // tambahkan karyawan baru dengan validasi gaji dan ID
    public void tambah(Karyawan x) {
        if (x.gaji < 0) {
            System.out.println("Gaji tidak boleh negatif");
            return;
        }
        for (Karyawan data : daftarKaryawan) {
            if (data.getId().equals(x.getId())) {
                System.out.println("ID sudah digunakan");
                return;
            }
        }
        daftarKaryawan.add(x);
        System.out.println("Karyawan ditambahkan.");
    }

    // hapus karyawan berdasarkan ID
    public void hapus(String id) {
        for (Karyawan x : daftarKaryawan) {
            if (x.getId().equals(id)) {
                daftarKaryawan.remove(x);
                System.out.println("Karyawan dihapus.");
                return;
            }
        }
        System.out.println("Karyawan tidak ditemukan");
    }

    // ubah posisi berdasarkan ID
    public void ubahPosisi(String id, String posisiBaru) {
        for (Karyawan x : daftarKaryawan) {
            if (x.getId().equals(id)) {
                x.posisi = posisiBaru;
                System.out.println("Posisi diperbarui.");
                return;
            }
        }
        System.out.println("ID tidak ditemukan. Perubahan posisi gagal.");
    }

    // ubah gaji berdasarkan ID
    public void ubahGaji(String id, double gajiBaru) {
        if (gajiBaru < 0) {
            System.out.println("Gaji tidak boleh negatif");
            return;
        }
        for (Karyawan x : daftarKaryawan) {
            if (x.getId().equals(id)) {
                x.gaji = gajiBaru;
                System.out.println("Gaji diperbarui");
                return;
            }
        }
        System.out.println("ID tidak ditemukan. Perubahan gaji gagal.");
    }

    // tampilkan semua data karyawan
    public void tampilkanSemua() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada Karyawan.");
        } else {
            for (Karyawan x : daftarKaryawan) {
                x.tampilkanInfo();
            }
        }
    }

    // cari karyawan berdasarkan ID
    public void cariKaryawan(String id) {
        for (Karyawan x : daftarKaryawan) {
            if (x.getId().equals(id)){
            System.out.println("Karyawan ditemukan : ");
            x.tampilkanInfo();
            return;
            }
        }
        System.out.println("Karyawan tidak terdaftar.");
    }
}
