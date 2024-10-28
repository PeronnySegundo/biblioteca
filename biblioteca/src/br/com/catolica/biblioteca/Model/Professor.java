package br.com.catolica.biblioteca.Model;

public class Professor {
    private String nome;
    private String id;
    private String email;
    private Livro[] listaDeLivros;

    public Professor(){
        listaDeLivros = new Livro[10];
    }
    public void setNome(String nome){
        if(nome.length() > 3){
            this.nome = nome;
        }
        else{
            System.out.println("Digite um nome válido");
        }
    }
    public void setEmail(String email){
        if(email.contains("@") || email.contains(".com")){
            this.email = email;
        }
        else{
            System.out.println("Digite um email válido");
        }
    }
    public void setId(String id){
        if(id.length() > 10){
            this.id = id;
        }
        else{
            System.out.println("Digite um CPF válido");
        }
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public String getId(){
        String idModificado = this.id.substring(0,3) + ".***.***-" + this.id.substring(9,11);
        return idModificado;
    }

    public String exibirInfo(){
        int contador = 0;
        for(int i = 0; i < listaDeLivros.length; i++){
            if(listaDeLivros[i] != null){
                contador++;
            }
        }
        return String.format("<Nome: %s\nID: %s\nE-mail: %s\nLimite de livros: %d>",
                this.nome, this.id, this.email, contador);
    }
}
