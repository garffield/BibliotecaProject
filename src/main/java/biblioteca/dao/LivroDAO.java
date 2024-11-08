package main.java.biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.biblioteca.model.Livro;
import main.java.biblioteca.util.ConexaoBD;

public class LivroDAO {
    
    public void cadastrarLivro(Livro livro){
        String query = "insert into livro(titulo, autor, isbn, anoPublicacao, disponibilidade) values ...";

        try {
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getIsbn());
            stmt.setString(4, livro.getEditora());
            stmt.setInt(5, livro.getAnoPublicacao());
            stmt.setString(6, livro.getCategoria());
            stmt.setBoolean(7, livro.getStatusLivro());
            stmt.executeUpdate();
            conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Livro constultarLivro(Integer idLivro){
        String query = "select * from livro where id = ?";
        Livro livro = null;

        try {
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idLivro);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                livro = new Livro();
                livro.setIdLivro(rs.getInt("id"));
                livro.setAutor(rs.getString("autor"));
                livro.setIsbn(rs.getString("isbn"));
                livro.setEditora(rs.getString("anoPublicacao"));
                livro.setAnoPublicacao((rs.getInt("anoPublicacao")));
                livro.setCategoria(rs.getString("categoria"));
                livro.setStatusLivro(rs.getBoolean("statusLivro"));
            
                stmt.executeUpdate();
                conn.close();
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return livro;
    }
    public void atualizarLivro(Livro livro){

    }
    public void removerLivro(Integer idLivro){
        String query = "delete from livro where id = ?";

        try{
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idLivro);
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
