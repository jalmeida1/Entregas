package br.com.senacrs.alp.aulas;

import static org.junit.Assert.*;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinhaListaImpTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMinhaListaImp() {
		
		MinhaListaImp<String> obj = null;
		String arg = null;
		
		arg = "Valor Valido";
		obj = new MinhaListaImp<String>(arg);
		Assert.assertNotNull(obj);
		
	
	}
	@Test
	public void testMinhaListaImpNull() {
		
		MinhaListaImp<String> obj = null;
		try {	
		    obj = new MinhaListaImp<String>(null);
		    fail("Not yet implemented");
		} catch (IllegalArgumentException e) {
			 Assert.assertTrue(true);
		}
		
		
	
	}
	@Test
	public void testSufixar() {
		
		MinhaListaImp<String> obj = null;
		String valor,sufixo = null;
		
		obj = new MinhaListaImp<String>("Inicio");
		valor = "valor";
		
		obj.sufixar(valor);
		sufixo = obterSufixo(obj);
		Assert.assertEquals(valor, sufixo);
		
		
		
	}

	private String obterSufixo(MinhaListaImp<String> obj) {
		String resultado = null; 
		Nodo<String > nodo = null;
		
		nodo = obj.getInicio();
		while(nodo.getProximo()!= null) {
			nodo = nodo.getProximo();
			
		}
		resultado = nodo.getValor();
		return resultado;
	}

	@Test
	public void testPrefixar() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscar() {
		fail("Not yet implemented");
	}

	@Test
	public void testInserir() {
		
		MinhaListaImp<String> obj = null;
		obj = new MinhaListaImp<String>("0");
		
		String valorInserir,sufixar = null;
		
		int x = (int) Math.random();
		
		valorInserir = String.valueOf(x);
		
		obj.inserir(1, valorInserir);
		
		sufixar = obterSufixo(obj);
		
		Assert.assertEquals(valorInserir, sufixar);
	}

	@Test
	public void testRemover() {
		fail("Not yet implemented");
	}

	@Test
	public void testTamanho() {
		
		MinhaListaImp<String> obj = null;
		
		obj = new MinhaListaImp<String>("0");
		
		int valorTamanho = 0;
		
		int contador = 1;
		
		for(int i = 0 ; i<10 ;i++){
			InserirDadosList(String.valueOf(i),obj,i);
			contador ++;
		}
		
		valorTamanho = obj.tamanho();
		
		Assert.assertEquals(contador, valorTamanho);
		
		
		
		
		
	}

	private void InserirDadosList(String valor,MinhaListaImp<String> obj,int posicao) {
		
		Nodo<String> anterior = buscarNodo(obj,posicao);
		Nodo<String> proximo = anterior.getProximo();
		Nodo<String> nodo = new Nodo<String>(valor);
		
		anterior.setProximo(nodo);
		nodo.setProximo(proximo);		
		
	}

	private Nodo<String> buscarNodo(MinhaListaImp<String> obj,int posicao) {
		
        Nodo<String> resultado = obj.getInicio();
		
		for (int i = 0; i < posicao; i++) {
			resultado = resultado.getProximo();
		}
				
		return resultado;	}

}
