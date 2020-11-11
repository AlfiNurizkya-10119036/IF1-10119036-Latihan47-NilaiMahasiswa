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
public class NilaiMahasiswa {

     private double quiz, uts, uas;

    public NilaiMahasiswa(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQUIZ() {
        return quiz;
    }


    public double getUAS() {
        return uas;
    }


    public double getUTS() {
        return uts;
    }

    public double hitungNA(){
        return 0.2 * quiz + 0.3 * uts + 0.5 * uas;
    }

    public char menentukanIndex(double NA){
        char index = 0;
        if (NA >= 80 && NA <= 100){
            index = 'A';
        }else if(NA >= 68 && NA < 80){
            index = 'B';
        }else if(NA >= 56 && NA < 68){
            index = 'C';
        }else if(NA >= 45 && NA < 56){
            index = 'D';
        }else if(NA >= 0 && NA < 45){
            index = 'E';
        }
        return index;
    }

    public String hasilKeterangan(char index){
        String keterangan = "";
        switch (index){
            case 'A' : keterangan = "Sangat Baik";
            break;
            case 'B' : keterangan = "Baik";
            break;
            case 'C' : keterangan = "Cukup";
            break;
            case 'D' : keterangan = "Kurang";
            break;
            case 'E' : keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
}
