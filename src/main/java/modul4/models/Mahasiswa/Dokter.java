package modul4.models.Mahasiswa;

import modul4.models.UserType;

import java.util.List;

public class Dokter extends Mahasiswa {
    private String judulPenelitian;
    private double nilaiSidang1;
    private double nilaiSidang2;
    private double nilaiSidang3;
    public Dokter(String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String nim, String kodeJurusan, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3, String judulPenelitian){
        super(nama, tempatLahir, tanggalLahir, alamat, telepon, nim, kodeJurusan);
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
        this.judulPenelitian = judulPenelitian;
    }
    //getter
    public String getJudulPenelitian (){return this.judulPenelitian;}
    public double getNilaiSidang1(){return this.nilaiSidang1;}
    public double getNilaiSidang2(){return this.nilaiSidang2;}
    public double getNilaiSidang3(){return this.nilaiSidang3;}
    //setter
    public void setJudulPenelitian(String judulPenelitian){this.judulPenelitian = judulPenelitian;}
    public void setNilaiSidang1(double nilaiSidang1){this.nilaiSidang1 = nilaiSidang1;}
    public void setNilaiSidang2(double nilaiSidang2){this.nilaiSidang2 = nilaiSidang2;}
    public void setNilaiSidang3(double nilaiSidang3){this.nilaiSidang3 = nilaiSidang3;}
    //interface
    public String toString(){
        String result = "";
        result += "Nama: " + this.getNama() + "\n";
        result += "Tempat Lahir: " + this.getTempatLahir() + "\n";
        result += "Tanggal Lahir: " + this.getTanggalLahir() + "\n";
        result += "Alamat: " + this.getAlamat() + "\n";
        result += "Telepon: " + this.getTelepon() + "\n";
        result += "NIM: " + this.getNim() + "\n";
        result += "User Type: " + UserType.MAHASISWA + "\n";
        result += "Kode Jurusan: " + this.getKodeJurusan() + "\n";
        result += "Judul Penelitian: " + this.getJudulPenelitian() + "\n";
        result += "Nilai Sidang 1: " + this.getNilaiSidang1() + "\n";
        result += "Nilai Sidang 2: " + this.getNilaiSidang2() + "\n";
        result += "Nilai Sidang 3: " + this.getNilaiSidang3() + "\n";
        return result;
    }
}
