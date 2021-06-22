package model;

import java.time.LocalDate;

public class member extends customer{
    String jenis_member;
    String masa_berlaku;
    LocalDate tgl_lahir;

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
}

