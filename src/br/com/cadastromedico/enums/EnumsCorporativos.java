/***********************************************************************************
====================================================================================
= * Desenvolvedor:                                                                 =
= *                                                                                =
= * Data da altera��o:                                                  Vers�o:    =  
= *                                                                                =
= * Descri��o da altera��o:                                                        =
= *                                                                                =
====================================================================================
= * Desenvolvedor: Gustavo Angelo da Silva                                         =
= *                                                                                =
= * Data da altera��o: 07/10/2020                                       Vers�o:  1 =  
= *                                                                                =
= * Descri��o da altera��o: Primeira vers�o.                                       =
= *                                                                                =
====================================================================================*/

package br.com.cadastromedico.enums;

public class EnumsCorporativos {
  public enum CargoFuncionario{
    Atendente(1), M�dico(2);

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
    Sim("S"), N�o("N");

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
