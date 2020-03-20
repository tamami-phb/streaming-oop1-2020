package entitas;

public class Mahasiswa extends Personal {

    private String nim;

    public Mahasiswa() {
        super();
        this.nim = "19001";
    }

    public Mahasiswa(String nik, String nama, String nim) {
        super(nik, nama);
        this.nim = nim;
    }

    public void cetak() {
        System.out.println(getNik() + " : " + getNama() + " : " + nim);
    }

}