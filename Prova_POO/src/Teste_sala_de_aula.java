import java.util.Scanner;
public class Teste_sala_de_aula {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Sala_de_aula sala12 = new Sala_de_aula(12,70f);
		Turma turma1 = new Turma("8h as 12h", "Manha");
		Professor professor1 = new Professor("Manha");
		
		
		//sala12
		
		System.out.printf("Digite o numero da sala:");
		sala12.setNumero(ler.nextInt());
		
		System.out.printf("Digite a quantidade de cadeiras da sala:");
		sala12.setQuant_cadeiras(ler.nextInt());
		
		//turma1
		
		System.out.printf("Digite a idade media da turma:");
		turma1.setIdade_media(ler.nextInt());
		
		System.out.printf("Digite a nota media da turma:");
		turma1.setNota_media(ler.nextInt());
		
		System.out.printf("Digite a quantidade de alunos da turma:");
		turma1.setQuant_aluno(ler.nextInt());
		
		turma1.setTurma_sala(sala12);		
		
		
		//professor1
		
		System.out.printf("Digite o nome do professor:");
		professor1.setNome(ler.next());
		
		System.out.printf("Digite a matricula do professor:");
		professor1.setMatricula(ler.nextInt());
		
		System.out.printf("Digite a materia do professor:");
		professor1.setMateria(ler.next());
		
		professor1.setProfessor_turma(turma1);
		
		//metodo mostrar disciplina
		professor1.mostrar_disciplina();
		
		//saida de dados da relação de professor e turma
		professor1.RelacaoProfessorTurma();;
		
		//saida de dados da relação de turma e sala
		turma1.RelacaoTurmaSala();
		
		ler.close();
	}

}
