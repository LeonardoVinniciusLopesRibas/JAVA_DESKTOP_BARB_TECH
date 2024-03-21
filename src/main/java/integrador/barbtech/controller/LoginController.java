package integrador.barbtech.controller;

import integrador.barbtech.dao.LoginDao;
import integrador.barbtech.interfaces.ControllerInterface;
import integrador.barbtech.view.RetaguardaView;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController implements ControllerInterface {

    LoginDao ld = new LoginDao();

    @Override
    public void saveController(Object... valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteController(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void readController(Object... valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private int userId;

    public void loginController(String usuario, String senha, JFrame loginMain) {
        if (usuario.equals("")) {
            JOptionPane.showMessageDialog(null, "USUÁRIO NÃO FOI PREENCHIDO");
        } else if (senha.equals("")) {
            JOptionPane.showMessageDialog(null, "SENHA NÃO FOI PREENCHIDA");
        } else {
            StringBuilder hexBuilder = new StringBuilder();
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");

                byte[] hashCriptografado = digest.digest(senha.getBytes());

                for (byte b : hashCriptografado) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) {
                        hexBuilder.append('0');
                    }
                    hexBuilder.append(hex);

                }

            } catch (NoSuchAlgorithmException nsae) {
                JOptionPane.showMessageDialog(null, "integrador.barbtech.controller.LoginController" + nsae);
            }
            String senhaCriptografada = hexBuilder.toString();
            int userId = ld.getUserId(usuario, senhaCriptografada);

            if (userId != -1) {
                // Armazena o ID do usuário logado na variável de classe
                this.userId = userId;

                // Cria uma instância da tela RetaguardaView e a exibe
                RetaguardaView retaguardaView = new RetaguardaView();
                loginMain.dispose();
                retaguardaView.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            }
        }
    }

    public int getUserId() {
        return userId;
    }

}
