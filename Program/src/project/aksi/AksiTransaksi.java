/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.aksi;

import project.data.Transaksi;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Fadhila
 */
public interface AksiTransaksi {
    Transaksi insert(Transaksi t) throws SQLException;

    void update(Transaksi t) throws SQLException;

    void delete(String Kode) throws SQLException;

    List<Transaksi> getAll() throws SQLException;

}
