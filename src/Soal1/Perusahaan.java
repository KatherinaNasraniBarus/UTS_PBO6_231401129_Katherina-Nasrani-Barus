package Soal1;

import java.util.ArrayList;

public class Perusahaan {
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    public void tambahKaryawan(Karyawan baru){
        for (Karyawan data : daftarKaryawan){
            if (data.id.equals(baru.id)){
                System.out.println("ID sudah digunakan");
                return;
            }
        }
        daftarKaryawan.add(baru);
        System.out.println("Karyawan ditambahkan.");

    }
}
