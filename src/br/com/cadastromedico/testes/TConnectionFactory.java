package br.com.cadastromedico.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.cadastromedico.conn.ConnectionFactory;

public class TConnectionFactory {

  public static void main(String[] args) throws SQLException {
    
    Connection conn = new ConnectionFactory().getConnection();

    conn.close();
  }

}
