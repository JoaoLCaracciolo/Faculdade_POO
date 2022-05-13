
public class Sala_de_aula {
	
	private int quant_cadeiras;
	private double tamanho;
	private int numero;
	private int quant_lampada;
	
	
	public Sala_de_aula(int lampada,float tamanho) {
		
		this.quant_lampada = lampada;
		this.tamanho = tamanho;
	}
	
	public int getQuant_cadeiras() {
		return quant_cadeiras;
	}
	public void setQuant_cadeiras(int quant_cadeiras) {
		this.quant_cadeiras = quant_cadeiras;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuant_lampada() {
		return quant_lampada;
	}
	public void setQuant_lampada(int quant_lampada) {
		this.quant_lampada = quant_lampada;
	}
	
}
