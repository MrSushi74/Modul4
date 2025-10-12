package modul4.models.Staff;

import modul4.models.Lists.PresensiStaff;

import java.util.List;
import java.util.ArrayList;

public class Karyawan extends Staff{
    private String salary;
    private ArrayList<PresensiStaff> presensiStaff;

    public Karyawan (String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon,String userType, String salary){
        super(NIK, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.salary = salary;
        this.presensiStaff = new ArrayList<>();
    }
    //getter
    public String getSalary (){return this.salary;}
    public ArrayList<PresensiStaff> getPresensiStaff (){return this.presensiStaff;}
    //setter
    public void setSalary (String salary){this.salary = salary;}
    public void setPresensiStaff (ArrayList<PresensiStaff> presensiStaff){this.presensiStaff = presensiStaff;}
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
