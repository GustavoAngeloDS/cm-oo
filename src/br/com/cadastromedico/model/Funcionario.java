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

import java.util.Date;

import br.com.cadastromedico.enums.EnumsCorporativos.CargoFuncionario;
import br.com.cadastromedico.enums.EnumsCorporativos.SituacaoCadastroFuncionario;

public class Funcionario {

  private Integer idFuncionario;
  private String nomeFuncionario;
  private CargoFuncionario cargoFuncionario;
  private SituacaoCadastroFuncionario situacaoCadastroFuncionario;
  
  private Date dataAdmFuncionario;
  
  public Funcionario() {
    
  }

  public Funcionario(Integer idFuncionario, String nomeFuncionario, CargoFuncionario cargoFuncinario, Date dataAdmFuncionario, SituacaoCadastroFuncionario situacaoCadastroFuncionario) {
    this.idFuncionario = idFuncionario;
    this.nomeFuncionario = nomeFuncionario;
    this.cargoFuncionario = cargoFuncinario;
    this.dataAdmFuncionario = dataAdmFuncionario;
    this.situacaoCadastroFuncionario = situacaoCadastroFuncionario;
  }

  public Integer getIdFuncionario() {
    return idFuncionario;
  }
  public void setIdFuncionario(Integer idFuncionario) {
    this.idFuncionario = idFuncionario;
  }
  public String getNomeFuncionario() {
    return nomeFuncionario;
  }
  public void setNomeFuncionario(String nomeFuncionario) {
    this.nomeFuncionario = nomeFuncionario;
  }
  public CargoFuncionario getCargoFuncinario() {
    return cargoFuncionario;
  }
  public void setCargoFuncinario(CargoFuncionario cargoFuncinario) {
    this.cargoFuncionario = cargoFuncinario;
  }

  public Date getDataAdmFuncionario() {
    return dataAdmFuncionario;
  }

  public void setDataAdmFuncionario(Date dataAdmFuncionario) {
    this.dataAdmFuncionario = dataAdmFuncionario;
  }
  
  public SituacaoCadastroFuncionario getSituacaoCadastroFuncionario() {
    return situacaoCadastroFuncionario;
  }

  public void setSituacaoCadastroFuncionario(SituacaoCadastroFuncionario situacaoCadastroFuncionario) {
    this.situacaoCadastroFuncionario = situacaoCadastroFuncionario;
  }

  @Override
  public String toString() {
    return "Funcionario [idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario
        + ", cargoFuncionario=" + cargoFuncionario + ", situacaoCadastroFuncionario=" + situacaoCadastroFuncionario
        + ", dataAdmFuncionario=" + dataAdmFuncionario + "]";
  }
}
