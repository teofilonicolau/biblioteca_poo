package autor;

import livro.Livro;

public class Autor {
    String nome;
    String nacionalidade;
    Integer idade;
    Livro[] livros;

    public Autor(String nome, String nacionalidade, Integer idade, Livro[] livros) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.livros = livros;
    }

    // Adicionei um método getter para o array de livros
    public Livro[] getLivros() {
        return livros;
    }
}