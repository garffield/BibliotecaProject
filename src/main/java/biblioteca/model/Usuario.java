package main.java.biblioteca.model;

public class Usuario implements Interface.interfaceCrud {

    public Integer id;
    public String nome;
    public String endereco;
    public Integer telefone;
    public Integer email;
    public String cpf;
    public Boolean status;

    public Usuario (Integer id, String nome, String endereco, Integer telefone, Integer email, String cpf, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.status = status;
    }

    public void cadastrar(){}
    public void atualizar(){}
    public void excluir(){}
    public void consultar(){}
}
