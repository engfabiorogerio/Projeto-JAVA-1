package java01.executavel;

import javax.swing.JOptionPane;

import java01.Classes.Aluno;

public class Executavel {

	public static void main(String[] args) {
		JOptionPane.showInternalMessageDialog(null, "PROGRAMA MÉDIA NOTA");
		System.out.println("************PROGRAMA MÉDIA NOTA*********************");
		System.out.println("____________________________________________________");
		
		Aluno aluno = new Aluno();
		
		aluno.setNomeAluno(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		System.out.println("Nome do Aluno: "+aluno.getNomeAluno());

	}

}
