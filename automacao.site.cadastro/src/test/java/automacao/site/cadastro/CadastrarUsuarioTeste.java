package automacao.site.cadastro;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CadastrarUsuarioTeste {
	
	WebDriver driver;
	
	@Test
	
	public void iniciarTeste() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions =new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver ();		
		driver.get("https://www.mrv.com.br/imoveis/sao-paulo/sao-paulo?gclid=EAIaIQobChMIvKzxqsbT-wIVROZcCh0upQDpEAAYASAAEgI0ZvD_BwE");
		driver.findElement(By.id("nome")).sendKeys("Gabriel");
		driver.findElement(By.name("sobrenome")).sendKeys("Sbrissa");
		driver.findElement(By.name("dia")).clear();
		driver.findElement(By.name("dia")).sendKeys("17");
		driver.findElement(By.name("mes")).clear();
		driver.findElement(By.name("mes")).sendKeys("07");
		driver.findElement(By.name("ano")).clear();
		driver.findElement(By.name("ano")).sendKeys("1991");
		driver.findElement(By.name("rg")).sendKeys("123456789");
		driver.findElement(By.name("cpf")).sendKeys("123456789");
		driver.findElement(By.name("cpf2")).sendKeys("89");
		driver.findElement(By.name("rua")).sendKeys("av henriqueta mendes guerra");
		driver.findElement(By.name("numero")).sendKeys("1330");
		driver.findElement(By.name("bairro")).sendKeys("Belval");
		driver.findElement(By.name("estado")).sendKeys("São Paulo");
		driver.findElement(By.name("cidade")).sendKeys("Barueri");
		driver.findElement(By.name("cep")).sendKeys("06428");
		driver.findElement(By.name("cep2")).sendKeys("050");
		driver.findElement(By.name("email")).sendKeys("gabriel.nunes@e2etreinamentos.com.br");
		driver.findElement(By.name("login")).sendKeys("gabriel");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.name("passconfirm")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
