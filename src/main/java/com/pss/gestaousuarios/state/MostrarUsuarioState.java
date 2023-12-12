package com.pss.gestaousuarios.state;

import com.pss.gestaousuarios.presenter.IncluirUsuarioPresenter;

public class MostrarUsuarioState extends CrudState {

  public MostrarUsuarioState(IncluirUsuarioPresenter incluirPresenter){
    super(incluirPresenter);
  }

  @Override
  public void salvar(){
    incluirPresenter.setState(new InclusaoUsuariosState(incluirPresenter));
  }



}
