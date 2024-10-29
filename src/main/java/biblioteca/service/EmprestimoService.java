package main.java.biblioteca.service;

import main.java.biblioteca.model.Emprestimo;

public class EmprestimoService extends Emprestimo {

    public EmprestimoService(String user, String endereco, Integer telefone, Integer email, String cpf, Boolean status, Integer idEmprestimo, String dataEmprestimo, String dataDevolucaoPrevista, String dataDevolucaorReal, String renovacao) {
        super(user, endereco, telefone, email, cpf, status, idEmprestimo, dataEmprestimo, dataDevolucaoPrevista, dataDevolucaorReal, renovacao);
    }

    public void realizarEmprestimo(String livro) {}
    public void registrarDecolucao(String livro) {}
    public void renovarEmprestimo(String livro) {}
    public void consultar(String livro) {}

}
