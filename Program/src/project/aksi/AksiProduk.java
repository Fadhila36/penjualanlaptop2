/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.aksi;

import java.sql.SQLException;
import java.util.List;
import project.data.Produk;

/**
 *
 * @author Fadhila
 */
public interface AksiProduk {
    Produk insert(Produk p) throws SQLException;

    void update(Produk p) throws SQLException;

    void delete(String kode) throws SQLException;

    List<Produk> getAll() throws SQLException;
}
