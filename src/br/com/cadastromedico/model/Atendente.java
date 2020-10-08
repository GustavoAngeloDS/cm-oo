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
