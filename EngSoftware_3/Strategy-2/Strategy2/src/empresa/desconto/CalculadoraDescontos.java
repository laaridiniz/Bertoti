package empresa.desconto;

import empresa.salario.Salario;

import java.math.BigDecimal;

public class CalculadoraDescontos {
    public BigDecimal INSS(Salario salario, Descontos descontos){
        return descontos.INSS(salario);
    }
    public BigDecimal FGTS(Salario salario, Descontos descontos) { return descontos.FGTS(salario); }

    public BigDecimal IRRF(Salario salario, Descontos descontos) {return descontos.IRRF(salario); }

    public BigDecimal VT(Salario salario, Descontos descontos) { return descontos.VT(salario); }
}
