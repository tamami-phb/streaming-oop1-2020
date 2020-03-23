import util.*;
import temp.*;

public class Aplikasi {

    private Personal person;

    public Aplikasi() {
        person = new Personal();
    }

    public static void main(String args[]) {
        // Matematika mtk = new Matematika();
        // int result = Matematika.faktorial(3);
        // System.out.println("Hasil faktorial 4 = " + result);

        // PercobaanStatic obj1 = new PercobaanStatic();
        // PercobaanStatic obj2 = new PercobaanStatic();

        // obj1.atribut = "isi objek 1";
        // obj2.atribut = "isi objek 2";
        // obj1.atributStatik = "isi static 1";
        // obj2.atributStatik = "isi static 2";
        // System.out.println(obj1.atribut);
        // System.out.println(obj2.atribut);
        // System.out.println(obj1.atributStatik);
        // System.out.println(obj2.atributStatik);

        Aplikasi app = new Aplikasi();
        // Personal person =  app.new Personal();
        Personal person = app.person;
        person.nik = "337601";
        person.nama = "tamami";
        System.out.println(person.nik + ":" + person.nama);
    }

    class Personal {
        String nik;
        String nama;
    }

}