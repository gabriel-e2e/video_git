package automacao.site.cadastro;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mrv {

WebDriver driver;
	
	@Test
	
	public void iniciarTeste() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions =new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver ();		
		driver.get("https://www.mrv.com.br/imoveis/sao-paulo/sao-paulo?gclid=EAIaIQobChMIvKzxqsbT-wIVROZcCh0upQDpEAAYASAAEgI0ZvD_BwE");

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[7]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"form-submit\"]/div[6]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content-block\"]/div[2]/div[1]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#formSelectUnit > div > div:nth-child(1) > div > div > div.css-m6glju > div.css-oi60w7-placeholder")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div/div[1]/div/div/div[1]/div[1]")).click();
		driver.findElement(By.id("react-select-2-input")).sendKeys("sao paulo");
		driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("react-select-3-input")).sendKeys("São Paulo");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("react-select-4-input")).sendKeys("Área Pti");
		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"formSelectUnit\"]/div/button")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("name")).sendKeys("NomeCompleto");
		driver.findElement(By.name("cpfCnpj")).sendKeys("68728055000156");
		driver.findElement(By.name("cellphone")).sendKeys("11999999999");
		driver.findElement(By.name("email")).sendKeys("email@teste.com.br");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div/button")).sendKeys(Keys.ENTER);
		
		
		//driver.quit();
		
		
		
		
		
	}

}


