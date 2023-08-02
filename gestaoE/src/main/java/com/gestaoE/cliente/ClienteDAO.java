package com.gestaoE.cliente;
import com.gestaoE.gestaoE.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class ClienteDAO {
    public void create (Cliente cliente){
        String sql = "INSERT INTO tb_Cliente (username, password, email, name, endereco) VALUES (?,?,?,?,?);";
/*
        try {
    		
	   PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
	   ps.setString(1, cliente.getUsername());
	   ps.setString(2, cliente.getPassword());
	   ps.setString(3, cliente.getEmail());
	   ps.setString(4, cliente.getName());
	   ps.setString(5, cliente.getEndereco());
           ps.execute();
           
	} catch (SQLException e) {        }
*/        
    }
    public void delete (int codigoCliente){
        String sql = "DELETE FROM tb_Cliente WHERE codigoCliente = ?";
    	try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, codigoCliente);
            ps.execute();
			
	} catch (SQLException e) {

        }
    }
    public void update (Cliente cliente){
        String sql = "UPDATE tb_Cliente SET username = ?, "
                + "password = ?, "
                + "email = ?, "
                + "name = ?, "
                + "endereco = ? "
                + "WHERE cliente_id = ?;";
/*    	
        try {
    		
	   PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
	   ps.setString(1, cliente.getUsername());
	   ps.setString(2, cliente.getPassword());
	   ps.setString(3, cliente.getEmail());
	   ps.setString(4, cliente.getName());
	   ps.setString(5, cliente.getEndereco());
           ps.setInt(6, cliente.getCliente_id());
           ps.execute();
	} catch (SQLException e) {

        }           
*/
    }
    public Cliente retrieve (int codigoCliente){
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM tb_Cliente WHERE codigoCliente = ?";
/*    	
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setLong(1, cliente_id);
            ResultSet rs = ps.executeQuery();
            rs.first();
            cliente.setCliente_id(cliente_id);
            cliente.setUsername(rs.getString("username"));
            cliente.setPassword(rs.getString("password"));
            cliente.setEmail(rs.getString("email"));
            cliente.setName(rs.getString("name"));
            cliente.setEndereco(rs.getString("endereco"));
	} catch (SQLException e) {

        }        
*/
        return cliente;
  
}
    public ArrayList<Cliente> list (){
        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM tb_Cliente";
/*
        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente_Pf cliente = new Cliente_Pf();
                cliente.setCliente_id(rs.getInt("cliente_id"));
                cliente.setUsername(rs.getString("username"));
                cliente.setPassword(rs.getString("password"));
                cliente.setEmail(rs.getString("email"));
                cliente.setName(rs.getString("name"));
                cliente.setEndereco(rs.getString("endereco"));
                clientes.add(cliente);
            }
	} catch (SQLException e) {

        }
*/
        return clientes;
    }  
}