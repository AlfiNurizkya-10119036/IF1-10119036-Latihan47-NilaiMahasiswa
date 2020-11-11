/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan47.nilaimahasiswa;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Menghitung Nilai Mahasiswa
 */
public class Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa nilai = new NilaiMahasiswa(75, 45,34);
        double NA = nilai.hitungNA();
        char Index = nilai.menentukanIndex(NA);
        System.out.println("QUIZ        = " + nilai.getQUIZ());
        System.out.println("UTS         = " + nilai.getUTS());
        System.out.println("UAS         = " + nilai.getUAS());
        System.out.println("\nNIlai Akhir = " + NA);
        System.out.println("\nIndex = " + Index);
        System.out.println("Keterangan = " + nilai.hasilKeterangan(Index));
    }
}
