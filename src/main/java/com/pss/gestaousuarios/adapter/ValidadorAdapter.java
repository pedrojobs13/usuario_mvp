package com.pss.gestaousuarios.adapter;

import com.pss.senha.validacao.ValidadorSenha;
import java.util.List;

public class ValidadorAdapter implements ValidadeSenhaAdapter {
  private ValidadorSenha passwordValidator;

  public ValidadorAdapter() {
    this.passwordValidator = new ValidadorSenha();
  }

  // cria um adaptador para a classe ValidadorSenha
  @Override
  public List<String> checkValidity(String senha) {
    return passwordValidator.validar(senha);
  }
}
