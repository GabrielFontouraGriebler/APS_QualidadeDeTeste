package testesistema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.Assert;
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
public class SeleniumTest2 {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    public SeleniumTest2() {
    }
    
    @BeforeAll
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

        driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\exercicio1\\exercicio1.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    
    
    @Test
    public void testTituloPaginaExercicio(){
    	// arrange
    	driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\exercicio1\\exercicio1.html");      
    	String tituloExperado ="Calculadora"; 
        
    	// act, assert
    	Assert.assertEquals(tituloExperado,driver.getTitle());
    }
    
     @Test
    public void testCalcularSoma(){
        driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\exercicio1\\exercicio1.html");
        
        WebElement campoA = driver.findElement(By.id("a"));
         WebElement campoB = driver.findElement(By.id("b"));
         WebElement somar = driver.findElement(By.id("botao_somar"));
         WebElement resultado = driver.findElement(By.id("resultado"));
         campoA.sendKeys("5");
         campoB.sendKeys("5");
         somar.click();
         String respostaEsperada = "Resultado da soma: 10";
         Assert.assertEquals(respostaEsperada, resultado.getText());
    }
     
     @Test
     public void testCalcularMultiplicar(){
         driver.get("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Qualidade e Teste de Sotware\\qts\\src\\main\\java\\exercicio1\\exercicio1.html");
         
         WebElement campoA = driver.findElement(By.id("a"));
          WebElement campoB = driver.findElement(By.id("b"));
          WebElement multiplicar = driver.findElement(By.id("botao_multiplicar"));
          WebElement resultado = driver.findElement(By.id("resultado"));
          campoA.sendKeys("5");
          campoB.sendKeys("5");
          multiplicar.click();
          String respostaEsperada = "Resultado da mutiplicacao: 25";
          Assert.assertEquals(respostaEsperada, resultado.getText());
     }
    
    
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
    
}
