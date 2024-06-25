package br.com.zorp.curso.controller;

import br.com.zorp.curso.model.Aluno;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

  @PostMapping
  public String adicionar(@RequestBody Aluno aluno) {
    if (aluno.validarIdade()) {
      return aluno.getNome() + " Cadastrado com sucesso!";
    }
    return "Idade Inválida!";
  }

}
