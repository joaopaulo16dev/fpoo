package Cliente;

import Tema.Tema;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente Cliente1 = new Cliente(2,"jp","996432380","7878","75548");
		
		System.out.println(Cliente1.getId());
		System.out.println(Cliente1.getNome());
		System.out.println(Cliente1.getTelefone());
		System.out.println(Cliente1.getCpf());
		System.out.println(Cliente1.getRg());

		
		

	}

}
