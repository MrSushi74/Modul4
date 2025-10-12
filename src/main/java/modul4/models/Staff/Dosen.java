package modul4.models.Staff;

import modul4.models.Lists.MatKulAjar;
import modul4.models.User;
import modul4.models.UserType;

import java.util.ArrayList;

public class Dosen extends Staff implements User.userDetails {
    private String departemen;
    private MatKulAjar matKulNgajar;
    public Dosen (UserType userType, String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, MatKulAjar matKulNgajar) {
        super(NIK, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.departemen = departemen;
        this.matKulNgajar = matKulNgajar;
    }
    //getter
    public String getDepartemen(){return this.departemen;}
    public MatKulAjar getMatKulNgajar(){return this.matKulNgajar;}
    //setter
    public void setDepartemen(String departemen){this.departemen = departemen;}
    public void setMatKulNgajar(MatKulAjar matKulNgajar){this.matKulNgajar = matKulNgajar;}

    @Override
    public String toString() {
        String result = "";
        result += "Departemen: "+this.getDepartemen()+"\n";
        result += "Mata Kuliah Ngajar: "+this.getMatKulNgajar().toString()+"\n";
        result += "NIK: "+this.getNIK()+"\n";
        result += "Nama: "+this.getNama()+"\n";
        result += "Tempat Lahir: "+this.getTempatLahir()+"\n";
        result += "Tanggal Lahir: "+this.getTanggalLahir()+"\n";
        result += "Alamat: "+this.getAlamat()+"\n";
        result += "Telepon: "+this.getTelepon()+"\n";
        result += "User Type: "+this.getType()+"\n";
        return result;
    }

}
