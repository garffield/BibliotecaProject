package main.java.biblioteca.model;

public class Emprestimo extends Usuario{

    public Integer id;


    public Emprestimo(Integer id, String user, String endereco, Integer telefone, Integer email, String cpf, Boolean status) {
        super(id, user, endereco, telefone, email, cpf, status);
    }

// Atributos: id, livro, usuario, dataEmprestimo, dataDevolucaoPrevista, dataDevolucaoReal, renovacoes.
// Métodos: realizarEmprestimo(), registrarDevolucao(), renovarEmprestimo(), consultar().

}
