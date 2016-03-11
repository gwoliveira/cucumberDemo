/**
 * 
 */
package me.impressione.cucumberdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import cucumber.api.java8.Pt;

/**
 * @author Guilherme Willian de Oliveira
 *
 */
public class StepDefinitions implements Pt {
    
    private PensadorProfundo pensadorProfundo;
    
    public StepDefinitions() {
        
        
        Dado("^o Pensador Profundo$", () -> {
            pensadorProfundo = new PensadorProfundo();
        });

        Quando("^perguntado sobre a resposta pra vida, o universo, e tudo mais$", () -> {
            pensadorProfundo.processarPerguntaFundamental();
        });

        Então("^a resposta é \"([^\"]*)\"$", (String respostaEsperada) -> {
            assertThat(respostaEsperada, is(pensadorProfundo.resposta()));
        });

        E("^após passar ([\\d\\.]+) milhões de anos$", (Double anosEmMilhoes) -> {
            pensadorProfundo.tempoAguardando(anosEmMilhoes);
        });
    }
}

