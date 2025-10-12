package modul4.models.Lists;

import modul4.models.User;

import java.util.ArrayList;
import java.util.List;

public class MatKulAjar implements User.userDetails{
    private MataKuliah matKulNgajar;
    private List<PresensiStaff> listPresensiStaff;

    //constructor
    public MatKulAjar(MataKuliah matKulNgajar){
        this.matKulNgajar = matKulNgajar;
        this.listPresensiStaff = new ArrayList<>();
    }

    //add to list presensi
    public void addPresensiStaff(PresensiStaff presensiStaff){this.listPresensiStaff.add(presensiStaff);}

    //getter
    public MataKuliah getMatKulNgajar(){return this.matKulNgajar;}
    public List<PresensiStaff> getListPresensiStaff(){return this.listPresensiStaff;}

    //setter
    public void setMatKulNgajar(MataKuliah matKulNgajar){this.matKulNgajar = matKulNgajar;}
    public void setListPresensiStaff(List<PresensiStaff> listPresensiStaff){this.listPresensiStaff = listPresensiStaff;}

    //interface
    @Override
    public String toString(){
        String result = "";
        result += matKulNgajar.getNama() + "\n";
        result += "Presensi Staff : \n";
        for(PresensiStaff list : getListPresensiStaff()){
            result += list.getStatus()+", "+list.getTanggal()+", "+list.getJam()+"\n";
        }
        result += "Kode Matkul : "+matKulNgajar.getKode()+"\n";
        result += "SKS Matkul : "+matKulNgajar.getSks();
        return result;
    }
}

