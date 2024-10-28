package br.com.catolica.biblioteca.Model;

public class Livro {
    private String titulo;
    private String autor;
    private double isbn;
    private Data anoDePulicacao;
    private int quantidadeEmEstoque;

    public Livro(){}

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoDePulicacao(Data anoDePulicacao) {
        this.anoDePulicacao = anoDePulicacao;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getAutor() {
        return autor;
    }

    public Data getAnoDePulicacao() {
        return anoDePulicacao;
    }

    public double getIsbn() {
        return isbn;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String exibirInfo(){
        return String.format("<Titulo: %s\nAutor: %s\nISBN: %.2f\nAno de publicação: %s\nQuantidade em estoque: %d>",
                this.titulo, this.autor, this.isbn, this.anoDePulicacao, this.quantidadeEmEstoque);
    }
}
