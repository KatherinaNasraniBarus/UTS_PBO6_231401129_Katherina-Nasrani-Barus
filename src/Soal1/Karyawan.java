package Soal1;

public class Karyawan {
    public String id;
    private String id;
    private String nama;
    private String posisi;
    private double gaji;

    public Karyawan(String id, String nama, String posisi, double gaji){
        this.id=id;
        this.nama = nama;
        this.posisi = posisi;
        setGaji(gaji);
    }

    public String getId(){
        return id;
    }

}
