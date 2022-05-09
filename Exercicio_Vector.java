
import java.util.*;

public class Exercicio_Vector {
	
	public static void main(String[] args) {
		
		Vector<Alunos> Aluno = new Vector<Alunos>();
		
		Alunos Aluno1 = new Alunos();
		
		Aluno1.Mat = 22;
		Aluno1.P_nome = "Beatriz";
		Aluno1.N1 = 9.8;
		Aluno1.N2 = 8.9;
		
		//Passando os dados do Alunos para o vector
		Aluno.add(Aluno1);
	
		//criando o array de alunos com base no tamanho do vector Alunos
		Alunos[] AlunoArray = new Alunos[Aluno.size()];
		
		//copiar o vector para array 
		Aluno.copyInto(AlunoArray);
		
		
		System.out.println("Mat:"+AlunoArray[0].Mat+"\nP_nome:"+AlunoArray[0].P_nome+"\nN1:"+AlunoArray[0].N1+"\nN2:"+AlunoArray[0].N2);
		
		
	}

}
