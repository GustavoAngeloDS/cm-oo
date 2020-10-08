/***********************************************************************************
====================================================================================
= * Desenvolvedor:                                                                 =
= *                                                                                =
= * Data da alteração:                                                  Versão:    =  
= *                                                                                =
= * Descrição da alteração:                                                        =
= *                                                                                =
====================================================================================
= * Desenvolvedor: Gustavo Angelo da Silva                                         =
= *                                                                                =
= * Data da alteração: 07/10/2020                                       Versão:  1 =  
= *                                                                                =
= * Descrição da alteração: Primeira versão.                                       =
= *                                                                                =
====================================================================================*/

package br.com.cadastromedico.enums;

public class EnumsCorporativos {
  public enum CargoFuncionario{
    Atendente(1), Médico(2);

    private final Integer cargoFuncionario;
    
    CargoFuncionario(int i) {
      cargoFuncionario = i;
    }
    
    public int getCargoFuncionario() {
      return cargoFuncionario;
    }
  }

  public enum SituacaoCadastroFuncionario{
    Ativo(1), Inativo(9);

    private final Integer situacaoCadastroFuncionario;
    
    SituacaoCadastroFuncionario(int i) {
      situacaoCadastroFuncionario = i;
    }
    
    public int getCargoFuncionario() {
      return situacaoCadastroFuncionario;
    }
    
  }
  
  public enum SituacaoEndereco{
    Sim("S"), Não("N");

    private final String situacaoEndereco;
    
    SituacaoEndereco(String string) {
      situacaoEndereco = string;
    }
    
    public String getSituacaoEndereco() {
      return situacaoEndereco;
    } 
  }

  public enum SituacaoConsulta{
    Marcada(1), Realizada(2), Adiada(3), Cancelada(9);

    private final Integer situacaoConsulta;
    
    SituacaoConsulta(int i) {
      situacaoConsulta = i;
    }  
    
    public Integer getSituacaoConsulta() {
      return situacaoConsulta;
    }
  }
}
