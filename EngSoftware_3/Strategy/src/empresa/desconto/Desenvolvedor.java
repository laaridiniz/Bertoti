package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public class Desenvolvedor implements Desconto {
    public BigDecimal calcular(Salario salario){
        return salario.getValor().multiply(new BigDecimal("0.12"));
    }
}
