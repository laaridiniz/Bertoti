import empresa.desconto.CalculadoraINSS;
import empresa.desconto.Desenvolvedor;
import empresa.desconto.Diretor;
import empresa.desconto.Trainee;
import empresa.salario.Salario;

import java.math.BigDecimal;

public class CalcDesconto {
    public static void main(String[] args){
        Salario salario = new Salario(new BigDecimal("7000"));
        CalculadoraINSS calculadora = new CalculadoraINSS();
        System.out.println(calculadora.calcular(salario, new Diretor()));
    }
}