package Endereco;

public class Endereco {
	private long id;
	private String lofradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String uf;
	public Endereco(long id, String lofradouro, int numero, String complemento, String bairro, String cep, String uf) {
		super();
		this.id = id;
		this.lofradouro = lofradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLofradouro() {
		return lofradouro;
	}
	public void setLofradouro(String lofradouro) {
		this.lofradouro = lofradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	

}
