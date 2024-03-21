package integrador.barbtech.dao;

import integrador.barbtech.interfaces.DaoInterfaces;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDao implements DaoInterfaces {

    String sql;
    PreparedStatement pstmt = null;
    ResultSet rs;

    @Override
    public void saveDao(Object... valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteDao(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void readDao(Object... valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    public int getUserId(String usuario, String senhaCriptografada) {
        int userId = -1; 

        sql = "SELECT id FROM usuario WHERE usuario = ? AND senha = ?";

        try {
            pstmt = ConnectionDb.abreConnection().prepareStatement(sql);
            pstmt.setString(1, usuario);
            pstmt.setString(2, senhaCriptografada);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                userId = rs.getInt("id");
            }
        } catch (SQLException sex) {
            JOptionPane.showMessageDialog(null, sex);
            System.out.println("integrador.barbtech.dao.LoginDao.getUserId()" + sex);
        }

        return userId;
    }
}
