package com.pss.gestaousuarios.stategy;

import java.util.Objects;

public class TamanhoStategy implements NomeValidoStategy {
  private final int TAMANHO_MINIMO = 4;

  @Override
  public String checkValidity(String nome) {
    Objects.requireNonNull(nome);
    return tamanhominimo(nome);
  }

  private String tamanhominimo(String nome) {
    if (nome.length() < TAMANHO_MINIMO) {
      return "o nome de usuário deve ser maior que " + TAMANHO_MINIMO;
    }
    return null;
  }
}
