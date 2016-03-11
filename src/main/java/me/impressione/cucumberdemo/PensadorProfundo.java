/**
 * 
 */
package me.impressione.cucumberdemo;

/**
 * @author Guilherme Willian de Oliveira
 *
 */
public class PensadorProfundo {

    /**
     * 
     */
    private static final Double TEMPO_PROCESSAMENTO = new Double("7.5");
    private boolean processandoPerguntaFundamental;
    private Double tempoProcessando = 0.0;

    public void processarPerguntaFundamental() {
        this.processandoPerguntaFundamental = true;
    }

    public void tempoAguardando(Double anosEmMilhoes) {
        if (processandoPerguntaFundamental) {
            this.tempoProcessando = anosEmMilhoes;
        }
    }

    public String resposta() {
        if (fimProcessamento()) {
            return "42";
        } else if (processandoPerguntaFundamental) {
            return "ainda pensando";
        } else {
            return "primeiro você deve fazer a pergunta";
        }
    }

    private boolean fimProcessamento() {
        return TEMPO_PROCESSAMENTO.compareTo(tempoProcessando) < 0;
    }
}
