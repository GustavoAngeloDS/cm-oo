package br.com.cadastromedico.testes;

import br.com.cadastromedico.enums.EnumsCorporativos.CargoFuncionario;
import br.com.cadastromedico.enums.EnumsCorporativos.SituacaoCadastroFuncionario;
import br.com.cadastromedico.model.Funcionario;

public class TFuncionario {

  public static void main(String[] args) {
    
    Funcionario fnc = new Funcionario();
    
    fnc.setIdFuncionario(1);
    fnc.setNomeFuncionario("Gustavo Angelo da Silva");
    fnc.setCargoFuncinario(CargoFuncionario.Atendente);
    fnc.setSituacaoCadastroFuncionario(SituacaoCadastroFuncionario.Ativo);

    System.out.println(fnc.toString());
    System.out.println(fnc.getCargoFuncinario().getCargoFuncionario());
    
  }
}
