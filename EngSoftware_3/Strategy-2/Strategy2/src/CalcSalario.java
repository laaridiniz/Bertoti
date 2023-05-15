import empresa.desconto.CalculadoraDescontos;
import empresa.desconto.Desenvolvedor;
import empresa.desconto.Diretor;
import empresa.desconto.Trainee;
import empresa.salario.Salario;

import java.math.BigDecimal;

public class CalcSalario {
    public static void main(String[] args) {

        Salario salario = new Salario(new BigDecimal("7000"));
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.INSS(salario, new Diretor()));
        System.out.println(calculadoraDescontos.FGTS(salario, new Diretor()));
        System.out.println(calculadoraDescontos.IRRF(salario, new Diretor()));
        System.out.println(calculadoraDescontos.VT(salario, new Diretor()));

    }
}