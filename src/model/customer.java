package model;

import java.time.*;
public class customer {
    // atribut
    private String idmember;
    private String nama;
    private String alamat;
    private String diskon;
    private String telp;
    private String jadwal;
    private int harga;
    private String perawatan;

    //method booking
    public String booking() {
        if (this.jadwal == "1") {
            jadwal = "Senin, 09:00";
        } else if (this.jadwal == "2") {
            jadwal = "Selasa, 10:00";
        } else if (this.jadwal == "3") {
            jadwal = "Rabu, 12:00";
        }
        return jadwal;
    }

    public long disc() {
        long diskon = 0;
        if (this.harga > 100000) {
            diskon = 5000;
        } else {
            diskon = 15000;
        }
        return diskon;
    }

    public long treatmemt() {
        long Harga = 0;
        if (this.perawatan == "Smooting") {
            Harga = 150000;
        } else if (this.perawatan == "Coloring") {
            Harga = 120000;
        } else {
            Harga = 100000;
        }
        return Harga;
    }

    public long totalharga() {
        long sum = this.treatmemt() - this.disc();
        return sum;
    }

    public String getAlamat() {
        return alamat;
    }

    //constructor
    public customer(){

    }
    public customer(String idmember, String nama, String alamat, String diskon){
        this.idmember=idmember;
        this.nama=nama;
        this.alamat=alamat;
        this.diskon=diskon;
    }

    public customer(String telp, String jadwal, int harga, String perawatan){
        this.telp=telp;
        this.jadwal=jadwal;
        this.harga=harga;
        this.perawatan=perawatan;

    }

    public String getIdmember() {
        return idmember;
    }

    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String Alamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getPerawatan() {
        return perawatan;
    }

    public void setPerawatan(String perawatan) {
        this.perawatan = perawatan;
    }

    public void printcustomer(){
        System.out.println("Id Member     : " + this.getIdmember());
        System.out.println("Nama          : " + this.getNama());
        System.out.println("Alamat        : " + this.getAlamat());
        System.out.println("Diskon        : " + this.disc());
        System.out.println("Telp          : " + this.getTelp());
        System.out.println("Jadwal        : " + this.getJadwal());
        System.out.println("Harga         : Rp. " + this.getHarga());
        System.out.println("Perawatan     : " + this.getPerawatan());
        System.out.println("Total Harga   : Rp. " + this.totalharga());
        System.out.println("Booking       : " + this.booking());
        System.out.println("Treatmemt     : Rp." + this.treatmemt());
        System.out.println();
    }
}