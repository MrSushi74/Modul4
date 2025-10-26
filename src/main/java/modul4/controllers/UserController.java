package modul4.controllers;

import modul4.models.Lists.*;
import modul4.models.Mahasiswa.Dokter;
import modul4.models.Mahasiswa.Magister;
import modul4.models.Mahasiswa.Sarjana;
import modul4.models.Staff.DosenHonorer;
import modul4.models.Staff.DosenTetap;
import modul4.models.Staff.Karyawan;
import modul4.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;
    List<Presensi> presensi;
    List<PresensiStaff> presensiStaff;
    List<MataKuliah> mk;
    List<MatKulAmbil> mkAmbil;
    List<MatKulAjar> mkNgajar;
    public UserController(){
        this.users = new ArrayList<>();
        this.presensi = new ArrayList<>();
        this.presensiStaff = new ArrayList<>();
        this.mk = new ArrayList<>();
        this.mkAmbil = new ArrayList<>();
        this.mkNgajar = new ArrayList<>();
    }


    //make matkul
    public void addMatkul(String kode, String nama, int sks){
        mk.add(new MataKuliah(kode, nama, sks));
    }

    //sarjana
    public void addUser(String nim, String kodeJurusan, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, int choice, int n1, int n2, int n3){
        this.users.add(new Sarjana(nama, tempatLahir, tanggalLahir, alamat, telepon, nim, kodeJurusan));
        this.mkAmbil.add(new MatKulAmbil(mk.get(choice), n1, n2, n3));
    };
    public void addPresensi(String tanggal, int status){
        this.presensi.add(new Presensi(tanggal, status));
    };

    public void delete(){};
    public void update(){};

    //magister
    public void addUser(String nim, String kodeJurusan, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, int choice, int n1, int n2, int n3, String judulPenelitianThesis){
        this.users.add(new Magister(nama, tempatLahir, tanggalLahir, alamat, telepon, nim, kodeJurusan, judulPenelitianThesis));
        this.mkAmbil.add(new MatKulAmbil(mk.get(choice), n1, n2, n3));
    }

    //dokter
    public void addUser(String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String nim, String kodeJurusan, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3, String judulPenelitian){
        this.users.add(new Dokter(nama, tempatLahir, tanggalLahir, alamat, telepon, nim, kodeJurusan, nilaiSidang1, nilaiSidang2, nilaiSidang3, judulPenelitian));
    }

    //dosen honorer
    public void addUser(String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, MatKulAjar matKulNgajar, String honorPerSKS, int choice){
        this.users.add(new DosenHonorer(NIK, nama, tempatLahir, tanggalLahir, alamat, telepon, departemen, matKulNgajar, honorPerSKS));
        this.mkNgajar.add(new MatKulAjar(mk.get(choice)));
    }

    //dosen tetap
    public void addUser(String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String departemen, double salary, int choice){
        this.users.add(new DosenTetap(NIK, nama, tempatLahir, tanggalLahir, alamat, telepon, departemen, salary));
        this.mkNgajar.add(new MatKulAjar(mk.get(choice)));
    }

    //karyawan
    public void addUser(String NIK, String nama, String tempatLahir, String tanggalLahir, String alamat, String telepon, String salary, PresensiStaff presensiStaff){
        this.users.add(new Karyawan(NIK, nama, tempatLahir, tanggalLahir, alamat, telepon, salary, presensiStaff));
    }

    //findAll
    public List<User> findAll(){
        return this.users;
    }

}
