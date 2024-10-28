package br.com.catolica.biblioteca.Model;

public class Biblioteca {
    String nome;
    Endereco endereco;
    Livro[] listaDeLivros;

    public Biblioteca(){
        listaDeLivros = new Livro[100];
    }
    public void setNome(String nome){
        if(nome.length() > 3){
            this.nome = nome;
        }
        else{
            System.out.println("Digite um nome válido");
        }
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public String getNome(){
        return this.nome;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    public void verificarDisponibilidade(){
        int contador = 0;
        for (int i = 0; i < listaDeLivros.length; i++){
            if (listaDeLivros[i] != null){
                contador++;
            }
        }
        System.out.printf("Existem %d em estoque\n", contador);
    }
    public void cadastrarLivro(Livro livro){
        boolean status = false;
        for (int i = 0; i < listaDeLivros.length; i++){
            if(listaDeLivros[i] == null){
                listaDeLivros[i] = livro;
                status = true;
                break;
            }
        }
        if(status){
            System.out.println("Livro cadastrado com sucesso");
        }
        else{
            System.out.println("Espaço insuficiente");
        }
    }
    public void localizarPorAutor(String autor){
        boolean status = false;
        for(int i = 0; i < listaDeLivros.length; i++){
            if(listaDeLivros[i] != null && listaDeLivros[i].getAutor() == autor){
                System.out.println(listaDeLivros[i].exibirInfo());
                status = true;
            }
        }
        if (!status){
            System.out.println("Livro não encontrado");
        }
    }
    public void emprestarLivro(Livro livro){
        boolean status = false;
        for (int i = 0; i < listaDeLivros.length; i++){
            if(livro == listaDeLivros[i]){
                listaDeLivros[i] = null;
                status = true;
                break;
            }
        }
        if(status){
            System.out.println("Livro emprestado com sucesso");
        }
        else{
            System.out.println("Livro não encontrado");
        }
    }
    public void devolverLivro(Livro livro){
        boolean status = false;
        for(int i = 0; i < listaDeLivros.length; i++){
            if(listaDeLivros[i] == null){
                listaDeLivros[i] = livro;
                status = true;
                break;
            }
        }
        if (status){
            System.out.println("Livro devolvido com sucesso");
        }
        else{
            System.out.println("O livro não pode ser devolvido");
        }
    }
    public void exibirInfo(){
        for(int i = 0; i < listaDeLivros.length; i++){
            if(listaDeLivros[i] != null) {
                System.out.println("----");
                System.out.println(listaDeLivros[i].exibirInfo());
            }
        }
    }
}
