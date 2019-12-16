/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.data;

/**
 *
 * @author Fadhila
 */
public class User {
    private String id_user;
    private String nama;
    private String email;
    private String jenis;

    public User() {
    }

    public User(String id_user, String nama, String email, String jenis) {
        this.id_user = id_user;
        this.nama = nama;
        this.email = email;
        this.jenis = jenis;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}
