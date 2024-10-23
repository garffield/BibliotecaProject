package main.java.biblioteca.model;

public class Emprestimo extends Usuario{

    public Emprestimo(Integer id, String nome, String endereco, Integer telefone, Integer email, String cpf, Boolean status) {
        super(id, nome, endereco, telefone, email, cpf, status);
    }

// Atributos: id, livro, usuario, dataEmprestimo, dataDevolucaoPrevista, dataDevolucaoReal, renovacoes.
// Métodos: realizarEmprestimo(), registrarDevolucao(), renovarEmprestimo(), consultar().

}
