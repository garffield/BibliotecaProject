package main.java.biblioteca.model;

public class Livro implements Interface.interfaceCrud {
    public Integer idLivro;
    public String titulo;
    public String autor;
    public String isbn;
    public String editora;
    public String anoPublicacao;
    public String categoria;
    public Boolean statusLivro;

    public Livro(Integer idLivro, String titulo, String autor, String isbn, String editora, String anoPublicacao, String categoria, Boolean statusLivro) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.statusLivro = statusLivro;
    }

    public void cadastrar(){}
    public void atualizar(){}
    public void excluir(){}
    public void consultar(){}


}