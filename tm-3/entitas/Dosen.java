package entitas;

public class Dosen extends Personal {

    private String nid;

    public Dosen() {
        super();
        this.nid = "2020001";
    }

    public Dosen(String nid) {
        super();
        this.nid = nid;
    }

    public void cetak() {
        System.out.println("NIK : " + getNik());
        System.out.println("Nama : " + getNama());
        System.out.println("NID : " + getNid());
    }

    // -- getter and setter

    public void setNid(String nid) { this.nid = nid; }

    public String getNid() { return nid; }

}