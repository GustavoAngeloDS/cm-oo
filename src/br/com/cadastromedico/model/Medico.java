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
