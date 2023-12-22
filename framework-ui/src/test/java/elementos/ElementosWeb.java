package elementos;

import org.openqa.selenium.By;


public class ElementosWeb {
	
	//elementos web

	private By pesquisar = By.name("q");
	private By e2etreinamentos = By.cssSelector("#rhs > div.kp-wholepage-osrp > div.HdbW6.zWHLnd.HaxgO.zLsiYe > div > div.d7sCQ.RhTIBd.kp-header > div > div.Hhmu2e.wDYxhc.NFQFxe.viOShc.LKPcQc > div > div > h2 > span");
	private By inovacao = By.xpath("#_3iZ6ZeHLKInW1sQP1-yr8A0_34 > div:nth-child(1) > div > div > div > div.DoxwDb > div");
	private By felicidade = By.xpath("#_siV6ZYKACbLQ1sQPp86m-AQ_95 > div:nth-child(2) > div > div > div > div.DoxwDb > div");
	  
	//metodos publicos dos elementos

	public By getPesquisar() {
		return pesquisar;
	}


	public By getE2etreinamentos() {
		return e2etreinamentos;
	}


	public By getInovacao() {
		return inovacao;
	}


	public By getFelicidade() {
		return felicidade;
	}





}
