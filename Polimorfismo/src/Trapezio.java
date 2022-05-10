
public class Trapezio extends FiguraGeometrica {

	public Trapezio (int Base, int Altura) {
		
		super(Base, Altura);
		
	}
	
	public int Area() {
		
		int entArea;
		entArea = super.Area()/2;
		return entArea;
		
	}
}
