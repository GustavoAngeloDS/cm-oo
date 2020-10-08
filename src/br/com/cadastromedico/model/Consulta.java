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

import br.com.cadastromedico.enums.EnumsCorporativos.SituacaoConsulta;

public class Consulta {

  private Integer idConsulta;
  private Date dataConsulta;
  private String horarioConsulta;
  
  private Paciente pacienteConsulta;
  private Medico medicoConsulta;
  private Atendente atendenteConsulta;
  
  private SituacaoConsulta situacaoConsulta;
  
  public Consulta(Integer idConsulta, Date dataConsulta, String horarioConsulta, Paciente pacienteConsulta, Medico medicoConsulta, Atendente atendenteConsulta, SituacaoConsulta situacaoConsulta) {
    this.idConsulta = idConsulta;
    this.dataConsulta = dataConsulta;
    this.horarioConsulta = horarioConsulta;
    this.pacienteConsulta = pacienteConsulta;
    this.medicoConsulta = medicoConsulta;
    this.atendenteConsulta = atendenteConsulta;
    this.situacaoConsulta = situacaoConsulta;
  }
  
  public Integer getIdConsulta() {
    return idConsulta;
  }
  public void setIdConsulta(Integer idConsulta) {
    this.idConsulta = idConsulta;
  }
  public Date getDataConsulta() {
    return dataConsulta;
  }
  public void setDataConsulta(Date dataConsulta) {
    this.dataConsulta = dataConsulta;
  }
  public String getHorarioConsulta() {
    return horarioConsulta;
  }
  public void setHorarioConsulta(String horarioConsulta) {
    this.horarioConsulta = horarioConsulta;
  }
  public Paciente getPacienteConsulta() {
    return pacienteConsulta;
  }
  public void setPacienteConsulta(Paciente pacienteConsulta) {
    this.pacienteConsulta = pacienteConsulta;
  }
  public Medico getMedicoConsulta() {
    return medicoConsulta;
  }
  public void setMedicoConsulta(Medico medicoConsulta) {
    this.medicoConsulta = medicoConsulta;
  }
  public Atendente getAtendenteConsulta() {
    return atendenteConsulta;
  }
  public void setAtendenteConsulta(Atendente atendenteConsulta) {
    this.atendenteConsulta = atendenteConsulta;
  }
   
  public SituacaoConsulta getSituacaoConsulta() {
    return situacaoConsulta;
  }

  public void setSituacaoConsulta(SituacaoConsulta situacaoConsulta) {
    this.situacaoConsulta = situacaoConsulta;
  }

  @Override
  public String toString() {
    return "Consulta [idConsulta=" + idConsulta + ", dataConsulta=" + dataConsulta + ", horarioConsulta="
        + horarioConsulta + ", pacienteConsulta=" + pacienteConsulta + ", medicoConsulta=" + medicoConsulta
        + ", atendenteConsulta=" + atendenteConsulta + "]";
  }  
}
