package modul4.models.Lists;

public class MataKuliahPilihan extends MataKuliah {
    private int jumlahMinimumMahasiswa;

    //constructor
    public MataKuliahPilihan(String kode, String nama, int sks, int jumlahMinimumMahasiswa){
        super(kode, nama, sks);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    //getter
    public int getJumlahMinimumMahasiswa (){return this.jumlahMinimumMahasiswa;}

    //setter
    public void setJumlahMinimumMahasiswa (int jumlahMinimumMahasiswa){this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;}
}
