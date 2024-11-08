package main.java.biblioteca.model;

public class Livro {
    public Integer idLivro;
    public String titulo;
    public String autor;
    public String isbn;
    public String editora;
    public Integer anoPublicacao;
    public String categoria;
    public Boolean statusLivro;


    public Livro(Integer idLivro, String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String categoria, Boolean statusLivro) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.statusLivro = statusLivro;
    }


    public Livro() {
        //TODO Auto-generated constructor stub
    }


    public Integer getIdLivro() {
        return idLivro;
    }


    public void setIdLivro(Integer string) {
        this.idLivro = string;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getEditora() {
        return editora;
    }


    public void setEditora(String editora) {
        this.editora = editora;
    }


    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }


    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Boolean getStatusLivro() {
        return statusLivro;
    }


    public void setStatusLivro(Boolean statusLivro) {
        this.statusLivro = statusLivro;
    }

    
}