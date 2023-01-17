package java01.Classes;

public class Materia {
	private String materia;
	private double nota1;
	private double nota2;
	private double notaTrab;	
	private double recupera;
	private double bimestre;
	
	
	//GETTERS and SETTERS
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaTrab() {
		return notaTrab;
	}
	public void setNotaTrab(double notaTrab) {
		this.notaTrab = notaTrab;
	}
	public double getRecupera() {
		return recupera;
	}
	public void setRecupera(double recupera) {
		this.recupera = recupera;
	}
	public double getBimestre() {
		return bimestre;
	}
	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}
	
	
	//MÉTODOS OPERACIONAIS
	
	public  void notaBimestre(double bimestre) {
		bimestre = (this.nota1 + this.nota2 + this.notaTrab)/3;

	}
	
		
}
