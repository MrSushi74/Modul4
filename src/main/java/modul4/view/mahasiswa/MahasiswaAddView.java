package modul4.view.mahasiswa;

import modul4.controllers.MahasiswaController;
import modul4.utility.CLIUtil;

public class MahasiswaAddView {
    private MahasiswaController mahasiswaController;

    public MahasiswaAddView(){
        this.mahasiswaController = new MahasiswaController();
    }
    public void render(){
        System.out.println("Input NIM");
        String nim = CLIUtil.getString();
        System.out.println("Input Kode Jurusan");
        String kodeJurusan = CLIUtil.getString();
        System.out.println("Input Nama");
        String nama = CLIUtil.getString();
        System.out.println("Input Tempat Lahir");
        String tempatLahir = CLIUtil.getString();
        System.out.println("Input Tanggal Lahir");
        String tanggalLahir = CLIUtil.getString();
        System.out.println("Input Alamat");
        String alamat = CLIUtil.getString();
        System.out.println("Input Telepon");
        String telepon = CLIUtil.getString();
        mahasiswaController.add(nim,kodeJurusan,nama,tempatLahir,tanggalLahir,alamat,telepon);
    }
}
