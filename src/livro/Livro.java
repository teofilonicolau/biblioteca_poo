package livro;
import autor.Autor;

import java.time.LocalDate;

public class Livro {
    String titulo;
    String genero;
    LocalDate dataPublicacao;
    Autor autor;

    public Livro(String titulo, String genero, LocalDate dataPublicacao, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
    }
    // Adicionei um método getter para o título
    public String getTitulo() {
        return titulo;
    }
}