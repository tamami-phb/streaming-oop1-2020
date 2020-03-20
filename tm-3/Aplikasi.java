import entitas.*;

public class Aplikasi {
    public static void main(String args[]) {
        Personal person = new Personal("3376001", "tamami");
        Mahasiswa mhs = new Mahasiswa();
        Dosen dosen = new Dosen("tami");

        Personal casting = (Personal) mhs;

        person.cetak();
        mhs.cetak();
        dosen.cetak();
        casting.cetak();
    }
}