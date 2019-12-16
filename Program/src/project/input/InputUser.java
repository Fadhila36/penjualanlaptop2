/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.input;

import project.aksi.AksiUser;
import project.koneksi.Database;
import project.data.User;
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
public class InputUser implements AksiUser {

    public User insert(User u) throws SQLException {
        PreparedStatement st = Database.getConnection().prepareStatement("insert into user values(?,?,?,?)");
        st.setString(1, u.getId_user());
        st.setString(2, u.getNama());
        st.setString(3, u.getEmail());
        st.setString(4, u.getJenis());
        st.executeUpdate();
        return u;
    }

    public void update(User u) throws SQLException {
        PreparedStatement s = Database.getConnection()
                .prepareStatement("update user set id_user=?,nama=?,jenis=? where email=?");
        s.setString(1, u.getId_user());
        s.setString(2, u.getNama());
        s.setString(3, u.getJenis());
        s.setString(4, u.getEmail());
        s.executeUpdate();
    }

    public void delete(String Id_user) throws SQLException {
        PreparedStatement st = Database.getConnection().prepareStatement("delete from user where id_user=?");
        st.setString(1, Id_user);
        st.executeUpdate();
    }

    public List<User> getAll() throws SQLException {
        Statement st = Database.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from user");
        List<User> list = new ArrayList<User>();
        while (rs.next()) {
            User s = new User();
            s.setId_user(rs.getString("Id_user"));
            s.setNama(rs.getString("Nama"));
            s.setEmail(rs.getString("Email"));
            s.setJenis(rs.getString("Jenis"));
            list.add(s);
        }
        return list;
    }

}
