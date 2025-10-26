package modul4.utility;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class CLIUtil {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int getInt(){
        return scanner.nextInt();
    }

    public static String getString(){
        return scanner.nextLine();
    }

    public static String getStringPane(String message, String title){return JOptionPane.showInputDialog(null,message,title);}

    public static int getIntPane(String message, String title){return Integer.parseInt(JOptionPane.showInputDialog(null,message,title));}

    public static void showStringPane(String message, String title){JOptionPane.showMessageDialog(null, message,title, JOptionPane.INFORMATION_MESSAGE);}

}
