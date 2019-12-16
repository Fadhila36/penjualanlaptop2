/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.data;

/**
 *
 * @author Fadhila
 */
public class Transaksi {
    private String kode;
    private String merk;
    private String status;

    public Transaksi() {
    }

    public Transaksi(String kode, String merk, String status) {
        this.kode = kode;
        this.merk = merk;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
