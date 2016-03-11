/**
 * 
 */
package me.impressione.cucumberdemo;

import cucumber.api.PendingException;
import cucumber.api.java8.Pt;

/**
 * @author Guilherme Willian de Oliveira
 *
 */
public class StepDefinitions implements Pt {
    public StepDefinitions() {
        Dado("^o Pensador Profundo$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Quando("^perguntado sobre a resposta pra vida, o universo, e tudo mais$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Quando("^após passar (\\d+)\\.(\\d+) milhões de anos$", (Integer arg1, Integer arg2) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Então("^a resposta é \"([^\"]*)\"$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Quando("^após passar (\\d+) milhões de anos$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
