package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public interface Descontos {
    BigDecimal INSS(Salario salario);
    BigDecimal FGTS(Salario salario);
    BigDecimal IRRF(Salario salario);
    BigDecimal VT(Salario salario);
}
