package main.java.biblioteca.model;

public class Livro implements Interface.interfaceCrud {
    public Integer id;
    public String titulo;
    public String autor;
    public String isbn;
    public String editora;
    public String anoPublicacao;
    public String categoria;
    public Boolean disponibilidade;

    public Livro(Integer id, String titulo, String autor, String isbn, String editora, String anoPublicacao, String categoria, Boolean disponibilidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.disponibilidade = disponibilidade;
    }

    public void cadastrar(){}
    public void atualizar(){}
    public void excluir(){}
    public void consultar(){}


}

//	Métodos: cadastrar(), atualizar(), excluir(), consultar().