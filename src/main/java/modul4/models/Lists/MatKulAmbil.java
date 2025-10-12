package modul4.models.Lists;

import modul4.models.User;

import java.util.ArrayList;
import java.util.List;

public class MatKulAmbil implements User.userDetails {
    private MataKuliah matKul;
    private List<Presensi> listPresensi;
    private int n1,n2,n3;

    //constructor
    public MatKulAmbil(MataKuliah matKul, int n1, int n2, int n3){
        this.matKul = matKul;
        this.listPresensi = new ArrayList<>();
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    //add to listPresensi
    public void addPresensi(Presensi presensi){this.listPresensi.add(presensi);}

    //getter
    public MataKuliah getMatKulAmbil(){return this.matKul;}
    public List<Presensi> getListPresensi(){return this.listPresensi;}
    public int getN1(){return this.n1;}
    public int getN2(){return this.n2;}
    public int getN3(){return this.n3;}

    //setter
    public void setMatKulAmbil(MataKuliah matKul){this.matKul = matKul;}
    public void setListPresensi(List<Presensi> listPresensi){this.listPresensi = listPresensi;}
    public void setN1(int n1){this.n1 = n1;}
    public void setN2(int n2){this.n2 = n2;}
    public void setN3(int n3){this.n3 = n3;}

    //interface
    @Override
    public String toString() {
        String result ="";
        result += matKul.getNama() + "\n";
        result += "Nilai 1 : "+this.n1;
        result += " Nilai 2 : "+this.n2;
        result += " Nilai 3 : "+this.n3+"\n";
        result += "Presensi : \n";
        for(Presensi list : getListPresensi()){
            result += list.getStatus();
        }
        return result;
    }
}
