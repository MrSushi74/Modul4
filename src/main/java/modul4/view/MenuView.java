package modul4.view;

import modul4.controllers.UserController;
import modul4.models.User;
import modul4.utility.CLIUtil;

import java.util.ArrayList;
import java.util.List;

public class MenuView {
    private UserController userController;

    public MenuView(){
        this.userController = new UserController();
    }

    public void addMK(){
        userController.addMatkul("PBO","Pemrograman Berbasis Objek",4);
        userController.addMatkul("SI", "Sistem Informasi",3);
        userController.addMatkul("PKN", "Pendidikan Kewarganegaraan",2);
    }
    public void addDummies(){
        //sarjana
        userController.addUser("1234567890", "IF", "John Doe", "Bandung", "2004-01-01", "Jl. Bandung", "08123456789", 0, 80, 80, 80);
        userController.addUser("1234567891", "IF", "Jane Doe", "Bandung", "2004-01-01", "Jl. Bandung", "08123456789", 1, 56, 77, 76);

        //magister
        userController.addUser("1234567892", "DKV", "John Lee", "Bandung", "2004-01-01", "Jl. Bandung", "08123456789", 2, 45, 70, 90, "Pengembangan desain komunikasi visual untuk promosi pariwisata");

        //dokter
        userController.addUser("Jane Lee", "Bandung", "2004-01-01", "Jl. Bandung", "08123456789", "1234567893", "MG", 90, 60, 95, "Pengaruh Tahanan Kabel terhadap Efektivitas Perlindungan Korosi Anoda Korban Mg pada Baja Karbon");

        //Dosen Tetap
        userController.addUser("1231344141234","John Doewes", "Bandung", "2004-01-01", "Jl. Bandung", "08123456789", "IF", 6000000, 2);
    }
    public void render(){
        addMK();
        addDummies();
        String menu = "MENU SIA \n 1. Print User Data";
        int menuInput = CLIUtil.getIntPane(menu,"Input menu choice");
        while (menuInput != 0){
            switch (menuInput){
                case 1 : {
                    printUserData();
                    break;
                }
            }
        }
    }

    public void printUserData(){
        List<User>users = this.userController.findAll();
        String nama = CLIUtil.getStringPane("Input nama","User Data");
        String result = "User Data:\n";
        for (User user : users) {
            if (user.getNama().toLowerCase().contains(nama.toLowerCase())) {
                result += user.getNama()+ " - "+user.getType()+"\n";
            }
        }
        CLIUtil.showStringPane(result,"User Data");

    }
}
