/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AndroidDev extends Pendaftaran implements Seleksi {
    public AndroidDev(String NIK, String nama, int tesTulis, int tesCoding, int tesWawancara){
        super(NIK, nama, tesTulis, tesCoding, tesWawancara);
    }

    public void inputTesTulis(int tesTulis) {
        this.tesTulis = tesTulis;
    }

    public void inputTesCoding(int tesCoding) {
        this.tesCoding = tesCoding;
    }

    public void inputTesWawancara(int tesWawancara) {
        this.tesWawancara = tesWawancara;
    }

    @Override
    public double hitungNilai() {
        return (0.2 * super.tesTulis) + (0.5 * super.tesCoding) + (0.3 * super.tesWawancara);
    }

    @Override
    public String keterangan() {
        if(this.hitungNilai() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Android Development\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Android Development\n";
    }
}
