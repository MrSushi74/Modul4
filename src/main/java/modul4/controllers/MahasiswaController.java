package modul4.controllers;

import modul4.models.Mahasiswa.Mahasiswa;
import modul4.models.User;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaController {
    List<User> users;
    public MahasiswaController(){
        this.users = new ArrayList<>();
    }

    //sarjana
    public void addUser(String nim, String kodeJurusan, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon){};
    public void delete(){};
    public void update(){};
    public Mahasiswa[] findAll(){
        return new Mahasiswa[0];
    };
    public Mahasiswa getMahasiswa(String nim){
        return null;
    }
}
