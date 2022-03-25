package src;

import java.sql.Connection;
import java.sql.SQLException;

public interface ClienteDAO {
    public Connection connect(String urlConexao);
    public String createTable(String urlConexao);
    public void insert(String url_conexao, Cliente cliente);
    public void selectAll(String urlConexao);
    public void update(String urlConexao, int id, String name, Integer idade);
    public void delete(String urlConexao, int id) throws SQLException;
}
