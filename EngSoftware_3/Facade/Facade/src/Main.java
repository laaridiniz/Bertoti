import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", 5);
        Livro livro2 = new Livro("A Culpa é das Estrelas", "John Green", 8);

        BibliotecaFacade biblioteca = new BibliotecaFacade();

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.realizarEmprestimo(livro1, new Date(), new Date());
        biblioteca.realizarEmprestimo(livro2, new Date(), new Date());

        biblioteca.realizarDevolucao(livro1);
        biblioteca.realizarDevolucao(livro2);

        biblioteca.registrarMulta(livro1, 10.0);
        biblioteca.registrarMulta(livro2, 20.0);

        Multa multa = biblioteca.getMultaPendente();
        if (multa != null) {
            System.out.println("Valor da multa pendente: " + multa.getValor());
        } else {
            System.out.println("Não há multas pendentes.");
        }

    }
}