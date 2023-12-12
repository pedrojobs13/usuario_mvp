package com.pss.gestaousuarios.dao;

import com.pss.gestaousuarios.model.Usuario;
import com.pss.gestaousuarios.util.UsuarioAutorizado;
import java.util.List;

public interface UsuarioDao {
  void inserir(Usuario cliente);

  void getUsuarios(int id);

  public void atualizar(UsuarioAutorizado usuario, int id);

  void deletar(int id);

  List<Usuario> listarUsuarios();
}
