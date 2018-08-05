package br.ce.wcaquino.utils;

import org.openqa.selenium.support.ui.WebDriverWait;

import static br.ce.wcaquino.core.DriverFactory.getDriver;

public class Espera {
    public static void esperaWait(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 40);
    }
}
