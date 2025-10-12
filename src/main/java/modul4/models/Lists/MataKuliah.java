package modul4.models.Lists;

import modul4.models.User;

public class MataKuliah implements User.userDetails {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah (String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    //getter
    public String getKode(){return this.kode;}
    public String getNama(){return this.nama;}
    public int getSks(){return this.sks;}
    //setter
    public void setKode(String kode){this.kode = kode;}
    public void setNama(String nama){this.nama = nama;}
    public void setSks(int sks){this.sks = sks;}

    @Override
    public String toString(){
        return "MataKuliah : " +
               "kode='" + kode + '\'' +
               ", nama='" + nama + '\'' +
               ", sks=" + sks +
               '}';
    }

}
