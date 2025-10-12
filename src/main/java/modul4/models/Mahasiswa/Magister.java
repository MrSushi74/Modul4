package modul4.models.Mahasiswa;

import modul4.models.Lists.MatKulAmbil;
import modul4.models.Lists.MataKuliah;
import modul4.models.User;
import modul4.models.UserType;

import java.util.ArrayList;
import java.util.List;

public class Magister extends Mahasiswa implements User.userDetails{
    private MatKulAmbil mataKuliah;
    private String judulPenelitianThesis;
    public Magister( String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String nim, String kodeJurusan, MatKulAmbil mataKuliah, String judulPenelitianThesis){
        super( nama, tempatLahir, tanggalLahir, alamat, telepon, nim, kodeJurusan);
        this.mataKuliah = mataKuliah;
        this.judulPenelitianThesis = judulPenelitianThesis;
    }
    //getter
    public MatKulAmbil getMatKulAmbil (){return this.mataKuliah;}
    public String getJudulPenelitianThesis (){return this.judulPenelitianThesis;}
    //setter
    public void setMatkul (MatKulAmbil mataKuliah){this.mataKuliah = mataKuliah;}
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
        result += "Mata Kuliah: " + this.getMatKulAmbil() + "\n";
        result += "Judul Penelitian Thesis: "+ this.getJudulPenelitianThesis() + "\n";
        return result;
    }


}
