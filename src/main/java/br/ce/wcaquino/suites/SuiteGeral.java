package br.ce.wcaquino.suites;

import br.ce.wcaquino.pages.HomePage;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.core.DriverFactory;
import br.ce.wcaquino.tests.ContaTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
})
public class SuiteGeral {
	private static HomePage page = new HomePage();
	
	@BeforeClass
	public static void reset(){
		DriverFactory.killDriver();
	}
}
