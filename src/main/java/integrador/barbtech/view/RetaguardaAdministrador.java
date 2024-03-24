package integrador.barbtech.view;

import integrador.barbtech.util.SetIcon;

public class RetaguardaAdministrador extends javax.swing.JFrame {

    SetIcon si = new SetIcon();

    public RetaguardaAdministrador() {
        initComponents();
        si.setIconJMArquivo(jmArquivo);
        si.setIconJMIFechar(jmiFechar);
        si.setIconJMFerramentas(jmFerramentas);
        si.setIconJMCadastrarEditar(jmCadastrarEditar);
        si.setIconJMReativar(jmReativar);
        si.setIconJMICadastrarEditarUsuario(jmiCadastrarEditarUsuario);
        si.setIconJMIReativarUsuario(jmiReativarUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiFechar = new javax.swing.JMenuItem();
        jmFerramentas = new javax.swing.JMenu();
        jmCadastrarEditar = new javax.swing.JMenu();
        jmiCadastrarEditarUsuario = new javax.swing.JMenuItem();
        jmReativar = new javax.swing.JMenu();
        jmiReativarUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");

        jmiFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiFechar.setText("Fechar");
        jmArquivo.add(jmiFechar);

        jMenuBar1.add(jmArquivo);

        jmFerramentas.setMnemonic('F');
        jmFerramentas.setText("Ferramentas");

        jmCadastrarEditar.setMnemonic('C');
        jmCadastrarEditar.setText("Cadastrar/Editar");

        jmiCadastrarEditarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCadastrarEditarUsuario.setText("Usuário");
        jmiCadastrarEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastrarEditarUsuarioActionPerformed(evt);
            }
        });
        jmCadastrarEditar.add(jmiCadastrarEditarUsuario);

        jmFerramentas.add(jmCadastrarEditar);

        jmReativar.setText("Reativar");

        jmiReativarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiReativarUsuario.setText("Usuário");
        jmReativar.add(jmiReativarUsuario);

        jmFerramentas.add(jmReativar);

        jMenuBar1.add(jmFerramentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastrarEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastrarEditarUsuarioActionPerformed
        // TODO add your handling code here:
        UsuarioView uv = new UsuarioView();
        jDesktopPane1.add(uv);

        // Centralize e exiba a janela
        uv.setLocation((jDesktopPane1.getWidth() - uv.getWidth()) / 2, (jDesktopPane1.getHeight() - uv.getHeight()) / 2);
        uv.setVisible(true);

    }//GEN-LAST:event_jmiCadastrarEditarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastrarEditar;
    private javax.swing.JMenu jmFerramentas;
    private javax.swing.JMenu jmReativar;
    private javax.swing.JMenuItem jmiCadastrarEditarUsuario;
    private javax.swing.JMenuItem jmiFechar;
    private javax.swing.JMenuItem jmiReativarUsuario;
    // End of variables declaration//GEN-END:variables
}
