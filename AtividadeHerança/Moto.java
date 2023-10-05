package AtividadeHerança;

public class Moto extends Veiculo{
	private int cilindra;

	public Moto(String marca, String modelo, int ano, String cor, int cilindra) {
		super(marca, modelo, ano, cor);
		this.cilindra = cilindra;
	}

	public int getCilindra() {
		return cilindra;
	}

	public void setCilindra(int cilindra) {
		this.cilindra = cilindra;
	}
	
	

}
