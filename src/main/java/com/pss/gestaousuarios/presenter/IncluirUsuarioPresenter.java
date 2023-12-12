package com.pss.gestaousuarios.presenter;

import com.pss.gestaousuarios.dao.UsuarioDao; // Importe a interface ou classe correta para sua DAO
import com.pss.gestaousuarios.model.Usuario;
import com.pss.gestaousuarios.state.CrudState;
import com.pss.gestaousuarios.view.IncluirUsuariosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncluirUsuarioPresenter {

  private IncluirUsuariosView view;
  private UsuarioDao usuarioDao;
  private CrudState state;

  public IncluirUsuarioPresenter(UsuarioDao usuarioDao) {
    this.usuarioDao = usuarioDao;
    view = new IncluirUsuariosView();

    view.getBtnFechar().addActionListener(e -> fechar());
    view.getBtnSalvar().addActionListener(e -> salvar());

    view.setVisible(true);
  }

  private void fechar() {
    view.dispose();
  }

  private void salvar() {
    String nome = view.getTxtNome().getText();
    String senha = view.getTxtSalario().getText();
    String estadoText = view.getTxtEstado().getText();
    String tipo = view.getTxtTipo().getText();
    int estado = Integer.parseInt(estadoText);

    Usuario usuario = new Usuario(nome, senha, estado, tipo);

    usuarioDao.inserir(usuario);

    fechar();
  }

  public IncluirUsuariosView getView() {
    return view;
  }

  public CrudState getState() {
    return state;
  }

  public void setState(CrudState state) {
    this.state = state;
  }

  public void mostrarUsuarios() {
    // Lógica para mostrar usuários na view de inclusão de usuários
    // por exemplo, atualizar a tabela de usuários na view
    // ou exibir uma mensagem na interface
  }
}
