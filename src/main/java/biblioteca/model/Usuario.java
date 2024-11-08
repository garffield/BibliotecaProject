package main.java.biblioteca.model;

public class Usuario {
    public Integer idUsuario;
    public String user;
    public String endereco;
    public Integer telefone;
    public Integer email;
    public String cpf;
    public Boolean status;

    public Usuario (Integer idUsuario,String user, String endereco, Integer telefone, Integer email, String cpf, Boolean status) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.status = status;
    }

}
