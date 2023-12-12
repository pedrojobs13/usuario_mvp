package com.pss.gestaousuarios.stategy;

import java.util.Objects;
import java.util.regex.Pattern;

public class NumeroNoNomeStategy implements NomeValidoStategy {
  @Override
  public String checkValidity(String nome) {
    Objects.requireNonNull(nome);
    for (char c : nome.toCharArray()) {
      if (Character.isDigit(c)) {
        return "não tem numeros ";
      }
    }

    return null;
  }
}
