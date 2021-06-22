package model;

import java.time.*;
public class customer {
    // atribut
    String idmember;
    String nama;
    int alamat;
    String diskon;
    int telp;
    String jadwal;
    int harga;
    String karyawan;
    String perawatan;

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
}

    //constructor
    