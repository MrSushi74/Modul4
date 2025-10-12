package modul4.models.Lists;

import modul4.models.User;

import java.util.ArrayList;

public class MatKulAmbil implements User.userDetails {
    private MataKuliah matKul;
    private Presensi listPresensi;
    private int n1,n2,n3;

    public MatKulAmbil(){
        this.matKul = matKul;
        this.listPresensi = listPresensi;
    }
    public MatKulAmbil(MataKuliah matKul, Presensi listPresensi, int n1, int n2, int n3){
        this.matKul = matKul;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    //getter
    public MataKuliah getMatKulAmbil(){return this.matKul;}
    public Presensi getListPresensi(){return this.listPresensi;}
    public int getN1(){return this.n1;}
    public int getN2(){return this.n2;}
    public int getN3(){return this.n3;}
    //setter
    public void setMatKulAmbil(MataKuliah matKul){this.matKul = matKul;}
    public void setListPresensi(Presensi listPresensi){this.listPresensi = listPresensi;}
    public void setN1(int n1){this.n1 = n1;}
    public void setN2(int n2){this.n2 = n2;}
    public void setN3(int n3){this.n3 = n3;}

    @Override
    public String toString() {
        return matKul.getNama()+" nilai 1 : "+n1+" nilai 2 : "+n2+" nilai 3 : "+n3+" SKS "+matKul.getSks()+" kode : "+matKul.getKode()+"\nPresensi : " + listPresensi.getStatus();
    }
}
