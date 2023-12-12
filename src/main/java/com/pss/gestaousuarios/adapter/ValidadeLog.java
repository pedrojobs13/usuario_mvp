package com.pss.gestaousuarios.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidadeLog {
  private List<ValidadeSenhaAdapter> validades = new ArrayList<>();
  private List<String> recusas = new ArrayList<>();

  public ValidadeLog() {
    validades.add(new ValidadorAdapter());
  }

  public List<String> verificar(String senha) {

    for (ValidadeSenhaAdapter validade : validades) {
      recusas.addAll(validade.checkValidity(senha));
    }

    return Collections.unmodifiableList(recusas);
  }
}
