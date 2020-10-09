package br.com.cadastromedico.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.cadastromedico.conn.ConnectionFactory;
import br.com.cadastromedico.model.Paciente;

public class PacienteDAO {

  private Connection connection;
  private static final String SQLCMD_GetNrId = "SELECT COALESCE(MAX(PACIENTE_NR_ID), 0)+1 AS PACIENTE_NR_ID FROM PACIENTE";
  
  private static final String SQLCMD_Incluir = "INSERT INTO PACIENTE ("
      + "PACIENTE_NR_ID        ,\r\n" + 
        "PACIENTE_NR_CPF       ,\r\n" + 
        "PACIENTE_DT_NASC      ,\r\n" + 
        "PACIENTE_DS_NOME      ,\r\n" + 
        "PACIENTE_ID_FUNRESP   ,\r\n" + 
        "PACIENTE_DT_INCLUSAO  ,\r\n" + 
        "PACIENTE_DT_ATUALIZACAO) VALUES (?,?,?,?,?,GETDATE(),GETDATE())";
  private static final String SQLCMD_Procurar = 
      "SELECT "
      + "PACIENTE_NR_ID          ,\r\n" + 
        "PACIENTE_NR_CPF         ,\r\n" + 
        "PACIENTE_DT_NASC        ,\r\n" + 
        "PACIENTE_DS_NOME        ,\r\n" + 
        "PACIENTE_ID_FUNRESP     ,\r\n" + 
        "PACIENTE_DT_INCLUSAO    ,\r\n" + 
        "PACIENTE_DT_ATUALIZACAO FROM PACIENTE WHERE PACIENTE_NR_ID = REPLACE(?, 0, NULL) OR PACIENTE_NR_CPF = ?";
  private static final String SQLCMD_TrazerTodos = 
      "SELECT "
      + "PACIENTE_NR_ID          ,\r\n" + 
        "PACIENTE_NR_CPF         ,\r\n" + 
        "PACIENTE_DT_NASC        ,\r\n" + 
        "PACIENTE_DS_NOME        ,\r\n" + 
        "PACIENTE_ID_FUNRESP     ,\r\n" + 
        "PACIENTE_DT_INCLUSAO    ,\r\n" + 
        "PACIENTE_DT_ATUALIZACAO FROM PACIENTE";
  private static final String SQLCMD_Remover = "DELETE FROM PACIENTE WHERE PACIENTE_NR_ID = ?";
  private static final String SQLCMD_Atualizar = "UPDATE PACIENTE "
  + "SET PACIENTE_NR_CPF         = ?,\r\n" + 
        "PACIENTE_DT_NASC        = ?,\r\n" + 
        "PACIENTE_DS_NOME        = ?,\r\n" + 
        "PACIENTE_ID_FUNRESP     = ?,\r\n" + 
        "PACIENTE_DT_ATUALIZACAO = GETDATE() \r\n" +
        "WHERE PACIENTE_NR_ID = ?";
  
  
  public PacienteDAO() {
    this.connection = new ConnectionFactory().getConnection();
  }
  
  public void incluir(Paciente paciente) {
    try {
      
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Incluir);
      
      stmt.setInt(1, consultarProximoNrId());
      stmt.setString(2, paciente.getCpfPaciente());
      stmt.setString(3, paciente.getDataNascimentoPaciente());
      stmt.setString(4, paciente.getNomePaciente());
      stmt.setInt(5, 999);
      
      stmt.execute();
      stmt.close();
            
    }catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public void atualizar(Paciente paciente) {
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Atualizar);
      
      stmt.setString(1, paciente.getCpfPaciente());
      stmt.setString(2, paciente.getDataNascimentoPaciente());
      stmt.setString(3, paciente.getNomePaciente());
      stmt.setInt(4, 999);
      stmt.setInt(5, paciente.getIdPaciente());
      
      stmt.execute();
      stmt.close();
      
    }
    catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  public Paciente procurar(Integer idPaciente, String cpfPaciente) {
    Paciente paciente = new Paciente();
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Procurar);
      
      stmt.setInt(1, idPaciente != null ? idPaciente : 0);
      stmt.setString(2, cpfPaciente != null ? cpfPaciente : null);
      
      ResultSet rs = stmt.executeQuery();
      
      while(rs.next()) {
        paciente.setIdPaciente(rs.getInt("PACIENTE_NR_ID"));
        paciente.setCpfPaciente(rs.getString("PACIENTE_NR_CPF"));
        paciente.setDataNascimentoPaciente(rs.getString("PACIENTE_DT_NASC"));
        paciente.setNomePaciente(rs.getString("PACIENTE_DS_NOME"));
      }
      
      rs.close();
      stmt.close();
      
    }catch(SQLException e) {
      e.printStackTrace();
    }
    return paciente;
  }

  public void remover(Paciente paciente) {
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_Remover);  
      
      stmt.setInt(1, paciente.getIdPaciente());   
      
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

  public Integer consultarProximoNrId() {  
    
    Integer _NrId = null;
    try {
      PreparedStatement stmt = this.connection.prepareStatement(SQLCMD_GetNrId);
      
      ResultSet rs = stmt.executeQuery();
      
      while(rs.next()) {
        _NrId = Integer.parseInt(rs.getString("PACIENTE_NR_ID"));
      }
      
      rs.close();
      stmt.close();
      
    }catch(SQLException e) {
      e.printStackTrace();
    }
    return _NrId;
  }
}
