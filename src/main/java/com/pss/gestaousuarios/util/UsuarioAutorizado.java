package com.pss.gestaousuarios.util;

import com.pss.gestaousuarios.model.Usuario;

public class UsuarioAutorizado {
  public static final String DESAUTORIZADO = "Não autorizado";
  public static final String AUTORIZADO = "Autorizado";

  public static final String USUARIO = "Usuario";
  public static final String ADMINISTRADOR = "Administrador";

  private long id;
  private String nome;
  private String tipo;
  private String estado;

  public UsuarioAutorizado(long id, String nome, int estado, int tipo) {
    this.id = id;
    this.nome = nome;
    // crie um stategy para o código abaixo
    if (estado == Usuario.AUTORIZADO) {
      this.estado = AUTORIZADO;
    } else {
      this.estado = DESAUTORIZADO;
    }

    if (tipo == Usuario.ADMINISTRADOR) {
      this.tipo = ADMINISTRADOR;
    } else {
      this.tipo = USUARIO;
    }
  }

  public UsuarioAutorizado(UsuarioAutorizado user) {
    this.id = user.id;
    this.nome = user.nome;
    this.estado = user.estado;
    this.tipo = user.tipo;
  }

  public long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getEstado() {
    return estado;
  }

  public String getTipo() {
    return tipo;
  }

  void setEstado(String state) {
    this.estado = state;
  }
}
