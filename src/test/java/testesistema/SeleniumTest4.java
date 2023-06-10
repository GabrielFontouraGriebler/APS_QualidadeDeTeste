package testesistema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.Assert;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author marcelo.soares
 */
public class SeleniumTest4 {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    public SeleniumTest4() {
    }
    
    @BeforeAll
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

        driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\APS2\\trabalho2-1.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    
    
    @Test
	public void testValidarNome() {

		WebElement nomeInput = driver.findElement(By.id("nome"));
		WebElement salvarButton = driver.findElement(By.id("botao_somar"));

		
		nomeInput.sendKeys("");
		salvarButton.click();

		WebElement resultadoDiv = driver.findElement(By.id("resultado"));
		String resultado = resultadoDiv.getText();
		assertEquals("Preencha o campo nome", resultado);
	}
    
    @Test
	public void testValidarEndereco() {

    	driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\APS2\\trabalho2-1.html");
		WebElement nomeInput = driver.findElement(By.id("nome"));
		WebElement enderecoInput = driver.findElement(By.id("endereco"));
		WebElement salvarButton = driver.findElement(By.id("botao_somar"));

		
		nomeInput.sendKeys("John Doe");

		
		enderecoInput.sendKeys("");
		salvarButton.click();

		WebElement resultadoDiv = driver.findElement(By.id("resultado"));
//		String resultado = resultadoDiv.getText();
		assertEquals("Preencha o campo endereco", resultadoDiv.getText());
	}

    @Test
	public void testValidarSexo() {

    	driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\APS2\\trabalho2-1.html");
		WebElement nomeInput = driver.findElement(By.id("nome"));
		WebElement enderecoInput2 = driver.findElement(By.id("endereco"));
		WebElement sexoSelect = driver.findElement(By.id("sexo"));
		WebElement salvarButton = driver.findElement(By.id("botao_somar"));

		
		nomeInput.sendKeys("John Doe");
		enderecoInput2.sendKeys("Rua Exemplo");

		
		sexoSelect.sendKeys("");
		salvarButton.click();

		WebElement resultadoDiv = driver.findElement(By.id("resultado"));
		String resultado = resultadoDiv.getText();
		assertEquals("Selecione um valor para o campo sexo", resultado);
	}
    
    @Test
	public void testValidarIdade() {

    	driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\APS2\\trabalho2-1.html");
		WebElement nomeInput = driver.findElement(By.id("nome"));
		WebElement enderecoInput = driver.findElement(By.id("endereco"));
		WebElement sexoSelect = driver.findElement(By.id("sexo"));
		WebElement idadeInput = driver.findElement(By.id("idade"));
		WebElement salvarButton = driver.findElement(By.id("botao_somar"));

		
		nomeInput.sendKeys("John Doe");
		enderecoInput.sendKeys("Rua Exemplo");
		sexoSelect.sendKeys("m");

		
		idadeInput.sendKeys("");
		salvarButton.click();

		WebElement resultadoDiv = driver.findElement(By.id("resultado"));
		String resultado = resultadoDiv.getText();
		assertEquals("Preencha o campo idade, somente com numeros", resultado);
	}
    
	@Test
	public void testValidarTituloPagina() {

		String tituloPagina = driver.getTitle();
		assertEquals("Trabalho 2-1", tituloPagina);
	}
    
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
    
}
