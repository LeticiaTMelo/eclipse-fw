package pages;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl) {
		// quando abrir metodo a segunda palavra tem que ter letra maiuscula
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//ie = internet explorer, gecko = firefox
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	
	public void escrever(String texto, By elemento, String passo) throws IOException {
		
		try {
		
		driver.findElement(elemento).sendKeys(texto);
		
		}catch (Exception e ) {
			
			System.out.println("----erro ao tentar executar o passo " + passo + LocalDateTime.now());
			screenShot("erro" + passo);
			
		}
	}
	public void submit(By elemento) {
		
		driver.findElement(elemento).submit();
		
	}
	public void validarTexto(String textoEsperado, By elemento) {
		
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
		
	}

	public void fecharNavegador() {
  
		driver.close();
        //quit fecha todas as janelas, o close fecha apenas a atual
		
	}
	public void screenShot(String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(scrFile, destFile);
		
	} 
	



}
