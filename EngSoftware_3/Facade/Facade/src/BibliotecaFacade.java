import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe Facade
public class BibliotecaFacade {
    private List<Livro> livrosDisponiveis;
    private List<Emprestimo> emprestimosAtivos;
    private List<Multa> multasPendentes;

    public BibliotecaFacade() {
        livrosDisponiveis = new ArrayList<>();
        emprestimosAtivos = new ArrayList<>();
        multasPendentes = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void realizarEmprestimo(Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        if (livrosDisponiveis.contains(livro)) {
            Emprestimo emprestimo = new Emprestimo(livro, dataEmprestimo, dataDevolucao);
            emprestimosAtivos.add(emprestimo);
            livrosDisponiveis.remove(livro);
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void realizarDevolucao(Livro livro) {
        Emprestimo emprestimo = buscarEmprestimoPorLivro(livro);
        if (emprestimo != null) {
            emprestimosAtivos.remove(emprestimo);
            livrosDisponiveis.add(livro);
            System.out.println("Devolução realizada com sucesso.");
        } else {
            System.out.println("Livro não está emprestado.");
        }
    }

    public void registrarMulta(Livro livro, double valor) {
        Multa multa = new Multa(valor);
        multasPendentes.add(multa);
        System.out.println("Multa registrada com sucesso.");
    }

    public void pagarMulta(Multa multa) {
        multa.pagarMulta();
        multasPendentes.remove(multa);
        System.out.println("Multa paga com sucesso.");
    }

    private Emprestimo buscarEmprestimoPorLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimosAtivos) {
            if (emprestimo.getLivro().equals(livro)) {
                return emprestimo;
            }
        }
        return null;
    }

    public Multa getMultaPendente() {
        for (Multa multa : multasPendentes) {
            if (!multa.isPaga()) {
                return multa;
            }
        }
        return null;
    }
}