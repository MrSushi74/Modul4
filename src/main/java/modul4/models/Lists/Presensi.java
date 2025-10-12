package modul4.models.Lists;

import modul4.models.StatusHadir;

public class Presensi {
    private String tanggal;
    private int status;

    public Presensi (String tanggal, int status){
        this.tanggal = tanggal;
        this.status = status;
    }
    //getter
    public String getTanggal(){return this.tanggal;}
    public StatusHadir getStatus(){
        if (status == 0){
            return StatusHadir.HADIR;
        }else{
            return StatusHadir.ALPHA;
        }
    }
    //setter
    public void setTanggal(String tanggal){this.tanggal = tanggal;}
    public void setStatus(int status){this.status = status;}
}
