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
