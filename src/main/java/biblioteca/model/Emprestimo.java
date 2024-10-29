package main.java.biblioteca.model;


public class Emprestimo extends Usuario{

    public Integer idEmprestimo;
    public String dataEmprestimo;
    public String dataDevolucaoPrevista;
    public String dataDevolucaorReal;
    public String renovacao;
    public String[] arrayLivros = {};

    public Emprestimo(String user, String endereco, Integer telefone, Integer email, String cpf, Boolean status,Integer idEmprestimo, String dataEmprestimo, String dataDevolucaoPrevista, String dataDevolucaorReal, String renovacao) {
        super(user, endereco, telefone, email, cpf, status);
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaorReal = dataDevolucaorReal;
        this.renovacao = renovacao;
    }

}
