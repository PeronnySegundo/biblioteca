package br.com.catolica.biblioteca.Main;
import br.com.catolica.biblioteca.Model.*;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.setAutor("Rene");
        livro.setIsbn(9);
        livro.setTitulo("Codigos e muito mais");
        livro.setAnoDePulicacao(new Data(10,10,10));
        livro.setQuantidadeEmEstoque(80);

        Aluno aluno = new Aluno();
        aluno.setEmail("psegundo@gmail.com");
        aluno.setId("12312312312");
        aluno.setNome("psegundo");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getEmail());
        System.out.println(aluno.getId());

        Professor professor = new Professor();
        professor.setEmail("erlon@gmail.com");
        professor.setNome("Erlon");
        professor.setId("09809809809");
        System.out.println(professor.getEmail());
        System.out.println(professor.getNome());
        System.out.println(professor.getId());

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNome("Biblioteca FAFIC");
        biblioteca.setEndereco(new Endereco("12312312312", "Cajazeiras"));
        biblioteca.cadastrarLivro(livro);
        biblioteca.localizarPorAutor("Rene");
        biblioteca.devolverLivro(livro);
        biblioteca.exibirInfo();
    }
}
