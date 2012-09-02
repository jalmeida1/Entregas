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
		obj = new MinhaListaImp<String>();
		Assert.assertNotNull(obj);
		
	
	}
	
	@Test
	public void testSufixar() {
		
		MinhaListaImp<String> obj = null;
		String valor,sufixo = null;
		
		obj = new MinhaListaImp<String>();
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
		
		MinhaListaImp<String> obj = null;
		obj = new MinhaListaImp<String>();
		
		String valorInserir,obterUltimoValor , ValorPrefixar = null;
		int posicao;
		
		posicao = 0;
		valorInserir = "Valor";
		ValorPrefixar = "prefixar";
		
		obj.inserir(posicao, valorInserir);
		obj.prefixar(ValorPrefixar);
	    obterUltimoValor = buscar(posicao +1 , obj);
		Assert.assertEquals(ValorPrefixar, obterUltimoValor);
		
	}

	@Test
	public void testBuscar() {
	
		MinhaListaImp<String> obj = null;
		obj = new MinhaListaImp<String>();
       
		 String valor,valorEncontrado = null;
		 int posicao ;
		 
		 valor = "valor Inserido";
		 posicao = 1;
		 
		
		obj.inserir(posicao, valor);
		
		valorEncontrado = obj.buscar(posicao -1);
		
		Assert.assertEquals(valor, valorEncontrado);
	}

	@Test
	public void testInserir() {
		
		MinhaListaImp<String> obj = null;
		obj = new MinhaListaImp<String>();
		
		String valorInserir,obterUltimoValor = null;
		int posicao;
		
		posicao = 1;
		valorInserir = "Valor";
		
		obj.inserir(posicao, valorInserir);
	    obterUltimoValor = buscar(posicao , obj);
		Assert.assertEquals(valorInserir, obterUltimoValor);
		
	}

	private String buscar(int posicao , MinhaListaImp<String> obj) {
       
		Nodo<String> nodo = buscarNodo(obj , posicao);
		return nodo.getValor();
	}

	@Test
	public void testRemover() {
		
		MinhaListaImp<String> obj = null;
		obj = new MinhaListaImp<String>();
		
		String valorInserir,obterUltimoValor,novoValor = null;
		int posicao;
		
		posicao = 0;
		valorInserir = "Valor";
		
		obj.inserir(posicao, valorInserir);
		obj.remover(posicao);
		
	    obterUltimoValor = buscar(0 , obj);
	    
		Assert.assertNotSame(valorInserir, obterUltimoValor);
	}

	@Test
	public void testTamanho() {
		
		MinhaListaImp<String> obj = null;
		
		obj = new MinhaListaImp<String>();
		
		int valorTamanho = 0;
		
		int contador = 0;
		
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
