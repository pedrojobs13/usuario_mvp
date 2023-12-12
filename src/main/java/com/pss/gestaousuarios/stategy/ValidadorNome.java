package com.pss.gestaousuarios.stategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidadorNome {

  private final List<NomeValidoStategy> validadores;
  private List<String> errosValidade = new ArrayList<>();

  public ValidadorNome() {
    this.validadores = Arrays.asList(new TamanhoStategy(), new NumeroNoNomeStategy());
  }

  public List<String> validar(String nome) {
    for (NomeValidoStategy validador : validadores) {
      String resultado = validador.checkValidity(nome);
      if (resultado != null) {
        errosValidade.add(resultado);
      }
    }
    return errosValidade;
  }
}
