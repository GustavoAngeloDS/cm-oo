package br.com.cadastromedico.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastromedico.conn.ConnectionFactory;
import br.com.cadastromedico.model.Endereco;
import br.com.cadastromedico.model.Paciente;

public class EnderecoDAO {

  private Connection connection;
    
  private static final String SQLCMD_Incluir = "INSERT INTO ENDERECO_PACIENTE ("
      + "ENDERECO_ID_PACIENTE   \r\n" + 
        "ENDERECO_NR_SEQUENCIAL \r\n" + 
        "ENDERECO_ID_PRINCIPAL  \r\n" + 
        "ENDERECO_NM_RUA        \r\n" + 
        "ENDERECO_NR_NUMERO     \r\n" + 
        "ENDERECO_NM_BAIRRO     \r\n" + 
        "ENDERECO_NM_CIDADE     \r\n" + 
        "ENDERECO_CD_CEP        \r\n" + 
        "ENDERECO_SG_UF         \r\n" + 
        "ENDERECO_ID_FUNRESP    \r\n" + 
        "ENDERECO_DT_INCLUSAO   \r\n" + 
        "ENDERECO_DT_ATUALIZACAO) VALUES (?,?,?,?,?,?,?,?,?,?, GETDATE(), GETDATE())";
  private static final String SQLCMD_TrazerTodos = "SELECT "
      + "ENDERECO_ID_PACIENTE   \r\n" + 
        "ENDERECO_NR_SEQUENCIAL \r\n" + 
        "ENDERECO_ID_PRINCIPAL  \r\n" + 
        "ENDERECO_NM_RUA        \r\n" + 
        "ENDERECO_NR_NUMERO     \r\n" + 
        "ENDERECO_NM_BAIRRO     \r\n" + 
        "ENDERECO_NM_CIDADE     \r\n" + 
        "ENDERECO_CD_CEP        \r\n" + 
        "ENDERECO_SG_UF         \r\n" + 
        "ENDERECO_ID_FUNRESP    \r\n" + 
        "ENDERECO_DT_INCLUSAO   \r\n" + 
        "ENDERECO_DT_ATUALIZACAO FROM ENDERECO_PACIENTE";
  private static final String SQLCMD_Remover = "DELETE FROM ENDERECO_PACIENTE WHERE ENDERECO_ID_PACIENTE = ? AND ENDERECO_NR_SEQUENCIAL = ?";
  private static final String SQLCMD_Atualizar = "UPDATE ENDERECO_PACIENTE"
      + "SET "+
        "ENDERECO_ID_PRINCIPAL   = ? \r\n" + 
        "ENDERECO_NM_RUA         = ? \r\n" + 
        "ENDERECO_NR_NUMERO      = ? \r\n" + 
        "ENDERECO_NM_BAIRRO      = ? \r\n" + 
        "ENDERECO_NM_CIDADE      = ? \r\n" + 
        "ENDERECO_CD_CEP         = ? \r\n" + 
        "ENDERECO_SG_UF          = ? \r\n" + 
        "ENDERECO_ID_FUNRESP     = ? \r\n" + 
        "ENDERECO_DT_ATUALIZACAO = GETDATE()"+
        "WHERE ENDERECO_NR_PACIENTE = ? AND ENDERECO_NR_SEQUENCIAL = ?";
  
  public EnderecoDAO() {
    this.connection = new ConnectionFactory().getConnection();
  }
  
  public void incluir(Paciente paciente) {
    try {
      
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Incluir);
      
      stmt.setInt(1, paciente.getIdPaciente());
      stmt.setInt(2, paciente.getEnderecoPaciente().getSeqEndereco());
      stmt.setString(3, paciente.getEnderecoPaciente().getSituacaoEndereco().getSituacaoEndereco());
      stmt.setString(4, paciente.getEnderecoPaciente().getRuaEndereco());
      stmt.setInt(5, paciente.getEnderecoPaciente().getNumeroEndereco());
      stmt.setString(6, paciente.getEnderecoPaciente().getBairroEndereco());
      stmt.setString(7, paciente.getEnderecoPaciente().getCidadeEndereco());
      stmt.setString(8, paciente.getEnderecoPaciente().getCepEndereco());
      stmt.setString(9, paciente.getEnderecoPaciente().getUfEndereco());
      stmt.setInt(10, 999);
      
      stmt.execute();
      stmt.close();
            
    }catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public void atualizar(Paciente paciente) {
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Atualizar);
      
      stmt.setString(1, paciente.getEnderecoPaciente().getSituacaoEndereco().getSituacaoEndereco());
      stmt.setString(2, paciente.getEnderecoPaciente().getRuaEndereco());
      stmt.setInt(3, paciente.getEnderecoPaciente().getNumeroEndereco());
      stmt.setString(4, paciente.getEnderecoPaciente().getBairroEndereco());
      stmt.setString(5, paciente.getEnderecoPaciente().getCidadeEndereco());
      stmt.setString(6, paciente.getEnderecoPaciente().getCepEndereco());
      stmt.setString(7, paciente.getEnderecoPaciente().getUfEndereco());
      stmt.setInt(8, 999);
      
      stmt.execute();
      stmt.close();
      
    }
    catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public List<Endereco> trazerTodos(Paciente paciente) {
    List<Endereco> enderecos = new ArrayList<Endereco>();
    Endereco endereco = new Endereco();
    
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_TrazerTodos);
      
      stmt.setInt(1, paciente.getIdPaciente());
      
      ResultSet rs = stmt.executeQuery();
      
      while(rs.next()) {
        endereco.setSeqEndereco(rs.getInt("ENDERECO_NR_SEQUENCIAL"));
        //endereco.setSituacaoEndereco(rs.getString("ENDERECO_ID_PRINCIPAL"));
        endereco.setSituacaoEndereco(null);
        endereco.setRuaEndereco(rs.getString("ENDERECO_NM_RUA"));
        endereco.setNumeroEndereco(rs.getInt("ENDERECO_NR_NUMERO"));
        endereco.setBairroEndereco(rs.getString("ENDERECO_NM_BAIRRO"));
        endereco.setCidadeEndereco(rs.getString("ENDERECO_NM_CIDADE"));
        endereco.setCepEndereco(rs.getString("ENDERECO_CD_CEP"));
        endereco.setUfEndereco(rs.getString("ENDERECO_SG_UF"));
      
        enderecos.add(endereco);
      }
      
      rs.close();
      stmt.close();
      
    }catch(SQLException e) {
      e.printStackTrace();
    }
    return enderecos;
  }

  public void remover(Paciente paciente, Integer sequencial) {
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Remover);  
      
      stmt.setInt(1, paciente.getIdPaciente());   
      stmt.setInt(2, sequencial);
      
      stmt.execute();
      stmt.close();
      
    }catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public List<Paciente> trazerTodos(){
    List<Paciente> pacientes = new ArrayList<Paciente>();
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_TrazerTodos);     
      ResultSet rs = stmt.executeQuery();
      
      while(rs.next()) {
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(rs.getInt("PACIENTE_NR_ID"));
        paciente.setCpfPaciente(rs.getString("PACIENTE_NR_CPF"));
        paciente.setDataNascimentoPaciente(rs.getString("PACIENTE_DT_NASC"));
        paciente.setNomePaciente(rs.getString("PACIENTE_DS_NOME"));
        
        pacientes.add(paciente);
        
      }
      rs.close();
      stmt.close();
    }
    catch(SQLException e) {
      e.printStackTrace();
    }
    return pacientes;
  }  
}
