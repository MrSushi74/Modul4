package modul4.models.Staff;

import modul4.models.Lists.MatKulAjar;
import modul4.models.Lists.MataKuliah;
import modul4.models.User;
import modul4.models.UserType;

public class DosenTetap extends Dosen implements User.userDetails{
    private double salary;

    //constructor
    public DosenTetap (String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, MatKulAjar matkulNgajar, double salary){
        super(UserType.DOSEN_TETAP, NIK, nama, tempatLahir,tanggalLahir,alamat,telepon, departemen);
        this.salary = salary;
    }

    //getter
    public double getSalary (){return this.salary;}

    //setter
    public void setSalary (double salary){this.salary = salary;}

    //interface
    @Override
    public String toString(){
        String result = "";
        result += "NIK: " + this.getNIK() + "\n";
        result += "Nama: " + this.getNama() + "\n";
        result += "Departemen: " + this.getDepartemen() + "\n";
        result += "Tempat Lahir: " + this.getTempatLahir() + "\n";
        result += "Tanggal Lahir: " + this.getTanggalLahir() + "\n";
        result += "Alamat: " + this.getAlamat() + "\n";
        result += "Telepon: " + this.getTelepon() + "\n";
        result += "User Type: " + UserType.DOSEN_TETAP + "\n";
        result += "Salary: " + this.getSalary() + "\n";
        result += "Mata Kuliah: ";
        for(MatKulAjar list : getMatKulNgajar()){
            result += list.toString();
        }
        result += "\n";
        return result;
    }
}
