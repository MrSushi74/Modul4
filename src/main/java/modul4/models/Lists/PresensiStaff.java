package modul4.models.Lists;

public class PresensiStaff extends Presensi{
    private String jam;

    public PresensiStaff(String tanggal, int status, String jam){
        super(tanggal, status);
        this.jam = jam;
    }
    //getter
    public String getJam(){return this.jam;}
    //setter
    public void setJam(String jam){this.jam = jam;}

}
