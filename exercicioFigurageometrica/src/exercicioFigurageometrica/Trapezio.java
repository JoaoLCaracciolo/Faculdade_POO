package exercicioFigurageometrica;

public final class Trapezio extends Figurageometrica {

	public Trapezio(float ftlBase, float ftlAltura){	
		super(ftlBase, ftlAltura);
	}
	public final float Area(){
		float area;
		area = (super.Area())/2;
		return area;
		}
	
}
