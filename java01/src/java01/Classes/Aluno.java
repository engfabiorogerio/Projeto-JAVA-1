package java01.Classes;

public class Aluno {
	private static int alunoId;
	private String nomeAluno;
	private float rgAluno;
	private float cpfAluno;
	private String graduacaoAluno;
	private String serieAluno;
	private String nomeMae;
	private String nomePai;
	private Endereco endereco;
	private Materia boletimAluno;
	
	public static int getAlunoId() {
		Aluno.alunoId ++;
		return alunoId;
	}
	public static void setAlunoId(int alunoId) {
		Aluno.alunoId = alunoId;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public float getRgAluno() {
		return rgAluno;
	}
	public void setRgAluno(float rgAluno) {
		this.rgAluno = rgAluno;
	}
	public float getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(float cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public String getGraduacaoAluno() {
		return graduacaoAluno;
	}
	public void setGraduacaoAluno(String graduacaoAluno) {
		this.graduacaoAluno = graduacaoAluno;
	}
	public String getSerieAluno() {
		return serieAluno;
	}
	public void setSerieAluno(String serieAluno) {
		this.serieAluno = serieAluno;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Materia getBoletimAluno() {
		return boletimAluno;
	}
	public void setBoletimAluno(Materia boletimAluno) {
		this.boletimAluno = boletimAluno;
	}
	
	
	
}
