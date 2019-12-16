/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.input;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import project.data.Produk;
import project.aksi.AksiProduk;
import project.koneksi.Database;

/**
 *
 * @author Fadhila
 */
public class InputProduk implements AksiProduk {

    public Produk insert(Produk p) throws SQLException {
        PreparedStatement st = Database.getConnection().prepareStatement("insert into produk values(?,?,?,?)");
        st.setString(1, p.getKode());
        st.setString(2, p.getMerk());
        st.setString(3, p.getType());
        st.setString(4, p.getHarga());
        st.executeUpdate();
        return p;
    }

    public void update(Produk p) throws SQLException {
        PreparedStatement st = Database.getConnection()
                .prepareStatement("update produk set merk=?,type=?,harga=? where kode=?");
        st.setString(1, p.getMerk());
        st.setString(2, p.getType());
        st.setString(3, p.getHarga());
        st.setString(4, p.getKode());
        st.executeUpdate();
    }

    public void delete(String kode) throws SQLException {
        PreparedStatement st = Database.getConnection().prepareStatement("delete from produk where kode=?");
        st.setString(1, kode);
        st.executeUpdate();
    }

    public List<Produk> getAll() throws SQLException {
        Statement st = Database.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from produk");
        List<Produk> list = new ArrayList<Produk>();
        while (rs.next()) {
            Produk p = new Produk();
            p.setKode(rs.getString("kode"));
            p.setMerk(rs.getString("merk"));
            p.setType(rs.getString("type"));
            p.setHarga(rs.getString("harga"));
            list.add(p);
        }
        return list;
    }
}
