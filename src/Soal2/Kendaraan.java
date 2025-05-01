package Soal2;

public class Kendaraan {
    private String jenis;
    private int lamaParkir; // dalam jam
    private double tarifPerJam;

    public Kendaraan (String jenis)  {
        this.jenis = jenis.toLowerCase();
        switch (this.jenis) {
            case "motor":
                tarifPerJam = 2000;
                break;

            case "mobil":
                tarifPerJam = 5000;
                break;

            case "truk":
                tarifPerJam = 8000;
                break;

            default: // jika user memasukkan input selain motor,mobil atau truk
                tarifPerJam = 0;
                System.out.println("Jenis kendaraan tidak valid.");
        }
    }

    // menghitung biaya parkir dengan input langsung dalam jam
    public double hitungBiaya(int jam) {
        this.lamaParkir = jam;
        return hitungTotal();
    }

    public double hitungBiaya(int jamMasuk, int jamKeluar) {
        this.lamaParkir = jamKeluar - jamMasuk;
        if (lamaParkir < 0) lamaParkir = 0;
        return hitungTotal();
    }

    // mengitung total biaya dengan diskon jika perlu
    private double hitungTotal() {
        double total = lamaParkir * tarifPerJam;
        if (lamaParkir > 5) {
            total *= 0.9; //diskon 10%
        }
        return  total;
    }

    // menampilkan ringkasan kendaraan
    public void tampilRingkasan() {
        System.out.println("---- Ringkasan Parkir ----");
        System.out.println("Jenis       : " + jenis );
        System.out.println("Lama Parkir : " + lamaParkir + " jam");
        System.out.println("Total Biaya : Rp " + hitungTotal());

}

    public double getTotalBiaya() {
        return hitungTotal();
    }

}


