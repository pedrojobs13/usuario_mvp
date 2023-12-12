package com.pss.gestaousuarios.presenter;

import com.pss.gestaousuarios.dao.UsuarioDao;
import com.pss.gestaousuarios.model.Usuario;
import com.pss.gestaousuarios.view.ConsultarUsuariosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ConsultarFuncionariosPresenter {
  private ConsultarUsuariosView view;
  private UsuarioDao usuarioDao;
  private DefaultTableModel tmFuncionarios;

  public ConsultarFuncionariosPresenter(UsuarioDao usuarioDao) {
    this.usuarioDao = usuarioDao;
    view = new ConsultarUsuariosView();

    tmFuncionarios = new DefaultTableModel(new Object[][] {}, new String[] {"nome", "salario"});
    view.getTblFuncionarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Preencher a tabela com os dados vindos da UsuarioDao
    preencherTabela();

    view.getBtnFechar().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        fechar();
      }
    });

    view.setVisible(true);
  }

  private void preencherTabela() {
    tmFuncionarios.setRowCount(0); // Limpar a tabela antes de preencher novamente

    List<Usuario> usuarios = usuarioDao.listarUsuarios();

    for (Usuario usuario : usuarios) {
      tmFuncionarios.addRow(new Object[] {usuario.getNome(), usuario.getSenha()});
    }

    view.getTblFuncionarios().setModel(tmFuncionarios);
  }

  private void fechar() {
    view.dispose();
  }
}
