package java01.Classes;

public class Endereco {
	
	private String rua;
	private int numeroCasa;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private float cep;
	
	//Metodos
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getCep() {
		return cep;
	}

	public void setCep(float cep) {
		this.cep = cep;
	}

	
	//Saída ToString
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numeroCasa=" + numeroCasa + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
	}


}
