/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.aksi;

import project.data.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Fadhila
 */
public interface AksiUser {
    User insert(User u) throws SQLException;

    void update(User u) throws SQLException;

    void delete(String Id_user) throws SQLException;

    List<User> getAll() throws SQLException;

}
