package model;

public class main {
    public static void main(String[] args) {
        //constuktor 1
        customer c1 = new customer();
        //constuktor 2
        c1.setIdmember("001");
        c1.setNama("Aya");
        c1.setAlamat("Martapura");
        c1.setDiskon("");
        //constuktor 3
        c1.setTelp("085332252744");
        c1.setJadwal("2");
        c1.setHarga(250000);
        c1.setPerawatan("Creambath");
        c1.printcustomer();

        //constuktor 1
        customer c2 = new customer();
        //constuktor 2
        c2.setIdmember("002");
        c2.setNama("Nor Hidayah");
        c2.setAlamat("Banjarbaru");
        c2.setDiskon("");
        //constuktor 3
        c2.setTelp("081278450678");
        c2.setJadwal("3");
        c2.setHarga(150000);
        c2.setPerawatan("Smooting");
        c2.printcustomer();

        //constuktor 1
        member c3 = new member();
        //constuktor 2
        c3.setIdmember("003");
        c3.setNama("Iya");
        c3.setAlamat("Banjarmasin");
        c3.setDiskon("");
        //constuktor 3
        c3.setTelp("081278450678");
        c3.setJadwal("2");
        c3.setHarga(250000);
        c3.setPerawatan("Smooting");
        c3.totalharga();
        c3.booking();
        c3.treatmemt();
        c3.setJenis_member("Platinum");
        c3.printcustomer();
    }
}
