/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.data;

/**
 *
 * @author Fadhila
 */
public class Produk {
    private String kode;
    private String merk;
    private String type;
    private String harga;

    public Produk() {
    }

    public Produk(String kode, String merk, String type, String harga) {
        this.kode = kode;
        this.merk = merk;
        this.type = type;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}
