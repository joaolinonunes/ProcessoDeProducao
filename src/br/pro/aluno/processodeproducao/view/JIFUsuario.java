/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.view;

import br.pro.aluno.processodeproducao.data.UsuarioData;
import br.pro.aluno.processodeproducao.model.UsuarioModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João
 */
public class JIFUsuario extends javax.swing.JInternalFrame {

  UsuarioModel obj;
  UsuarioData DAO;
  int acao = 0;
  
    public JIFUsuario() {
        initComponents();
      try {
          obj = new UsuarioModel();
          DAO = new UsuarioData();
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, e.getMessage());
      }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jtRua = new javax.swing.JTextField();
        jtNro = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jlCep = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlcpf = new javax.swing.JLabel();
        jtCpf = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jtSenha = new javax.swing.JTextField();
        jtCep = new javax.swing.JTextField();
        jlRua = new javax.swing.JLabel();
        jlNro = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Senha", "CEP", "Cidade", "Rua", "N°", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        jlPesquisa.setText("Pesquisar");

        jtPesquisa.setEnabled(false);
        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jlEmail.setText("Email");

        jtCidade.setEnabled(false);

        jtRua.setEnabled(false);
        jtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRuaActionPerformed(evt);
            }
        });

        jtNro.setEnabled(false);

        jtEmail.setEnabled(false);

        jlCep.setText("CEP");

        jlCidade.setText("Cidade");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlcpf.setText("CPF");

        jtCpf.setEnabled(false);
        jtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpfActionPerformed(evt);
            }
        });

        jlNome.setText("Nome");

        jtNome.setEnabled(false);
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jlSenha.setText("Senha");

        jtSenha.setEnabled(false);
        jtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSenhaActionPerformed(evt);
            }
        });

        jtCep.setEnabled(false);
        jtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCepActionPerformed(evt);
            }
        });

        jlRua.setText("Rua");

        jlNro.setText("N°");

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtCpf))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtNome))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtSenha))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlCep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtCep))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlRua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtRua)
                                            .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtEmail))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jlNro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(103, Short.MAX_VALUE)
                        .addComponent(jlPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcpf)
                    .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCep)
                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRua)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNro)
                    .addComponent(jtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar)
                    .addComponent(jbNovo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesquisa))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try {
            int linha = jtbDados.getSelectedRow();
            if(linha > -1){
                jtCpf.setText(jtbDados.getValueAt(linha, 0).toString());
                jtNome.setText(jtbDados.getValueAt(linha, 1).toString());
                jtSenha.setText(jtbDados.getValueAt(linha, 2).toString());
                jtCep.setText(jtbDados.getValueAt(linha, 3).toString());
                jtCidade.setText(jtbDados.getValueAt(linha, 4).toString());
                jtRua.setText(jtbDados.getValueAt(linha, 5).toString());
                jtNro.setText(jtbDados.getValueAt(linha, 6).toString());
                jtEmail.setText(jtbDados.getValueAt(linha, 7).toString());
                jtCpf.setEnabled(false);
                jtNome.setEnabled(false);
                jtSenha.setEnabled(false);
                jtCidade.setEnabled(false);
                jtCep.setEnabled(false);
                jtRua.setEnabled(false);
                jtNro.setEnabled(false);
                jtEmail.setEnabled(false);
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbSalvar.setEnabled(false);
                jbCancelar.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked
        ArrayList<UsuarioModel> lista = new ArrayList<>();
    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        try {
            if(jtPesquisa.getText().trim().length()>=1){
                lista = DAO.pesquisar(jtPesquisa.getText());
                DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
                mp.setNumRows(0);//limpar a tabela
                for(UsuarioModel ob : lista){
                    mp.addRow(new String[]{ob.getCpf(), ob.getNome(),ob.getSenha(), ""+ob.getCep(), ob.getCidade(), ob.getRua(), ""+ob.getNro(),ob.getEmail()});
                } //ob.getSenha(), ""+ob.getCep(), ob.getCidade(), ob.getRua(), ""+ob.getNro(), 
            }else if (jtPesquisa.getText().trim().length()==0){
                DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
                mp.setNumRows(0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRuaActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        acao = 1; //Novo - insert
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if(validarCampos()){
                if(preencherObjeto()){
                    if(acao == 1){
                        if(DAO.incluir(obj)){
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                            jbCancelarActionPerformed(evt);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                        }
                    }

                  /*  if(acao==2){
                        if(DAO.editar(obj)){
                            JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
                            jbCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Erro ao salvar");
                        }
                    }*/
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " +e.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSenhaActionPerformed

    private void jtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCepActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.limparCampos(this);
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
        mp.setNumRows(0);
        //        jtPesquisa.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        br.pro.aluno.processodeproducao.extras.Formularios.tratarCampos(this, true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        //        jtPesquisa.setEnabled(false);
        acao = 2;//Atualizar - update
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNro;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlcpf;
    private javax.swing.JTextField jtCep;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNro;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtRua;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTable jtbDados;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        if(jtCpf.getText().trim().length() < 11){
            JOptionPane.showMessageDialog(this, "CPF invalido, CPF deve ter 11 caracteres");
            return false;
        }
  /*       if(jtNome.getText().trim().length() < 4){
            JOptionPane.showMessageDialog(this, "Digite um nome com pelo menos 4 caracteres");
            return false;
        }
          if(jtSenha.getText().trim().length() < 4){
            JOptionPane.showMessageDialog(this, "Digite uma senha com pelo menos 4 caracteres");
            return false;
        }
           if(jtCep.getText().trim().length() < 8){
            JOptionPane.showMessageDialog(this, "CEP invalido, CEP deve ter 8 caracteres");
            return false;
        }
            if(jtCidade.getText().trim().length() < 4){
            JOptionPane.showMessageDialog(this, "Digite o nome da cidade");
            return false;
        }
             if(jtRua.getText().trim().length() < 3){
            JOptionPane.showMessageDialog(this, "Digite o nome da Rua");
            return false;
        }
              if(jtNro.getText().trim().length() < 1){
            JOptionPane.showMessageDialog(this, "Digite o numero da casa");
            return false;
        }
               if(jtEmail.getText().trim().length() < 10){
            JOptionPane.showMessageDialog(this, "Digite o email com pelo menos 10 caracteres");
            return false;
        }*/
        return true;
    }

    private boolean preencherObjeto() {
        obj.setCpf((jtCpf.getText()));
        obj.setNome((jtNome.getText()));
        obj.setSenha((jtSenha.getText()));
        obj.setCep(Integer.parseInt(jtCep.getText()));
        obj.setCidade((jtCidade.getText()));
        obj.setRua((jtRua.getText()));
        obj.setNro(Integer.parseInt(jtNro.getText()));
        obj.setEmail((jtEmail.getText()));
        return true;
    }
}
