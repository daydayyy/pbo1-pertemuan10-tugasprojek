package model;

import java.time.LocalDate;

public class member extends customer{
    private String jenis_member;
    private String masa_berlaku;
    private LocalDate tgl_lahir;

    public member() {
        this.jenis_member = jenis_member;
        this.masa_berlaku = masa_berlaku;
        this.tgl_lahir = tgl_lahir;
    }

    public member(String idmember, String nama, String alamat, String diskon) {
        setIdmember(idmember);
        setNama(nama);
        setAlamat(alamat);
        setDiskon(diskon);

        this.jenis_member = jenis_member;
        this.masa_berlaku = masa_berlaku;
        this.tgl_lahir = tgl_lahir;
    }

    public member(String telp, String jadwal, int harga, String perawatan, String jenis_member, String masa_berlaku, LocalDate tgl_lahir) {
        setTelp(telp);
        setJadwal(jadwal);
        setHarga(harga);
        setPerawatan(perawatan);
        setJenis_member(jenis_member);
        setMasa_berlaku(masa_berlaku);
        setTgl_lahir(tgl_lahir);
    }

    public void potongan(){
        System.out.println("Anda mendapatkan tambahan potongan harga senilai Rp.10.000");
    }

    public boolean jenismember(){
        if(this.jenis_member=="Silver"){
            String jenismember="Anda member Silver mendapatkan tambahan treatment Smooting";
            System.out.println(jenismember);
        } else if(this.jenis_member=="Gold"){
            String jenismember="Anda member Gold mendapatkan tambahan treatment Creambath";
            System.out.println(jenismember);
        }else if (this.jenis_member=="Platinum"){
            String jenismember="Anda member Platinum mendapatkan tambahan free treatment";
            System.out.println(jenis_member);
        }
        return false;
    }

    public String getJenis_member() {
        return jenis_member;
    }

    public void setJenis_member(String jenis_member) {
        this.jenis_member = jenis_member;
    }

    public String getMasa_berlaku() {
        return masa_berlaku;
    }

    public void setMasa_berlaku(String masa_berlaku) {
        this.masa_berlaku = masa_berlaku;
    }

    public LocalDate getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(LocalDate tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    @Override
    public String booking() {
        return super.booking();

    }

    @Override
    public long treatmemt() {
        return super.treatmemt();
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
        System.out.println("Masa Berlaku  : " + this.masa_berlaku);
        System.out.println("Jenis Member  : " + this.jenis_member);


    }
}

