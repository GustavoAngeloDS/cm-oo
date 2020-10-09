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

import br.com.cadastromedico.enums.EnumsCorporativos.SituacaoEndereco;

public class Endereco {

  private String cepEndereco;
  private String ruaEndereco;
  private Integer numeroEndereco;
  private String bairroEndereco;
  private String cidadeEndereco;
  private String ufEndereco;
  private Integer seqEndereco;
  private SituacaoEndereco situacaoEndereco;
  
  public Endereco() {
    
  }
  
  public Endereco(String cepEndereco, String ruaEndereco, Integer numeroEndereco, String bairroEndereco, String cidadeEndereco, String ufEndereco, SituacaoEndereco situacaoEndereco, Integer seqEndereco) {
    this.cepEndereco = cepEndereco;
    this.ruaEndereco = ruaEndereco;
    this.numeroEndereco = numeroEndereco;
    this.bairroEndereco = bairroEndereco;
    this.cidadeEndereco = cidadeEndereco;
    this.ufEndereco = ufEndereco;
    this.situacaoEndereco = situacaoEndereco;
    this.seqEndereco = seqEndereco;
  }

  public String getCepEndereco() {
    return cepEndereco;
  }

  public void setCepEndereco(String cepEndereco) {
    this.cepEndereco = cepEndereco;
  }

  public String getRuaEndereco() {
    return ruaEndereco;
  }

  public void setRuaEndereco(String ruaEndereco) {
    this.ruaEndereco = ruaEndereco;
  }

  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }

  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  public String getBairroEndereco() {
    return bairroEndereco;
  }

  public void setBairroEndereco(String bairroEndereco) {
    this.bairroEndereco = bairroEndereco;
  }

  public String getCidadeEndereco() {
    return cidadeEndereco;
  }

  public void setCidadeEndereco(String cidadeEndereco) {
    this.cidadeEndereco = cidadeEndereco;
  }

  public String getUfEndereco() {
    return ufEndereco;
  }

  public void setUfEndereco(String ufEndereco) {
    this.ufEndereco = ufEndereco;
  }

  public SituacaoEndereco getSituacaoEndereco() {
    return situacaoEndereco;
  }

  public void setSituacaoEndereco(SituacaoEndereco situacaoEndereco) {
    this.situacaoEndereco = situacaoEndereco;
  }

  public Integer getSeqEndereco() {
    return seqEndereco;
  }

  public void setSeqEndereco(Integer seqEndereco) {
    this.seqEndereco = seqEndereco;
  }  
}
