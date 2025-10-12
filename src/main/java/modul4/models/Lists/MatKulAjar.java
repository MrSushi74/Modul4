package modul4.models.Lists;

import modul4.models.User;

import java.util.ArrayList;
import java.util.List;

public class MatKulAjar implements User.userDetails{
    private MataKuliah matKulNgajar;
    private PresensiStaff listPresensiStaff;

    public MatKulAjar(MataKuliah matKulNgajar, PresensiStaff listPresensiStaff){
        this.matKulNgajar = matKulNgajar;
        this.listPresensiStaff = listPresensiStaff;
    }
    //getter
    public MataKuliah getMatKulNgajar(){return this.matKulNgajar;}
    public PresensiStaff getListPresensiStaff(){return this.listPresensiStaff;}
    //setter
    public void setMatKulNgajar(MataKuliah matKulNgajar){this.matKulNgajar = matKulNgajar;}
    public void setListPresensiStaff(PresensiStaff listPresensiStaff){this.listPresensiStaff = listPresensiStaff;}

    @Override
    public String toString(){
        return matKulNgajar.getNama() + "\nPresensi Staff: " + listPresensiStaff.getStatus()+", "+listPresensiStaff.getTanggal()+", "+listPresensiStaff.getJam()+"\nKode matkul: "+matKulNgajar.getKode()+"\nSKS matkul : "+matKulNgajar.getSks();
    }
}

