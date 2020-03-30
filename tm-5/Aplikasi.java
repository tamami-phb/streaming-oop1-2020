import java.util.logging.*;
import java.io.*;

public class Aplikasi {

    public static void main(String args[]) {
        // try {
        //     int angka = new Integer(args[0]);
        //     System.out.println(angka);
        // } catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Format running : java Aplikasi [angka]");
        // }
        // System.out.println("Ini tidak akan tercetak");
        Logger logger = Logger.getLogger("Aplikasi");
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("aplikasi.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch(IOException e) {
            logger.info("Gagal membuat/membuka file aplikasi.log");
        }

        try {
            String nama = args[0];
            int umur = Integer.parseInt(args[1]);
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
        } catch(ArrayIndexOutOfBoundsException e) {
            logger.warning("Aplikasi tidak memiliki parameter");
            logger.warning(e.getMessage());
        } catch(NumberFormatException e) {
            logger.info("Parameter kedua tidak berbentuk angka");
            logger.info(e.getMessage());
        }
        
    }

}