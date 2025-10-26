package modul4.models.Mahasiswa;

import modul4.models.User;
import modul4.models.UserType;

public class Mahasiswa extends User {
    private String nim;
    private String kodeJurusan;

    //constructor
    public Mahasiswa(UserType userType, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String nim, String kodeJurusan){
        super(UserType.MAHASISWA, nama, tempatLahir, tanggalLahir, alamat, telepon);
        this.nim = nim;
        this.kodeJurusan = kodeJurusan;
    }

    //getter
    public String getNim(){
        return this.nim;
    }
    public String getKodeJurusan(){
        return this.kodeJurusan;
    }

}
