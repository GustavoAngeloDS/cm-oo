package br.com.cadastromedico.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  public Connection getConnection() {
    
    Connection connection = null;
    try {
      String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=CM";
      String username = "app_cm";
      String password = "teste";
      
      connection = DriverManager.getConnection(url, username, password);
    } 
    catch (SQLException e) {
      System.out.println("Erro na conexão do BD!");
      e.printStackTrace();
    }
    return connection;
  }
}