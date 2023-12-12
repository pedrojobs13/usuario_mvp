/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaousuarios.state;

import com.pss.gestaousuarios.presenter.IncluirUsuarioPresenter;
import com.pss.gestaousuarios.view.IncluirUsuariosView;

/**
 * @author pedro
 */
public abstract class CrudState {
  protected IncluirUsuariosView incluirView;
  protected IncluirUsuarioPresenter incluirPresenter;

  public CrudState(IncluirUsuarioPresenter incluirPresenter) {
    this.incluirPresenter = incluirPresenter;
    this.incluirView = this.incluirPresenter.getView();
  }

  public void mostrarUsuarios() {
    throw new RuntimeException("Não é possível mostrar funcionarios");
  }

  public void salvar() {
    throw new RuntimeException("Não é possível salvar funcionarios");
  }

}
