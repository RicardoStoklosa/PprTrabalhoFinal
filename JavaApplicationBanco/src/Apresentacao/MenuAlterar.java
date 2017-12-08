/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import EDA.*;
import static EDA.Toolbox.encrypt;
import Negocio.NegocioFacade;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class MenuAlterar extends javax.swing.JFrame {
    
    boolean modo_alteracao = false;
    /**
     * Creates new form MenuCadastrar
     */
    public MenuAlterar() {
        initComponents();
        ativarModoConsulta();
    }
    
    private void ativarModoConsulta(){
        cpf.setEnabled(true);
        nome.setEnabled(false);
        endereco.setEnabled(false);
        nasc.setEnabled(false);
        jToggleButton1.setText("Consultar");
        jDelete.setEnabled(false);
        modo_alteracao = false;
    }
    
    private void ativarModoAlteracao(){
        cpf.setEnabled(false);
        nome.setEnabled(true);
        endereco.setEnabled(true);
        nasc.setEnabled(true);
        jToggleButton1.setText("Alterar");
        jDelete.setEnabled(true);
        modo_alteracao = true;
        
    }
    
    private void limparTela(){
        nome.setText("");
        cpf.setText("");
        endereco.setText("");
        nasc.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        nasc = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Cpf:");

        jLabel3.setText("Ano de Nascimento:");

        jLabel4.setText("Endereço:");

        jToggleButton1.setText("Adicionar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jDelete.setText("Deletar");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(cpf)
                            .addComponent(nasc)
                            .addComponent(endereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jDelete)
                        .addGap(76, 76, 76)
                        .addComponent(jToggleButton1)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jToggleButton1)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if( modo_alteracao == false ){ // esta no modo de consulta de código
            consultaReg();
        }
        else{ // está no modo de alteração
            alterarRegistro();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    private void consultaReg(){
        String cod = cpf.getText();
        Usuario usuario = NegocioFacade.getConta(cod);
        if( usuario == null ){ // Se não encontrou o livro mostra uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Não foi encontrado este usuario!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{ // Se encontrou o livro então:
            // bloqueia o campo de código e abilita os demais
            ativarModoAlteracao();
            
            // preenche os valores existentes nos campos
            nome.setText( usuario.getNome());
            nasc.setText( Integer.toString(usuario.getNasc()) );
            endereco.setText(usuario.getEndereco());
            
            // altera o texto do botão de consultar para alterar
            ativarModoAlteracao();
        }
        
    }
    private void alterarRegistro(){
        String cod = cpf.getText();
        Usuario usuario = NegocioFacade.getConta(cod);
        Usuario usr = new Usuario(nome.getText(),cod,Integer.parseInt(nasc.getText()),endereco.getText(),cod,usuario.getSenha());
        Operacao op = NegocioFacade.modificarCliente(usr);
        if( !op.getStatus() ){
            JOptionPane.showMessageDialog(this, "Não foi possível alterar o Cliente: \n"+op.getErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int opcao = JOptionPane.showConfirmDialog(this, "Dados alterados com sucesso.\n"
                                              + "Deseja alterar outro Cliente?", "Operação OK", JOptionPane.YES_NO_OPTION);
            if( opcao == JOptionPane.OK_OPTION ){
                limparTela();
                ativarModoConsulta();
            }
            else{
                this.dispose();
            }
        }
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Main.tela = new Login();
        Main.tela.setVisible( true );
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        String cod = cpf.getText();
        Usuario usr = NegocioFacade.getConta(cod);
        Operacao op = NegocioFacade.excluirCliente(usr);
        if( !op.getStatus() ){
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o Cliente: \n"+op.getErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int opcao = JOptionPane.showConfirmDialog(this, "Cliente excluido com sucesso.\n"
                                              + "Deseja alterar outro Cliente?", "Operação OK", JOptionPane.YES_NO_OPTION);
            if( opcao == JOptionPane.OK_OPTION ){
                limparTela();
                ativarModoConsulta();
            }
            else{
                this.dispose();
            }
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nasc;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
