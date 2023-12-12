/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss.gestaousuarios.state;

import com.pss.gestaousuarios.presenter.IncluirUsuarioPresenter;

/**
 * @author pedro
 */
public class InclusaoUsuariosState extends CrudState {
  public InclusaoUsuariosState(IncluirUsuarioPresenter presenter) {
    super(presenter);
  }

  @Override
  public void mostrarUsuarios() {
    this.incluirPresenter.mostrarUsuarios();
  }
}
