/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.input;

import project.aksi.AksiTransaksi;
import project.koneksi.Database;
import project.data.Transaksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fadhila
 */
public class InputTransaksi implements AksiTransaksi {

    public Transaksi insert(Transaksi t) throws SQLException {
        PreparedStatement st = Database.getConnection().prepareStatement("insert into transaksi values(?,?,?)");
        st.setString(1, t.getKode());
        st.setString(2, t.getMerk());
        st.setString(3, t.getStatus());
        st.executeUpdate();
        return t;
    }

    public void update(Transaksi t) throws SQLException {
        PreparedStatement st = Database.getConnection()
                .prepareStatement("update transaksi set merk=?,status=? where kode=?");
        st.setString(1, t.getMerk());
        st.setString(2, t.getStatus());
        st.setString(3, t.getKode());
        st.executeUpdate();
    }

    public void delete(String Kode) throws SQLException {
        PreparedStatement st = Database.getConnection().prepareStatement("delete from transaksi where kode=?");
        st.setString(1, Kode);
        st.executeUpdate();
    }

    public List<Transaksi> getAll() throws SQLException {
        Statement st = Database.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from transaksi");
        List<Transaksi> list = new ArrayList<Transaksi>();
        while (rs.next()) {
            Transaksi t = new Transaksi();
            t.setKode(rs.getString("Kode"));
            t.setMerk(rs.getString("Merk"));
            t.setStatus(rs.getString("Status"));
            list.add(t);
        }
        return list;
    }
}
