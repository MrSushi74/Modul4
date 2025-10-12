package modul4.models.Mahasiswa;

import modul4.models.User;
import modul4.models.UserType;

public class Mahasiswa extends User {
    private String nim;
    private String kodeJurusan;

    public Mahasiswa(String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String nim, String kodeJurusan){
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
    //setter
    public void setNim(String nim){this.nim = nim;}
    public void setKodeJurusan(String kodeJurusan){this.kodeJurusan = kodeJurusan;}

}
