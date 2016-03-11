/**
 * 
 */
package me.impressione.cucumberdemo;

/**
 * @author Guilherme Willian de Oliveira
 *
 */
import cucumber.api.CucumberOptions;  
import cucumber.api.junit.Cucumber;  
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features="classpath:funcionalidades", plugin = {"pretty", "html:target/cucumber"})
public class RunCukesTest {  
}
