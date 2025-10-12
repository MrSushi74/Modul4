package modul4.models.Staff;

import modul4.models.Lists.PresensiStaff;
import modul4.models.User;

import java.util.List;
import java.util.ArrayList;

public class Karyawan extends Staff implements User.userDetails{
    private String salary;
    private PresensiStaff presensiStaff;

    //constructor
    public Karyawan (String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String salary, PresensiStaff presensiStaff){
        super(NIK, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    //getter
    public String getSalary (){return this.salary;}
    public PresensiStaff getPresensiStaff (){return this.presensiStaff;}

    //setter
    public void setSalary (String salary){this.salary = salary;}
    public void setPresensiStaff (PresensiStaff presensiStaff){this.presensiStaff = presensiStaff;}

    //interface
    public String toString(){
        String result = "";
        result += "NIK: " + this.getNIK() + "\n";
        result += "Nama: " + this.getNama() + "\n";
        result += "Tempat Lahir: " + this.getTempatLahir() + "\n";
        result += "Tanggal Lahir: " + this.getTanggalLahir() + "\n";
        result += "Alamat: " + this.getAlamat() + "\n";
        result += "Telepon: " + this.getTelepon() + "\n";
        result += "User Type: " + this.getType() + "\n";
        result += "Salary: " + this.getSalary() + "\n";
        result += "Presensi Staff: " + this.getPresensiStaff() + "\n";
        return result;
    }
}
