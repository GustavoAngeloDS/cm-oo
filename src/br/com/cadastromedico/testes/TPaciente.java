package br.com.cadastromedico.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.cadastromedico.enums.EnumsCorporativos.SituacaoEndereco;
import br.com.cadastromedico.jdbc.PacienteDAO;
import br.com.cadastromedico.model.Endereco;
import br.com.cadastromedico.model.Paciente;

public class TPaciente {

  public static void main(String[] args) {
        
    Paciente paciente = new Paciente();
    
    Endereco enderecoPaciente = new Endereco("83500012", "Rua Teste da Cunha", 122, "Bairro Alto", "Curitiba", "PR", SituacaoEndereco.Sim);
    
    paciente.setIdPaciente(3);
    paciente.setNomePaciente("Registro atualizado");
    paciente.setCpfPaciente("10674121122");
    paciente.setDataNascimentoPaciente("01111998");
    paciente.setEnderecoPaciente(enderecoPaciente);

    PacienteDAO dao = new PacienteDAO();
    
    //dao.incluir(paciente);
    
    //System.out.println(dao.procurar(null, "10674121145"));
    
    dao.atualizar(paciente);
    
    List<Paciente> pacientes = new ArrayList<Paciente>();
    pacientes = dao.trazerTodos();
    
    
    
   
    for(int i = 0; i < pacientes.size(); i++) {
      System.out.println(pacientes.get(i));
    }
    System.out.println("********************************");
    
      
    
  }

}
