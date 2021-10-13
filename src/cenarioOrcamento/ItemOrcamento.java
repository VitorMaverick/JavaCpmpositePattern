package cenarioOrcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements IOrcavel {

    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
