package Soal1;

public class Karyawan {
    private String id;
    String nama, posisi;
    double gaji;

    // Konstruktor
    public Karyawan(String id, String nama, String posisi, double gaji){
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.gaji = (gaji);

    }
    // Getter untuk ID agar tetap bisa diakses meski private
    public String getId() {
        return id;
    }

    // menampilkan informasi lengkap karyawan
    public void tampilkanInfo(){
        System.out.println("ID : "+ id + " | Nama : " + nama + " | posisi : " + posisi + " | Gaji : Rp " + gaji);
    }

}
