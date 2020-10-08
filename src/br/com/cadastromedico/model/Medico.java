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

public class Medico extends Funcionario{

  private String crmMedico;
  private Especialidade especialidadeMedico; 
  
  public Medico(String crmMedico, Especialidade especialidadeMedico) {
    this.crmMedico = crmMedico;
    this.especialidadeMedico = especialidadeMedico;
  }
  
  public String getCrmMedico() {
    return crmMedico;
  }
  public void setCrmMedico(String crmMedico) {
    this.crmMedico = crmMedico;
  }
  public Especialidade getEspecialidadeMedico() {
    return especialidadeMedico;
  }
  public void setEspecialidadeMedico(Especialidade especialidadeMedico) {
    this.especialidadeMedico = especialidadeMedico;
  }

  @Override
  public String toString() {
    return "Medico [crmMedico=" + crmMedico + ", especialidadeMedico=" + especialidadeMedico + "]";
  }  
}
