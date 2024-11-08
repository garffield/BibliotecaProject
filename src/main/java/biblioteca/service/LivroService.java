package main.java.biblioteca.service;

import main.java.biblioteca.model.Livro;

public class LivroService extends Livro {
    public LivroService(Integer idLivro, String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String categoria, Boolean statusLivro) {
        super(idLivro, titulo, autor, isbn, editora, anoPublicacao, categoria, statusLivro);
    }



//Regras de Negócio:
//O ISBN deve ser único no sistema.
//O título e o autor são campos obrigatórios.
//O ano de publicação não pode ser uma data futura.

}
