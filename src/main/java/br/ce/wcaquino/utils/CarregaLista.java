package br.ce.wcaquino.utils;

import br.ce.wcaquino.core.BasePage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CarregaLista extends BasePage {

    public void carregaLista(){
        Espera.esperaWait();
        List<WebElement> tr = ObtemListaElementos("main-ad-list");
        System.out.println(tr.toString());

    }

}
