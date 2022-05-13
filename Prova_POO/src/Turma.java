
public class Turma {

	private int quant_aluno;
	private String horario_aula;
	private double nota_media;
	private double idade_media;
	private String turno;
	private Sala_de_aula turma_sala;
	
	public Turma(String horario,String turno) {
		
		this.horario_aula = horario;
		this.turno = turno;
	
	}
	
	public void RelacaoTurmaSala() {
		System.out.println("\n\n---Relação Turma Sala---");
		System.out.printf("Quantidade de cadeiras %d\n",this.turma_sala.getQuant_cadeiras());
		System.out.printf("Numero da sala %d\n",this.turma_sala.getNumero());
		System.out.printf("Quantidade de lampadas %d\n",this.turma_sala.getQuant_lampada());
		System.out.printf("Tamanho da sala %2f",this.turma_sala.getTamanho());
		

	}
	
	
	public int getQuant_aluno() {
		return quant_aluno;
	}
	public void setQuant_aluno(int quant_aluno) {
		this.quant_aluno = quant_aluno;
	}
	public String getHorario_aula() {
		return horario_aula;
	}
	public void setHorario_aula(String horario_aula) {
		this.horario_aula = horario_aula;
	}
	public double getNota_media() {
		return nota_media;
	}
	public void setNota_media(double nota_media) {
		this.nota_media = nota_media;
	}
	public double getIdade_media() {
		return idade_media;
	}
	public void setIdade_media(double idade_media) {
		this.idade_media = idade_media;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Sala_de_aula getTurma_sala() {
		return turma_sala;
	}
	public void setTurma_sala(Sala_de_aula turma_sala) {
		this.turma_sala = turma_sala;
	}
}
