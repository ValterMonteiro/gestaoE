package com.gestaoE.produto;

import com.gestaoE.gestaoE.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Produto_DAO {
    public void create (Produto produto){
        String sql = "INSERT INTO tb_Produto ("
                + "codigoProduto, "
                + "descricao,"
                + " data, "
                + "saidaQuantidade, "
                + "entradaQuantidade, "
                + "precoCusto, "
                + "precoVenda ) VALUES (?,?,?,?,?,?,?);";

        try {
    		
	   PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
	   ps.setLong(1, produto.getCodigoProduto());
	   ps.setString(2, produto.getDescricao());
	   ps.setString(3, produto.getData());
	   ps.setLong(4, produto.getSaidaQuantidade());
	   ps.setLong(5, produto.getEntradaQuantidade());
	   ps.setDouble(5, produto.getPrecoCusto());
	   ps.setDouble(5, produto.getPrecoVenda());
           ps.execute();
           
	} catch (SQLException e) {        }
        
    }
    public void delete (int codigoProduto){
        String sql = "DELETE FROM tb_Produto WHERE codigoProduto = ?";
    	try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, codigoProduto);
            ps.execute();
			
	} catch (SQLException e) {

        }
    }
    public void update (Produto produto){
        String sql = "UPDATE tb_Produto SET username = ?, "
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
    public Produto retrieve (int codigoProduto){
        Produto produto = new Produto();
        String sql = "SELECT * FROM tb_Produto WHERE codigoProduto = ?";
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
        return produto;
  
}
    public ArrayList<Produto> list (){
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM tb_Produto";

        try {
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoProduto(rs.getLong("codigoProduto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setData(rs.getString("data"));
                produto.setSaidaQuantidade(rs.getLong("saidaQuantidade"));
                produto.setEntradaQuantidade(rs.getLong("entradaQuantidade"));
                produto.setPrecoCusto(rs.getDouble("precoCusto"));
                produto.setPrecoVenda(rs.getDouble("precoVenda"));
                produtos.add(produto);
            }
	} catch (SQLException e) {

        }

        return produtos;
    }
}