package modul4.models;

public abstract class User {
    private String nama;
    private String alamat;
    private String tempatLahir;
    private String tanggalLahir;
    private String telepon;
    private UserType userType;

    public User(UserType userType,String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.telepon = telepon;
    }
    //getter
    public String getNama(){
        return this.nama;
    }
    public String getTempatLahir (){
        return this.tempatLahir;
    }
    public String getTanggalLahir(){
        return this.tanggalLahir;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getTelepon(){
        return this.telepon;
    }
    public String getTempatTanggalLahir (){
        return tempatLahir + ", " + tanggalLahir;
    };
    public UserType getType(){return this.userType;}
    //setter
    public void setName(String nama){this.nama = nama;}
    public void setAlamat(String alamat){this.alamat = alamat;}
    public void setTempatLahir(String tempatLahir){this.tempatLahir = tempatLahir;}
    public void setTanggalLahir(String tanggalLahir){this.tanggalLahir = tanggalLahir;}
    public void setTelepon(String telepon){this.telepon = telepon;}

    //interface
    public interface userDetails {
        String toString();
    }


}
