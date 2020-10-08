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

public class Atendente extends Funcionario{

  private Integer idAtendente;
  
  public Atendente(Integer idAtendente) {
    this.idAtendente = idAtendente;
  }

  public Integer getIdAtendente() {
    return idAtendente;
  }

  public void setIdAtendente(Integer idAtendente) {
    this.idAtendente = idAtendente;
  }

  @Override
  public String toString() {
    return "Atendente [idAtendente=" + idAtendente + "]";
  }
}
