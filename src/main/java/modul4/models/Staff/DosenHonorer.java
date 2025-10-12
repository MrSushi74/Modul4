package modul4.models.Staff;

import modul4.models.Lists.MatKulAjar;
import modul4.models.User;
import modul4.models.UserType;

public class DosenHonorer extends Dosen{
    private String honorPerSKS;

    public DosenHonorer(String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, MatKulAjar matKulNgajar, String honorPerSKS) {
        super(UserType.DOSEN_HONORER, NIK, nama, tempatLahir, tanggalLahir, alamat, telepon, departemen, matKulNgajar);
        this.honorPerSKS = honorPerSKS;

    }
    //getter
    public String getHonorPerSKS(){return this.honorPerSKS;}
    //setter
    public void setHonorPerSKS(String honorPerSKS){this.honorPerSKS = honorPerSKS;}
    //interface
    public String toString(){
        String result = "";
        result += "NIK: " + this.getNIK() + "\n";
        result += "Nama: " + this.getNama() + "\n";
        result += "Departemen: " + this.getDepartemen() + "\n";
        result += "Tempat Lahir: " + this.getTempatLahir() + "\n";
        result += "Tanggal Lahir: " + this.getTanggalLahir() + "\n";
        result += "Alamat: " + this.getAlamat() + "\n";
        result += "Telepon: " + this.getTelepon() + "\n";
        result += "User Type: " + UserType.DOSEN_HONORER + "\n";
        result += "Honor Per SKS: " + this.getHonorPerSKS() + "\n";
        result += "Mata Kuliah: " + this.getMatKulNgajar() + "\n";
        return result;
    }

}
