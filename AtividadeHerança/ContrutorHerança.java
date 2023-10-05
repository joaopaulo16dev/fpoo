package AtividadeHerança;

public class ContrutorHerança {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo ("lambo","esportivo",2010,"preto");
		System.out.println("Veiculo:");
		System.out.println("marca: " + veiculo.getMarca());
		System.out.println("modelo " + veiculo.getModelo());
		System.out.println("ano: " + veiculo.getAno());
		System.out.println("cor: " + veiculo.getCor());
		
		Moto moto = new Moto ("sj","kawasaki",2000,"branca", 1000);
		System.out.println("Moto:");
		System.out.println("marca: " + moto.getMarca());
		System.out.println("modelo " + moto.getModelo());
		System.out.println("ano: " + moto.getAno());
		System.out.println("cor: " + moto.getCor());
		System.out.println("cilindra: " + moto.getCilindra());
	
		Automovel automovel = new Automovel ("ferrari","spider",2020,"vermelha",2,"v8");
		System.out.println("Automovel:");
		System.out.println("marca: " + automovel.getMarca());
		System.out.println("modelo " +automovel.getModelo());
		System.out.println("ano: " + automovel.getAno());
		System.out.println("cor: " + automovel.getCor());
		System.out.println("numeroPortas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		
		

	}

}
