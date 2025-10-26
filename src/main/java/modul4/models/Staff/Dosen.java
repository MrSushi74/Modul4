package modul4.models.Staff;

import modul4.models.Lists.MatKulAjar;
import modul4.models.User;
import modul4.models.UserType;

import java.util.ArrayList;
import java.util.List;

public class Dosen extends Staff implements User.userDetails {
    private String departemen;
    private List<MatKulAjar> matKulNgajar;

    //constructor
    public Dosen (UserType userType, String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen) {
        super(UserType.STAFF,NIK, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.departemen = departemen;
        this.matKulNgajar = new ArrayList<>();
    }

    //add to MatKulNgajar
    public void addMatKulNgajar(MatKulAjar matKulNgajar){this.matKulNgajar.add(matKulNgajar);}

    //getter
    public String getDepartemen(){return this.departemen;}
    public List<MatKulAjar> getMatKulNgajar(){return this.matKulNgajar;}

    //setter
    public void setDepartemen(String departemen){this.departemen = departemen;}
    public void setMatKulNgajar(List<MatKulAjar> matKulNgajar){this.matKulNgajar = matKulNgajar;}

    //interface
    @Override
    public String toString() {
        String result = "";
        result += "Departemen: "+this.getDepartemen()+"\n";
        result += "Mata Kuliah Ngajar: \n";
        for(MatKulAjar list : getMatKulNgajar()){
            result += list.toString();
        }
        result += "\nNIK: "+this.getNIK()+"\n";
        result += "Nama: "+this.getNama()+"\n";
        result += "Tempat Lahir: "+this.getTempatLahir()+"\n";
        result += "Tanggal Lahir: "+this.getTanggalLahir()+"\n";
        result += "Alamat: "+this.getAlamat()+"\n";
        result += "Telepon: "+this.getTelepon()+"\n";
        result += "User Type: "+UserType.STAFF+"\n";
        return result;
    }

}
