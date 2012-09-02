package br.com.senacrs.alp.aulas;

public class Main {

	public static void main(String[] args) {
		
		MinhaListaImp<String> list = new MinhaListaImp<String>();

		System.out.println("Tamanho = " + list.tamanho());

		list.sufixar("Valor 1");
		System.out.println("Tam Depois de sufixar = " + list.tamanho());
		System.out.println("Primeiro valor lista = " + list.buscar(0));
		list.prefixar("Prefixar Valor");
		System.out.println("Tam Depois de prefixar = " + list.tamanho());
		list.inserir(2, "Inserir Valor");
		list.remover(1);

		for(int i = 0; i < list.tamanho(); i++){
			System.out.println("Nodo "+ i + " = " + list.buscar(i));
		}
	
	}
}
