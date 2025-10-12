package modul4;

import modul4.models.Lists.*;
import modul4.models.Mahasiswa.Dokter;
import modul4.models.Mahasiswa.Magister;
import modul4.models.Mahasiswa.Sarjana;
import modul4.models.Staff.Dosen;
import modul4.models.Staff.DosenHonorer;
import modul4.models.Staff.DosenTetap;
import modul4.models.UserType;

public class App {
    public static void main(String[] args) {
        //Sarjana
        MataKuliah pbo = new MataKuliah("PBO","Pemrograman Berbasis Objek", 4);
        Presensi presensiMahasiswa = new Presensi("2025-10-10",1);
        MatKulAmbil matKulDiambilSarjana = new MatKulAmbil(pbo, presensiMahasiswa,80,80,80);
        Sarjana mahasiswaSarjana = new Sarjana("James","jakarta","2005-10-20","Jl Passanggrahan VII No.19","085880280203","1124022","IF",matKulDiambilSarjana);

        //Magister
        MataKuliah PKN = new MataKuliah("PKN","Pendidikan Kewarganegaraan", 3);
        Presensi presensiMagister = new Presensi("2025-10-1",0);
        MatKulAmbil matKulDiambilMagister = new MatKulAmbil(PKN, presensiMagister,90,95,100);
        Magister mahasiswaMagister = new Magister("David","Bandung","2006-8-14","Jl MekarWangi V No.7","084572940457","1124022","DKV", matKulDiambilMagister,"Pengembangan desain komunikasi visual untuk promosi pariwisata");

        //Dokter
        Dokter mahasiswaDokter = new Dokter("Marvel","Bogor","2005-08-15","Jl. Summarecon X No.16","085880280203","1124022","MG",90,60,95, "Pengaruh Tahanan Kabel terhadap Efektivitas Perlindungan Korosi Anoda Korban Mg pada Baja Karbon");

        //MatKul Ngajar
        PresensiStaff listPresensiStaffPBO = new PresensiStaff("2025-10-1",1,"10:00");
        MatKulAjar matKulNgajarPBO = new MatKulAjar(pbo, listPresensiStaffPBO);
        PresensiStaff listPresensiStaffPKN = new PresensiStaff("2025-10-1",0,"10:00");
        MatKulAjar matKulNgajarPKN = new MatKulAjar(PKN, listPresensiStaffPKN);
        PresensiStaff listPresensiStaffStraGol = new PresensiStaff("2025-10-1",1,"10:00");
        MatKulAjar matKulNgajarStraGol = new MatKulAjar(pbo, listPresensiStaffStraGol);

        //Dosen
        Dosen dosen = new Dosen(UserType.STAFF, "3273056010900009", "Dion","1995-05-30","Jl. Summarecon X No.16","085880280203","096784567634", "Informatika", matKulNgajarPBO);
        //Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap("3273056010900009", "Ken", "Bandung","1990-05-30","Jl. Summarecon X No.16","085880280203","MG", matKulNgajarPKN,80000000);
        //Dosen Honorer
        DosenHonorer dosenHonorer = new DosenHonorer("3273056010900009", "Hans", "Bandung","Ga tau","Dimana ya","hmm","amin banyak", matKulNgajarStraGol, "Amin Banyak");


        //result
        System.out.println(mahasiswaSarjana.toString());
        System.out.println(mahasiswaMagister.toString());
        System.out.println(mahasiswaDokter.toString());
        System.out.println(dosen.toString());
        System.out.println(dosenTetap.toString());
        System.out.println(dosenHonorer.toString());

    }
}
