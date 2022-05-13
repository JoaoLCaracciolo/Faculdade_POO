
public class Professor {
	
	private String nome;
	private String materia;
	private String turno;
	private int matricula;
	private Turma professor_turma;
	

	public void RelacaoProfessorTurma() {
		System.out.println("---Relação Professor turma---");
		System.out.printf("Horario da turma %s\n",this.professor_turma.getHorario_aula());
		System.out.printf("Turno %s\n",this.professor_turma.getTurno());
		System.out.printf("Idade media da turma %2f\n",this.professor_turma.getIdade_media());
		System.out.printf("Nota media da turma %2f\n",this.professor_turma.getNota_media());
		System.out.printf("Quantidade de alunos %d\n",this.professor_turma.getQuant_aluno());

	}
	
	//mostrar disciplina
	public void mostrar_disciplina() {
		
		System.out.printf("\nA materia do professor %s é %s\n\n",this.nome,this.materia);
		
	}
	
	//constructor
	public Professor(String turno){
		
		this.turno = turno;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Turma getProfessor_turma() {
		return professor_turma;
	}
	public void setProfessor_turma(Turma professor_turma) {
		this.professor_turma = professor_turma;
	}

}
