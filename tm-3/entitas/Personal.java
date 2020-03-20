package entitas;

public class Personal {
    private String nik;
    private String nama;

    public Personal() {
        nik = "33760000";
        nama = "tidak ada";
    }

    public Personal(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public void cetak() {
        System.out.println(nik + " : " + nama);
    }

    // -- getter and setter

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() { return nik; }

    public String getNama() { return nama; } 

}