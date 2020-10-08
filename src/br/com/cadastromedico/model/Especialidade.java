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

package br.com.cadastromedico.model;

public class Especialidade {

  private Integer idEspecialidade;
  private String descricaoEspecialidade;
  
  public Especialidade(Integer idEspecialidade, String descricaoEspecialidade) {
    this.idEspecialidade = idEspecialidade;
    this.descricaoEspecialidade = descricaoEspecialidade;
  }
  
  public Integer getIdEspecialidade() {
    return idEspecialidade;
  }
  public void setIdEspecialidade(Integer idEspecialidade) {
    this.idEspecialidade = idEspecialidade;
  }
  public String getDescricaoEspecialidade() {
    return descricaoEspecialidade;
  }
  public void setDescricaoEspecialidade(String descricaoEspecialidade) {
    this.descricaoEspecialidade = descricaoEspecialidade;
  }
  
  @Override
  public String toString() {
    return "Especialidade [idEspecialidade=" + idEspecialidade + ", descricaoEspecialidade=" + descricaoEspecialidade
        + "]";
  }
}
