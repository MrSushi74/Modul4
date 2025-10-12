package modul4.models.Staff;

import modul4.models.User;
import modul4.models.UserType;

public class Staff extends User implements User.userDetails {
    private String NIK;

    //constructor
    public Staff(String NIK,String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon){
        super(UserType.STAFF, nama,tempatLahir,tanggalLahir,alamat,telepon);
        this.NIK = NIK;
    }

    //getter
    public String getNIK(){
        return this.NIK;
    }

    //setter
    public void setNIK(String NIK){this.NIK = NIK;}

    //interface
    @Override
    public String toString(){
        String result = "";
        result += "NIK: " + this.getNIK() + "\n";
        result += "Nama: " + this.getNama() + "\n";
        result += "Tempat Lahir: " + this.getTempatLahir() + "\n";
        result += "Tanggal Lahir: " + this.getTanggalLahir() + "\n";
        result += "Alamat: " + this.getAlamat() + "\n";
        result += "Telepon: " + this.getTelepon() + "\n";
        result += "User Type: " + this.getType() + "\n";
        return result;
    }
}
