package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {


    public static void main(String[] args) {
       Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("O Alquimista", "Paulo Coelho","250");
        System.out.println(livro);
        /*int a = 8;
       int b = 2;
        System.out.println("I'm crazy " + (a/b) + " U!!");*/
    }
}

class Livro{
    private String nome;
    private String autor;
    private Integer numPaginas;

    public Livro(String nome, String autor, Integer numPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
