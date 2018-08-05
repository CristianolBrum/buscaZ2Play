package br.ce.wcaquino.tests;

import br.ce.wcaquino.core.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import br.ce.wcaquino.utils.CarregaLista;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {
CarregaLista lista = new CarregaLista();


    @Test
    public void aTest1()  {
    inicializa();
    lista.carregaLista();
    }



}
