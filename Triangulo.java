package exercicioFigurageometrica;

public final class Triangulo extends Figurageometrica {

	public Triangulo(float ftlBase, float ftlAltura){

		super(ftlBase, ftlAltura);
		
	}
	public final float Area(){	
		float area;
		area = (super.Area())/2;
		return area;
		}
	
}
