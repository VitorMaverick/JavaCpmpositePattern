package cenarioOrcamento;

import cenarioOrcamento.situacao.EmAnalise;
import cenarioOrcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements IOrcavel {
    List<IOrcavel> itens;
    BigDecimal valor;
    SituacaoOrcamento situacao;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }


    public List<IOrcavel> getItens() {
        return itens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void adicionarItem(IOrcavel item) {
        this.valor = this.valor.add(item.getValor());
        this.itens.add(item);
    }
}
