package modul4.models.Mahasiswa;
import modul4.models.Lists.MatKulAmbil;
import modul4.models.User;
import modul4.models.UserType;

import java.util.*;
public class Sarjana extends Mahasiswa implements User.userDetails{
    private List<MatKulAmbil> mataKuliah;

    //constructor
    public  Sarjana (String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String nim, String kodeJurusan){
        super(UserType.MAHASISWA, nama, tempatLahir, tanggalLahir, alamat, telepon, nim, kodeJurusan);
        this.mataKuliah = new ArrayList<>();
    }

    //add to MatKulAmbil
    public void addMatKulAmbil(MatKulAmbil matKulAmbil){this.mataKuliah.add(matKulAmbil);}

    //getter
    public List<MatKulAmbil> getMatKulAmbil (){return this.mataKuliah;}

    //interface
    @Override
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
        result += "Mata Kuliah : \n";
        for (MatKulAmbil matkul : getMatKulAmbil()){
            result += matkul.toString() + "\n";
        }
        return result;
    }
}
