/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class UsuarioData extends Conexao{
    public UsuarioData() throws Exception{}
     public boolean incluir(UsuarioModel obj) throws Exception{
        String sql="INSERT INTO usuario (cep, cidade, nro, "
                + "rua, uf, cpf, senha, nome, nivel) "
                + "values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getCep());
        ps.setString(2, obj.getCidade());
        ps.setInt(3, obj.getNro());
        ps.setString(4, obj.getRua());
        ps.setLong(5, obj.getUf());
        ps.setString(6, obj.getCpf());
        ps.setString(7, obj.getSenha());
        ps.setString(8, obj.getNome());
        ps.setInt(9, obj.getNivel());
        return ps.executeUpdate()>0;
    }
    public ArrayList<UsuarioModel> pesquisar(String texto) throws Exception{
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "Select * from obra where ";
        for(int i=0;i<palavras.length;i++) {
            if(i>0 && i!= palavras.length) sql+= " or ";
            sql+= " descricao like '%"+palavras[i]+"%' or autor like '%"+palavras[i]+"%' ";
        }
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            UsuarioModel obj = new UsuarioModel(rs.getInt("id"), 
                    rs.getString("descricao"), 
                    rs.getString("autor"), 
                    rs.getInt("ano"), 
                    rs.getString("local"), 
                    new CategoriaModel(rs.getInt("idcategoria"), ""), 
                    new TipoModel(rs.getInt("idtipo"), ""));
            dados.add(obj);
        }
        
        return dados;
    }
}
