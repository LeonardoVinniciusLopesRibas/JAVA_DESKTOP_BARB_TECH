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

    public boolean loginDao(String usuario, String senhacriptografada) {
    boolean usuarioExiste = false;

    sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";

    try {
        pstmt = ConnectionDb.abreConnection().prepareStatement(sql);
        // Define os valores dos parâmetros
        pstmt.setString(1, usuario);
        pstmt.setString(2, senhacriptografada);
        rs = pstmt.executeQuery();
                
        // Verifica se há algum resultado retornado
        if (rs.next()) {
            // Se houver um resultado, significa que o usuário existe e a senha está correta
            usuarioExiste = true;
        }
    } catch (SQLException sex) {
        JOptionPane.showMessageDialog(null, sex);
        System.out.println("integrador.barbtech.dao.LoginDao.loginDao()"+sex);
    }
    return usuarioExiste;
}


    /*
    
    public void consultaDao(Object... valor) throws SQLException {
        DefaultTableModel tabela = (DefaultTableModel) valor[1];
        if ("".equals((String) valor[0])) {
            sql = "SELECT * FROM tipocontato";
        } else {
            //sql = "SELECT * FROM tipocontato WHERE descricao LIKE '%" + valor[0] + "%'";
            sql = "SELECT * FROM tipocontato WHERE LOWER(descricao) LIKE LOWER('%" + valor[0] + "%')";

        }

        //System.out.println("Executando consulta: " + sql); // Log de diagnóstico
        pstmt = ConexaoBanco.abreConnection().prepareStatement(sql);
        rs = pstmt.executeQuery();
        //int count = 0; // Contador para verificar a quantidade de registros

        while (rs.next()) {
            //count++;    
            tabela.addRow(
                    new Object[]{
                        rs.getInt("id"),
                        rs.getString("descricao")
                    }
            );
        }
        //System.out.println("Registros encontrados: " + count); // Log de diagnóstico
        pstmt.close();
    }
    
    
    
     */
}
