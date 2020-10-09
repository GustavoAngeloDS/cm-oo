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

public class Paciente {
  private Integer idPaciente;
  private String nomePaciente;
  private String dataNascimentoPaciente;
  private String cpfPaciente;
  
  private Endereco enderecoPaciente;

  public Paciente() {
    
  }
  
  public Paciente(Integer idPaciente, String nomePaciente, String dataNascimentoPaciente, String cpfPaciente, Endereco enderecoPaciente) {
    this.idPaciente = idPaciente;
    this.nomePaciente = nomePaciente;
    this.dataNascimentoPaciente = dataNascimentoPaciente;
    this.cpfPaciente = cpfPaciente;
    this.enderecoPaciente = enderecoPaciente;
  }
  
  public void setIdPaciente(int idPaciente) {
    this.idPaciente = idPaciente;
  }

  public Integer getIdPaciente() {
    return idPaciente;
  }

  public String getNomePaciente() {
    return nomePaciente;
  }

  public void setNomePaciente(String nomePaciente) {
    this.nomePaciente = nomePaciente;
  }

  public String getDataNascimentoPaciente() {
    return dataNascimentoPaciente;
  }

  public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
    this.dataNascimentoPaciente = dataNascimentoPaciente;
  }

  public String getCpfPaciente() {
    return cpfPaciente;
  }

  public void setCpfPaciente(String cpfPaciente) {
    this.cpfPaciente = cpfPaciente;
  }

  public Endereco getEnderecoPaciente() {
    return enderecoPaciente;
  }

  public void setEnderecoPaciente(Endereco enderecoPaciente) {
    this.enderecoPaciente = enderecoPaciente;
  }

  @Override
  public String toString() {
    return "Paciente [idPaciente=" + idPaciente + ", nomePaciente=" + nomePaciente + ", dataNascimentoPaciente="
        + dataNascimentoPaciente + ", cpfPaciente=" + cpfPaciente + ", enderecoPaciente=" + enderecoPaciente + "]";
  }    
}
