package modul4.models;

public abstract class User {
    private String nama;
    private String alamat;
    private String tempatLahir;
    private String tanggalLahir;
    private String telepon;
    private UserType userType;

    //constructor
    public User(UserType userType,String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.telepon = telepon;
        this.userType = userType;
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
    public String getTypeToString(){
        switch (userType){
            case MAHASISWA :
                return "mahasiswa";
            case DOSEN_TETAP :
                return "dosen tetap";
            case DOSEN_HONORER :
                return "dosen honorer";
            case STAFF :
                return "staff";
            default :
                return "user";
        }
    }

    //interface
    public interface userDetails {
        String toString();
    }


}
