package Endereco;

public class ObjetoEnderec {
	public static void main(String[] args) {
		
		Endereco Endereco1 = new Endereco (2,"rua",5,"nao precisa","juvena","4898","sp");
		
		System.out.println(Endereco1.getId());
		System.out.println(Endereco1.getLofradouro());
		System.out.println(Endereco1.getNumero());
		System.out.println(Endereco1.getComplemento());
		System.out.println(Endereco1.getBairro());
		System.out.println(Endereco1.getCep());
		System.out.println(Endereco1.getUf());
		

}
}
