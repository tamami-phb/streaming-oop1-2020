package entity;

public class Personal {
    String nik;
    String nama;
    static String publicPin;

    public Personal(String nik, String nama, String publicPin) {
        this.nik = nik;
        this.nama = nama;
        this.publicPin = publicPin;
    }
    
    public String toString() {
        return nik + " - " + nama + " - " + publicPin;
    }
}