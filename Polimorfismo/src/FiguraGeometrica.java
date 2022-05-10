
public class FiguraGeometrica {

	private int Base, Altura;
	
	public FiguraGeometrica(int entBase, int entAltura) {
		
		this.Base = entBase;
		this.Altura = entAltura;
		
	}
	
	public int Area() {
		
		int area;
		area = (Base*Altura);
		return area;
		
	}
	
}
